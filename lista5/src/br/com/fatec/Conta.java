package br.com.fatec;

public class Conta {
	private String nomeProprietario;
	private double valor;
	
	public Conta(String nome, double valor) {
		this.nomeProprietario = nome;
		this.valor = valor;
	}
	public String getNomeProprietario() {
		return nomeProprietario;
	}
	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
