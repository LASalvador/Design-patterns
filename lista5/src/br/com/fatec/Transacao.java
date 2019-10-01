package br.com.fatec;

public class Transacao {
	private Conta origem, destino;
	private String data;
	private double valor;
		
	public Transacao(Conta origem, Conta destino, double valor) {
		this.origem = origem;
		this.destino = destino;
		this.valor = valor;		
	}
	
	public Conta getOrigem() {
		return origem;
	}
	public void setOrigem(Conta origem) {
		this.origem = origem;
	}
	public Conta getDestino() {
		return destino;
	}
	public void setDestino(Conta destino) {
		this.destino = destino;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
