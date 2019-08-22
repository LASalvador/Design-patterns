package br.com.fatec;

public class Carga extends Veiculo {
	
	public int numEixo;
	public double valCarga;

	public Carga(String categoria, int numEixo, double valCarga) {
		super(categoria);
		this.numEixo = numEixo;
		this.valCarga = valCarga;
	}

}
