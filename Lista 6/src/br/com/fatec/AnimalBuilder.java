package br.com.fatec;

public class AnimalBuilder {
	
	private Bovino bovino;
	private Suino suino;
	
	public AnimalBuilder iniciarBovino() {
		bovino = new Bovino();
		return this;
	}
	
	public AnimalBuilder bovinocomSexo (char sexo) {
		bovino.setSexo(sexo);
		return this;
	}
	
	public AnimalBuilder bovinocomNovilho (boolean novilho) {
		bovino.setNovilho(novilho);
		return this;
	}
	
	public AnimalBuilder bovinoComKg(double peso) {
		PesoBuilder pb = new PesoBuilder().iniciar().comKg(peso);
		Peso p = pb.criarPeso();
		this.bovino.setPeso(p);
		return this;
	}

	public AnimalBuilder bovinoComArroba(double peso) {
		PesoBuilder pb = new PesoBuilder().iniciar().comArroba(peso);
		Peso p = pb.criarPeso();
		this.bovino.setPeso(p);
		return this;
	}
	
	public Bovino criarBovino() {
		return this.bovino;
	}

	public AnimalBuilder iniciarSuino() {
		suino = new Suino();
		return this;
	}
	
	public AnimalBuilder suinoComKg(double peso) {
		PesoBuilder pb = new PesoBuilder().iniciar().comKg(peso);
		Peso p = pb.criarPeso();
		this.suino.setPeso(p);
		return this;
				
	}
	
	public AnimalBuilder suinoComArroba(double peso) {
		PesoBuilder pb = new PesoBuilder().iniciar().comArroba(peso);
		Peso p = pb.criarPeso();
		this.suino.setPeso(p);
		return this;
	}
	
	public Suino criarSuino() {
		return this.suino;
	}
}
