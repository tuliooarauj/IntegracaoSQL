package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Cidade;

public class DAOCidade {

    public static boolean atualizarCidade(Cidade c) {
        ConexaoMySql.createConnection();
        String sql = "UPDATE cidade SET nome='" + c.getNome() + "', estado='" + c.getEstado() + "' WHERE id=" + c.getId();
        return ConexaoMySql.atualizar(sql);
    }

    public static boolean deletarCidade(Cidade c) {
        ConexaoMySql.createConnection();
        String sql = "DELETE FROM cidade WHERE id=" + c.getId();
        return ConexaoMySql.atualizar(sql);
    }

    public static boolean inserirCidade(Cidade c) {
        ConexaoMySql.createConnection();
        String sql = "INSERT INTO cidade (nome, estado) VALUES ('" + c.getNome() + "', '" + c.getEstado() + "')";
        return ConexaoMySql.atualizar(sql);
    }

    public static List<Cidade> listarCidades() {
        ConexaoMySql.createConnection();
        String sql = "SELECT * FROM cidade";
        ConexaoMySql.selecionar(sql);

        List<Cidade> lista = new ArrayList<>();

        try {
            while (ConexaoMySql.resultset.next()) {
                Cidade c = new Cidade();
                c.setId(ConexaoMySql.resultset.getInt("id"));
                c.setNome(ConexaoMySql.resultset.getString("nome"));
                c.setEstado(ConexaoMySql.resultset.getString("estado"));

                lista.add(c);
            }
        } catch (SQLException ex) {
            System.out.println("ERRO ao percorrer o resultset no método listar");
        }

        return lista;
    }

}
