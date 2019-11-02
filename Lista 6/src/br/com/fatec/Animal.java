package br.com.fatec;

public abstract class Animal {
	private Peso peso;
	
	public Peso getPeso() {
		return this.peso;
	}

	public void setPeso (Peso peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Peso" + peso.getKg();
	}
}
