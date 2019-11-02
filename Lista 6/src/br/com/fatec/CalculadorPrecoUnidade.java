package br.com.fatec;

public class CalculadorPrecoUnidade extends CalcularPreco {
	private Animal animal;
	
	public CalculadorPrecoUnidade(Animal animal, String unidadeDePeso) {
		super(unidadeDePeso);
		this.animal = animal;
	}

	@Override
	public void calcularPreco() {
		if(this.unidadeDePeso.equals("KG") || this.unidadeDePeso.equals("kg")) {
			System.out.println(this.calcularPrecoKg(this.animal));
		} else {
			System.out.println(this.calcularPrecoArroba(this.animal));
		}
	}

}
