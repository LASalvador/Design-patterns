package br.com.fatec.model;

public class Veiculo {
	private String modelo;
	private String anoFabricacao;
	private String numPlaca;
	private double valor;
	
	public Veiculo(String modelo, String anoFabricacao, String numPlaca, double valor) {
		setModelo(modelo);
		setAnoFabricacao(anoFabricacao);
		setNumPlaca(numPlaca);
		setValor(valor);
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public String getModelo(){
		return this.modelo;
	}
	
	public void setAnoFabricacao(String anoFabricacao){
		this.anoFabricacao = anoFabricacao;
	}
	
	public String getAnoFabricacao(){
		return this.anoFabricacao;
	}

	public void setValor(double valor){
		this.valor = valor;
	}
	
	public double getValor(){
		return this.valor;
	}
	public void setNumPlaca(String numPlaca){
		this.numPlaca = numPlaca;
	}
	
	public String getNumPlaca(){
		return this.numPlaca;
	}
	
	@Override
	public String toString() {
		return this.modelo + "-" + this.anoFabricacao + "-" + this.numPlaca + "-" + this.valor;
	}
}
