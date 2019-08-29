package br.com.fatec;

public class CalculadorDescontoBruto implements CalculadorDesconto  {
	Produto p;
	public CalculadorDescontoBruto(Produto p) {
		this.p = p;
	}

	@Override
	public double calcularDesconto() {
		// TODO Auto-generated method stub
		if(this.p.getDesconto().getValorDesconto() > 100) {
			return this.p.getValorProduto(); 
		}
		return this.p.getValorProduto() - this.p.getDesconto().getValorDesconto();
	}

}
