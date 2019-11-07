package br.com.fatec.model;

import java.util.Date;

public class Cliente {
	private String nome;
	private int idade;
	private String genero;
	private String telefone;
	private Date dataNasc;
	
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

	public void setdataNasc (Date dataNasc){
		this.dataNasc = dataNasc;
	}
	
	public Date getdataNasc(){
		return this.dataNasc;
	}



}
