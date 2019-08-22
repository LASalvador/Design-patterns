package br.com.fatec;

public class Produto {
	protected String nome;
	protected double valorProduto;
	protected Desconto desconto;
	protected CalculadorPreco calPreco;
	protected String descricao;
	
	public Produto() {

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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
