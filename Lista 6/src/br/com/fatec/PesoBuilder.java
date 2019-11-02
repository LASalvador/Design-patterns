package br.com.fatec;

public class PesoBuilder {
	
	private Peso alvo;
	
	public PesoBuilder iniciar() {
		alvo = new Peso();
		return this;
	}
	
	public PesoBuilder comKg(double kg) {
		alvo.setKg(kg);
		alvo.adicionarPesoEmArroba();
		return this;
	}
	
	public PesoBuilder comArroba(double Arroba) {
		alvo.setArroba(Arroba);
		alvo.adicionarPesoEmKg();
		return this;
	}
	
	public Peso criarPeso() {
		return alvo;
	}

}
