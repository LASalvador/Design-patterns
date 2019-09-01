package br.com.fatec;

public class Produto {
	protected String nome;
	protected double valorProduto;
	private String descricao;
	
	public Produto(String nome, double valorProduto) {
		this.nome = nome;
		this.valorProduto = valorProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
