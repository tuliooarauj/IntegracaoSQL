package model;

public class Hospede {

	private int id;
	private String nome;
	private String cpf;
	private String numero_telefone;
	
	public Hospede() {
	}
	
	public Hospede(int id, String nome, String cpf, String numero_telefone) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.numero_telefone = numero_telefone;
	}
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNumero_telefone() {
		return numero_telefone;
	}

	public void setNumero_telefone(String numero_telefone) {
		this.numero_telefone = numero_telefone;
	}
	
	
	
	
}
