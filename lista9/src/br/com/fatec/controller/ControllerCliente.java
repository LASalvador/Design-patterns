package br.com.fatec.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.controller.view.ViewCliente;
import br.com.fatec.model.Cliente;
import br.com.fatec.services.ClienteService;

public class ControllerCliente extends Controller {
	
	private ClienteService clienteService;
	private ViewCliente viewCliente;
	
	public ControllerCliente() {
		this.clienteService = new ClienteService();
		this.viewCliente = new ViewCliente();
	}
	
	public int criarCliente() {
		String clienteDados = this.viewCliente.criarCliente();
		Cliente cliente = this.clienteService.contruirCliente(clienteDados);
		this.connect.inserirCliente(cliente);
		ResultSet rs = this.connect.pegarUltimoId();
		int id = this.clienteService.retornarId(rs);
		double valor = this.viewCliente.pegarValorContra();
		this.connect.inserirConta(id, valor);
		this.viewCliente.msgSucesso("Cadastro Realizado");
		rs = this.connect.pegarUltimoId();
		int idConta = this.clienteService.retornarId(rs);
		return idConta;
	}

	public int logar() {
		String dadosAuth = this.viewCliente.logar();
		String[] dados = this.clienteService.construiAuth(dadosAuth);
		ResultSet rs = this.connect.verificarCliente(dados[0], dados[1]);
		int idCliente = this.clienteService.retornarId(rs);
		rs = this.connect.pegarIdContaPelaUsuario(idCliente);
		int idConta = this.clienteService.retornarId(rs);
 		this.viewCliente.msgSucesso("Login realizado");
		return idConta;
	}

}
