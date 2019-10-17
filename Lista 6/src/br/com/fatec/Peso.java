package br.com.fatec;

public class Peso implements Constantes {
	private double kg;
	private double arroba;
	
	public double getKg() {
		return this.kg;
	}

	public void setKg (double kg) {
		this.kg = kg;
	}
	
	public double getArroba() {
		return this.arroba;
	}
	
	public void setArroba(double arroba) {
		this.arroba = arroba;
	}
	
	public void converterKgEmArroba() {
		this.arroba = this.kg / kgEquivalenteArroba;
	}
	
	public void converterArrobaEmKg() {
		this.kg = kgEquivalenteArroba * this.arroba;
	}
	
	
}
