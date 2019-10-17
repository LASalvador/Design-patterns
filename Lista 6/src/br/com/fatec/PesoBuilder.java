package br.com.fatec;

public class PesoBuilder {
	
	private Peso alvo;
	
	public Peso iniciar() {
		alvo = new Peso();
		return alvo;
	}
	
	public void comKg(double kg) {
		alvo.setKg(kg);
		alvo.converterKgEmArroba();
	}
	
	public void comArroba(double Arroba) {
		alvo.setArroba(Arroba);
		alvo.converterArrobaEmKg();
	}
	
	public Peso criarPeso() {
		return alvo;
	}

}
