package br.com.fatec;

public class CalculadorPreco {
	Produto p;
	CalculadorDesconto c;
	public CalculadorPreco(Produto p) {
		this.p = p;
	}
	public double calcularDesconto() {
		if (p.getDesconto().getTipo() == 1) {
			this.c = new CalculadorDescontoBruto(p);
		} else {
			this.c = new CalculadorDescontoPorcetagem(p);
		}
	
		
		return c.calcularDesconto();
	}
}
