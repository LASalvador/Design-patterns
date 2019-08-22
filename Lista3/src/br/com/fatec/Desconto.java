package br.com.fatec;

public class Desconto {
	private double valorDesconto;
	private int tipo;
	
	public Desconto(double valorDesconto, int tipo) {
		if(tipo == 1) {
			this.valorDesconto = valorDesconto;
		} else {
			this.valorDesconto = valorDesconto / 100;
		}
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
}
