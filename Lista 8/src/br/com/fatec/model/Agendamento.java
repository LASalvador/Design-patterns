package br.com.fatec.model;

public class Agendamento {
	private String nomeCliente;
	private String dataAgendamento;
	private String modelo;
	private String descricao;
	private String placa;
	
	public Agendamento(String nome, String data, String descricao, String placa) {
		setNomeCliente(nome);
		setDataAgendamento(data);
		setDescricao(descricao);
		setPlaca(placa);
	}
	
	public Agendamento(String nome, String data, String descricao, String placa, String modelo) {
		setNomeCliente(nome);
		setDataAgendamento(data);
		setDescricao(descricao);
		setPlaca(placa);
		setModelo(modelo);
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getDataAgendamento() {
		return dataAgendamento;
	}
	public void setDataAgendamento(String dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	@Override
	public String toString() {
		return nomeCliente + "-" + dataAgendamento + "-" + modelo + "-" + descricao + "-" + placa; 
	}
}
