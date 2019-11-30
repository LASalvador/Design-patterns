package br.com.fatec.services;

import br.com.fatec.model.Cliente;

public class ClienteService extends Services {
	
	public Cliente contruirCliente(String clienteDados) {
		String[] dados = this.handlerDados.padraoParaCliente(clienteDados);
		Cliente cliente = new Cliente(dados[0], dados[1], dados[2], dados[3], dados[4]);
		return cliente;
	}
	
	public String[] construiAuth(String auth) {
		return this.handlerDados.padraoParaAuth(auth);
	}
	
}
