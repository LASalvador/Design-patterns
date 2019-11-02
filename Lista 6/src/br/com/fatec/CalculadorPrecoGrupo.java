package br.com.fatec;

public class CalculadorPrecoGrupo extends CalcularPreco {
	
	private AnimalGroup animais;
	public CalculadorPrecoGrupo(AnimalGroup animais, String unidadeDeMedida) {
		super(unidadeDeMedida);
		this.animais = animais;
	}
	@Override
	public void calcularPreco() {
		for (Animal animal : this.animais.getAnimais()) {
			if(this.unidadeDePeso.equals("KG") || this.unidadeDePeso.equals("kg")) {
				System.out.println(this.calcularPrecoKg(animal));
			} else {
				System.out.println(this.calcularPrecoArroba(animal));
			}
		}
	}
}	
