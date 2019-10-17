package br.com.fatec;

public class Bovino extends Animal {
	private char sexo;
	private boolean novilho;
	
	public char getSexo() {
		return this.sexo;
	}

	public void setSexo (char sexo) {
		this.sexo = sexo;
	}
	
	public boolean getNovilho() {
		return this.novilho;
	}

	public void setNovilho (boolean novilho) {
		this.novilho = novilho;
	}
	
}
