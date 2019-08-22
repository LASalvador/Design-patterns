package br.com.fatec;

public class CalculadorPreco {
	Produto p;
	public CalculadorPreco(Produto p) {
		this.p = p;
	}
	public double calcularDesconto() {
		double valorDesconto;
		if (p.getDesconto().getTipo() == 1) {
			valorDesconto = p.getDesconto().getValorDesconto();
		} else {
			valorDesconto = p.getValorProduto() * p.getDesconto().getValorDesconto();
		}
		
		if(valorDesconto > p.getValorProduto()) {
			return p.getValorProduto();
		}
		
		double valorComDesconto = p.getValorProduto() - valorDesconto;
		
		return valorComDesconto;
	}
}
