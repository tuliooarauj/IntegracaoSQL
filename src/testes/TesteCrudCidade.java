package testes;

import controller.DAOCidade;
import model.Cidade;



public class TesteCrudCidade {
    public static void main(String[] args) {
        
        //LISTANDO AS CIDADES
        for(Cidade c : DAOCidade.listarCidades()){
            System.out.println("-----------------------------------");
            System.out.println("ID: " + c.getId());
            System.out.println("Nome: " + c.getNome());
            System.out.println("Estado: " + c.getEstado());
        }
        
        //TESTANDO INSERIR
        Cidade cid = new Cidade(0, "Glória", "Bahia");
        //DAOCidade.inserirCidade(cid);
        
        //TESTANDO ATUALIZAR 
        Cidade cid2 = new Cidade(3, "Glória", "Pernambuco");
        //DAOCidade.atualizarCidade(cid2);
        
        //TESTANDO DELETAR
        //DAOCidade.deletarCidade(cid2);
        
    }
}
