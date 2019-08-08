package br.com.fatec;

public class ContaEstacionamento {
	private double inicio;
	private double fim;
	private CalculoValor calculoValor;
	private Veiculo veiculo;
	private double duracao;
	private double valor;
	
	
	
	public ContaEstacionamento() {
		// TODO Auto-generated constructor stub
	}
	public void setCalculo(CalculoValor vl) {
		this.calculoValor = vl;
		
	}
	
	
	public double getInicio() {
		return inicio;
	}
	public void setInicio(double inicio) {
		this.inicio = inicio;
	}
	public double getFim() {
		return fim;
	}
	public void setFim(double fim) {
		this.fim = fim;
	}
	public CalculoValor getCalculoValor() {
		return calculoValor;
	}
	public void setCalculoValor(CalculoValor calculoValor) {
		this.calculoValor = calculoValor;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public void calcularDuracao() {
		this.duracao = this.fim  - this.inicio;
		
	}
	
	public void calcularValor() {
		if (v.tempo < (15 * 3600000)) {
//			cv = new ValorDiaria(c.getVeiculo().valor);
//
//		}
	}
}
