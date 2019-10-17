package br.com.fatec;

public class AnimalBuilder {
	
	private Animal alvo;
	private Bovino bovino;
	private Suino suino;
	
	public Animal iniciarBovino() {
		bovino = new Bovino();
		return bovino;
	}
	
	public void bovinocomSexo (char sexo) {
		bovino.setSexo(sexo);
	}
	
	public void bovinocomNovilho (boolean novilho) {
		bovino.setNovilho(novilho);
	}
	
	public Animal iniciarSuino() {
		suino = new Suino();
		return suino;
	}

}
