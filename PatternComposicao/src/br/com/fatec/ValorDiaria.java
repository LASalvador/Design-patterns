package br.com.fatec;

public class ValorDiaria implements CalculoValor {
	private final double dia = 86400000;
	private double valorDiaria;
	
	@Override
	public double valorConta(double duracao, Veiculo veiculo) {
		return this.valorDiaria * Math.ceil(duracao / dia);
	}
	
	public ValorDiaria(double valor) {
		this.valorDiaria = valor;
	}
}
