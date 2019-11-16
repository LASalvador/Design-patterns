package br.com.fatec.model;

public class Relatorio {
	public int idCliente;
	public int idServico;
	
	public Relatorio(int idCliente, int idServico) {
		setIdCliente(idCliente);
		setIdServico(idServico);
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getIdServico() {
		return idServico;
	}
	public void setIdServico(int idServico) {
		this.idServico = idServico;
	}

}
