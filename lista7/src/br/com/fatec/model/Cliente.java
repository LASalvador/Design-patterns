package br.com.fatec.model;

public class Cliente {
	private String nome;
	private int idade;
	private String genero;
	private String telefone;
	private String dataNasc;

	public Cliente(String nome, int idade, String genero, String telefone, String dataNasc) {
		setNome(nome);
		setIdade(idade);
		setGenero(genero);
		setTelefone(telefone);
		setdataNasc(dataNasc);
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public int getIdade(){
		return this.idade;
	}
	
	public void setGenero(String genero){
		this.genero = genero;
	}
	
	public String getGenero(){
		return this.genero;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	public String getTelefone(){
		return this.telefone;
	}

	public void setdataNasc (String dataNasc){
		this.dataNasc = dataNasc;
	}
	
	public String getdataNasc(){
		return this.dataNasc;
	}



}
