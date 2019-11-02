package br.com.fatec;

public class Cotacao {
	protected double valor;
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void pegarCotacaoBoi() {
		this.setValor(160);
	}
	
	public void pegarCotacaoVaca() {
		this.setValor(145);
	}
	
	public void pegarCotacaoNovilho() {
		this.setValor(150);
	}
	
	public void pegarCotacaoSuino() {
		this.setValor(75);
	}
	
	
}
