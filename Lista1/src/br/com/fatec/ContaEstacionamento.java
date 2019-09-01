package br.com.fatec;

public class ContaEstacionamento {
	private double inicio;
	private double fim;
	private CalculoValor calculoValor;
	private Veiculo veiculo;
	private Long duracao;
	private double taxa;
	private CalculoTaxa calculoTaxa;
	
	
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
		this.duracao = (long) (this.fim - this.inicio);
	}
	public double calcularValor() {
//		System.out.println(this.duracao);
		if (this.duracao <= (12 * 3600000)) {
			this.calculoValor = new ValorHora(this.taxa);
		} 
		else if(this.duracao <= (15 * 86400000)){
			this.calculoValor = new ValorDiaria(this.taxa);
		} else {
			this.calculoValor = new ValorMensal(this.taxa);
		}

		return calculoValor.valorConta(this.duracao);
	}
	
	public void setTaxa() {
		if(this.duracao <= (12 * 3600000)) {
			this.calculoTaxa = new TaxaDia();
		}
		
		else if(this.duracao <= (15 * 86400000)) {
			this.calculoTaxa = new TaxaHora();
		}
		
		else {
			this.calculoTaxa = new TaxaMes();
		}
		
		this.taxa = calculoTaxa.calcularTaxa(this.veiculo);
	}
}