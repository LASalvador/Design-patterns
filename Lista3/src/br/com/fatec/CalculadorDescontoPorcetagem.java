package br.com.fatec;

public class CalculadorDescontoPorcetagem implements CalculadorDesconto {
	@Override
	public double calcularDesconto(double valorProduto, double valorDesconto) {
		// TODO Auto-generated method stub
		if(valorDesconto > 1) return valorProduto;
		
		return valorProduto - (valorProduto * valorDesconto);
	}

}
