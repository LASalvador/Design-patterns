package br.com.fatec.services;

import br.com.fatec.model.Cliente;

public class ClienteService extends Services{ 
	
	public void criarCliente(String cliente) {
		String[] dadosCliente = this.handlerDados.PadraoParaCliente(cliente);
		Cliente c = new Cliente(dadosCliente[0],Integer.parseInt(dadosCliente[1]), dadosCliente[2], dadosCliente[3], dadosCliente[4]);
	}
}
