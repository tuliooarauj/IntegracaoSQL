package testes;

import controller.DAOHospede;
import model.Hospede;

public class TesteCrudHospedes {
	
	public static void main(String[] args) {
		
		for(Hospede h : DAOHospede.listarHospedes()) {
			System.out.println("----------------------------------------------------------------------");
			System.out.print("ID: "+h.getId()+" / ");
			System.out.print("Nome: "+h.getNome()+" / ");
			System.out.print("CPF: "+h.getCpf()+" / ");
			System.out.println("Número de telefone: "+h.getNumero_telefone());
		}
		
		Hospede h = new Hospede(9, "Henrique", "10398866784", "(75)983448674");
		//DAOHospede.inserirHospede(h);
		
		Hospede h1 = new Hospede(9, "Fabiano", "10299923412", "(21)985689712");
		//DAOHospede.atualizarHospede(h1);
		
		Hospede h2 = new Hospede(12, " ", " ", " ");
	//	DAOHospede.deletarHospede(h2);
		
		
		
		
	}

	
}
