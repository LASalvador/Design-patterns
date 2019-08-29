package br.com.fatec;

public class CalculadorDescontoPorcetagem implements CalculadorDesconto {
	Produto p;
	public CalculadorDescontoPorcetagem(Produto p) {
		this.p = p;
	}
	@Override
	public double calcularDesconto() {
		// TODO Auto-generated method stub
		if(this.p.getDesconto().getValorDesconto() > 1) return this.p.getValorProduto();
		
		return this.p.getValorProduto() - (this.p.getValorProduto() * this.p.getDesconto().getValorDesconto());
	}

}
