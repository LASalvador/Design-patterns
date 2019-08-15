package br.com.fatec;

public abstract class Veiculo {

	public String categoria;
	public double numEixo;
	public double valCarga;

	public Veiculo(String categoria ) {
		 this.categoria = categoria; 
	}
}