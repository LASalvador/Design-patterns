package br.com.fatec;

public class Peso {
	private double kg;
	private double arroba;
	private double kgEquivalenteArroba = 15;
	
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
	
	public void adicionarPesoEmArroba() {
		this.arroba = this.kg / kgEquivalenteArroba;
	}
	
	public void adicionarPesoEmKg() {
		this.kg = kgEquivalenteArroba * this.arroba;
	}
	
	
}
