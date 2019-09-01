package br.com.fatec;

public class CalculadorPreco {
	private Produto p;
	private Desconto d;
	private CalculadorDesconto c;
	public CalculadorPreco(Produto p, Desconto d) {
		this.p = p;
		this.d = d;
	}
	protected double calcularDesconto() {
		if (d.getTipo() == 1) {
			this.c = new CalculadorDescontoBruto();
		} else {
			this.c = new CalculadorDescontoPorcetagem();
		}
	
		
		return c.calcularDesconto(p.getValorProduto(), d.getValorDesconto());
	}	
	public double calcularPreco() {
		this.p.setValorProduto(this.calcularDesconto());
		return p.getValorProduto();
	}
}
