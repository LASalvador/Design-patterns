package br.com.fatec;

public class ValorMensal implements CalculoValor {
	private final double mes = 2592E6;
	private double valorMensal;
	@Override
	
	public double valorConta(double duracao, Veiculo veiculo) {
		return  this.valorMensal * Math.ceil(duracao / mes); 
	}
	
	public ValorMensal(double valor) {
		this.valorMensal = valor;
	}
}