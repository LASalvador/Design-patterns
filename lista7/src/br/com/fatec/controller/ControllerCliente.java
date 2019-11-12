package br.com.fatec.controller;

import br.com.fatec.view.ViewCliente;
import br.com.fatec.services.ClienteService;

public class ControllerCliente {
	
	ViewCliente viewcliente;
	ClienteService clienteService;
	public ControllerCliente() {
		viewcliente = new ViewCliente();
		clienteService = new ClienteService();
	}
	public void criarCliente() {
		String cliente = viewcliente.criacaoCliente();
		clienteService.criarCliente(cliente);
		viewcliente.msgSucesso("Cliente criado");
	}
}
