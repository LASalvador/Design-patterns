package br.com.fatec;

public class ValorHora implements CalculoValor {
	private final double hora = 3600000;
	private double valorHora;
	@Override
	public double valorConta(double duracao) {
		return this.valorHora * Math.ceil(duracao / hora);
	}
	
	public ValorHora(double valor) {
		this.valorHora = valor;
	}
}
