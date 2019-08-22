package br.com.fatec;

public class ContaEstacionamento {
	private double inicio;
	private double fim;
	private CalculoValor calculoValor;
	private Veiculo veiculo;
	private Long duracao;
	private double taxa;
	public int tipo;
	
	
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
		if(this.tipo == 1) {
			if(veiculo instanceof Passeio ) {
				
				if(veiculo.categoria == "D") {
					this.taxa = 3.00;
				}
				else {
					this.taxa = 2;
				}
			}
			
			else if(veiculo instanceof Carga) {
				
				this.taxa = 4.00 * veiculo.numEixo + (veiculo.valCarga * 0.10);
			}
			
		}
		
		else if(this.tipo == 2) {
			if(veiculo instanceof Passeio ) {
				
				if(veiculo.categoria == "D") {
					this.taxa = 25.00;
				}
				else {
					this.taxa = 20;
				}
			}
			
			else if(veiculo instanceof Carga) {

				this.taxa = 35.00 * veiculo.numEixo + (veiculo.valCarga * 0.10);
				
			}
			
		}
		
		else if (this.tipo == 3) {
			if(veiculo instanceof Passeio ) {
				
				if(veiculo.categoria == "D") {
					this.taxa = 150.00;
				}
				else {
					this.taxa = 100;
				}
			}
			
			else if(veiculo instanceof Carga) {
				
				this.taxa = 200.00 * veiculo.numEixo + (veiculo.valCarga * 0.10);
			
			}
			
		}
	}
}

// Definir valores p dia e mes
// Definir regras p veiculos