package br.com.fatec.services;

public class HandlerDados {
	public String clienteParaPadrao(String nomeCliente, String idadeCliente, String generoCliente, String telefoneCliente, String dataNasCliente) {
		return nomeCliente + "!" + idadeCliente + "!" + generoCliente +"!"+ telefoneCliente + "!" + dataNasCliente;
	}
	public String[] padraoParaCliente(String cliente) {
		return cliente.split("!");
	}
	
	public String servicoParaPadrao(String nomeServico, String descricaoServico, double valorServico) {
		return nomeServico + "!" + descricaoServico + "!" + valorServico; 
	}
	
	public String[] padraParaServico(String servico) {
		return servico.split("!");
	}
}
