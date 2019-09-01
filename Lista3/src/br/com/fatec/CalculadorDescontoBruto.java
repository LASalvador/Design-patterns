package br.com.fatec;

public class CalculadorDescontoBruto implements CalculadorDesconto  {
		@Override
	public double calcularDesconto(double valorProduto, double valorDesconto) {
		// TODO Auto-generated method stub
		if(valorDesconto > 100) {
			return valorProduto; 
		}
		return valorProduto - valorDesconto;
	}

}
