package br.com.fatec.model;

public class Cliente {
	private String nome;
	private String telefone;
	private String cpf;
	private String endereco;
	
	public Cliente(String nome, String telefone, String endereco, String cpf) {
		setNome(nome);
		setTelefone(telefone);
		setCpf(cpf);
		setEndereco(endereco);
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}

	public String getTelefone(){
		return this.telefone;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	
	public String getCpf(){
		return this.cpf;
	}

	public void setEndereco (String endereco){
		this.endereco = endereco;
	}
	
	public String getEndereco(){
		return this.endereco;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  this.nome + "-" + this.telefone + "-" + this.cpf + "-" + this.endereco; 
	}

}
