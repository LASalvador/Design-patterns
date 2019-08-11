package br.com.fatec;

public class ContaEstacionamento {
	private double inicio;
	private double fim;
	private CalculoValor calculoValor;
	private Veiculo veiculo;
	private double duracao;
	
	
	
	public ContaEstacionamento() {
		// TODO Auto-generated constructor stub
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
		this.duracao = this.fim - this.inicio;
	}
	public void calcularValor() {

		if (this.duracao <= (12 * 3600000)) {
			this.calculoValor = new ValorHora(c.getVeiculo().valor);
		} 
		else if(this.duracao <= (15 * 86400000)){
			this.calculoValor = new ValorDiaria(c.getVeiculo().valor);
		} else {
			this.calculoValor = new ValorMensal(c.getVeiculo().valor);
		}

		return calculoValor.valorConta(this.duracao);
	}
}

// Definir valores p dia e mes
// Definir regras p veiculos