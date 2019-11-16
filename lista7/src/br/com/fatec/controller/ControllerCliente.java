package br.com.fatec.controller;

import br.com.fatec.view.ViewCliente;

import java.sql.ResultSet;

import br.com.fatec.model.Cliente;
import br.com.fatec.model.ClienteGroup;
import br.com.fatec.services.ClienteService;

public class ControllerCliente extends Controller{
	
	ViewCliente viewcliente;
	ClienteService clienteService;
	
	public ControllerCliente() {
		viewcliente = new ViewCliente();
		clienteService = new ClienteService();
	}
	
	public void criarCliente() {
		String cliente = viewcliente.criacaoCliente();
		Cliente c = clienteService.criarCliente(cliente);
		this.connect.inserirCliente(c);
		viewcliente.msgSucesso("Cliente criado ");
	}
	
	public void listarTodosClientes() {
		ResultSet rs = this.connect.listarTodosCliente();
		ClienteGroup cg = this.clienteService.criarClienteGroup(rs);
		this.viewcliente.listarTodosCliente(cg);
	}
	
	public void listaCliente() {
		String nomeCliente = this.viewcliente.pesquisarCliente();
		ResultSet rs = this.connect.selecionarCliente(nomeCliente);
		Cliente c = this.clienteService.criarCliente(rs);
		this.viewcliente.listarCliente(c);
	}

	public void editarCliente() {
		String nomeCliente = this.viewcliente.pesquisarCliente();
		ResultSet rs = this.connect.selecionarCliente(nomeCliente);
		int id = this.clienteService.pegarIdCliente(rs);
		String cliente = this.viewcliente.edicaoCliente();
		Cliente c = this.clienteService.criarCliente(cliente);
		this.connect.atualizarCliente(c, id);
		this.viewcliente.msgSucesso("Cliente editado ");
		
	}

	public void removerCliente() {
		String nomeCliente = this.viewcliente.pesquisarCliente();
		ResultSet rs = this.connect.selecionarCliente(nomeCliente);
		int id = this.clienteService.pegarIdCliente(rs);
		this.connect.deletarCliente(id);
		this.viewcliente.msgSucesso("Cliente excluído ");
	}

	public void listarClientesPorGenero() {
		
		int sexo = this.viewcliente.escolherSexo();
		String sexoEscolhido;
		if(sexo == 1) {
			sexoEscolhido = "f";
		} else {
			sexoEscolhido = "m";
		}
		ResultSet rs = this.connect.selecionarClientePorSexo(sexoEscolhido);
		ClienteGroup cg = this.clienteService.criarClienteGroup(rs);
		this.viewcliente.listarTodosCliente(cg);
		
	}
}
