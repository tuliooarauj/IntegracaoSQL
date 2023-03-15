package controller;

import model.Hospede;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOHospede {

	public static boolean atualizarHospede(Hospede h) {
		ConexaoMySql.createConnection();
		String sql = "UPDATE hospede SET nome = ' "+h.getNome()+" ', cpf = ' "+h.getCpf()
		+" ', numero_telefone = '"+h.getNumero_telefone()+"' WHERE (id = '"+h.getId()+"')";
		return ConexaoMySql.atualizar(sql);
	}
	
	public static boolean deletarHospede(Hospede h) {
		ConexaoMySql.createConnection();
		String sql = "DELETE FROM hospede WHERE (id = '"+h.getId()+"')";

		return ConexaoMySql.atualizar(sql);
	}
	
	public static boolean inserirHospede(Hospede h) {
		ConexaoMySql.createConnection();
		String sql = "INSERT INTO hospede (nome, cpf, numero_telefone) VALUES ('"+h.getNome()+"', '"+h.getCpf()+"', '"+h.getNumero_telefone()+"')";
		return ConexaoMySql.atualizar(sql);
	}
	
	public static List<Hospede> listarHospedes(){
		ConexaoMySql.createConnection();
		String sql = "SELECT * FROM db_managehotel.hospede";
		 ConexaoMySql.selecionar(sql);
		 
		 List<Hospede> listaHospedes = new ArrayList<>();
		 
		 try {
			 while(ConexaoMySql.resultset.next()) {
				 Hospede h = new Hospede();
				 h.setId(ConexaoMySql.resultset.getInt("id"));
				 h.setNome(ConexaoMySql.resultset.getString("nome"));
				 h.setCpf(ConexaoMySql.resultset.getString("cpf"));
				 h.setNumero_telefone(ConexaoMySql.resultset.getString("numero_telefone"));
				 
				 listaHospedes.add(h);
			 }
		 }catch(SQLException ex) {
				 System.out.println("ERRO ao percorrer o método listar!");
			 }
		 
		 return listaHospedes;
	}
	
}
