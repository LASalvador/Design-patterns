package br.com.fatec.services;

public class HandlerDados {
	public String clienteParaPadrao(String nomeCliente, String idadeCliente, String generoCliente, String telefoneCliente, String dataNasCliente) {
		return nomeCliente + "!" + idadeCliente + "!" + generoCliente +"!"+ telefoneCliente + "!" + dataNasCliente;
	}
	public String[] PadraoParaCliente(String cliente) {
		return cliente.split("!");
	}
}
