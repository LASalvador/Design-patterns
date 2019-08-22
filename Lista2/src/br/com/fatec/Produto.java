package br.com.fatec;

public class Produto {
	private String nome;
	private double valorProduto;
	private Desconto desconto;
	private CalculadorPreco calPreco;
	
	public Produto(String nome, double valorProduto) {
		this.nome = nome;
		this.valorProduto = valorProduto;
	}
	public Desconto getDesconto() {
		return desconto;
	}
	public void setDesconto(Desconto desconto) {
		this.desconto = desconto;
	}
	public CalculadorPreco getCalPreco() {
		return calPreco;
	}
	public void setCalPreco(CalculadorPreco calPreco) {
		this.calPreco = calPreco;
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
	
	
	
}
