package br.com.fatec;

public abstract class CalcularPreco {
	protected String unidadeDePeso;
	
	public CalcularPreco(String unidadeDePeso) {
		this.unidadeDePeso = unidadeDePeso;
	}
	
	private double pegarCotacaoAtual(Animal animal) {
		Cotacao cot = new Cotacao();
		if(animal instanceof Bovino) {
			Bovino b = (Bovino) animal;
			if(b.getNovilho() == true){
				cot.pegarCotacaoNovilho();
			}
			else if(b.getSexo() == 'F' || b.getSexo() == 'f') {
				cot.pegarCotacaoVaca();
			}
			else {
				cot.pegarCotacaoBoi();
			}
		}
		
		else {
			
			cot.pegarCotacaoSuino();
		}
		
		return cot.getValor();
		
	}
	
	public double calcularPrecoKg(Animal animal) {
		return (this.pegarCotacaoAtual(animal) * animal.getPeso().getKg()) / 15;
	}
	
	public double calcularPrecoArroba(Animal animal) {
		return animal.getPeso().getArroba() * this.pegarCotacaoAtual(animal);
	}
	public abstract void calcularPreco();
}
