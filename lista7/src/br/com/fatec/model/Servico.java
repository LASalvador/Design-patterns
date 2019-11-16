package br.com.fatec.model;

public class Servico {
	private String nome;
	private String descricao;
	private int id;
	private double valor;
	
	public Servico(String nome, String descricao, double valor) {
		setNome(nome);
		setDescricao(descricao);
		setValor(valor);
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return this.id;
	}

	public void setValor(double valor){
		this.valor = valor;
	}
	
	public double getValor(){
		return this.valor;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	@Override
	public String toString() {
		return getNome() + "-" + getDescricao() + "-" + getValor();
	}
}
