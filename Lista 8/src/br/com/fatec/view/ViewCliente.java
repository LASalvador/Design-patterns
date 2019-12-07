package br.com.fatec.view;

import br.com.fatec.model.Cliente;
import br.com.fatec.model.ClienteGroup;

import br.com.fatec.service.HandlerDados;

public class ViewCliente extends View {

	public String criacaoCliente() {
		System.out.println("Insira o nome do cliente");
		String nomeCliente = this.scanner.next();
		System.out.println("Insira o telefone do cliente");
		String telefoneCliente = this.scanner.next();
		System.out.println("Insira o endereco do cliente");
		String enderecoCliente = this.scanner.next();
		System.out.println("Insira o cpf do cliente");
		String cpfCliente = this.scanner.next();
	
		return this.hdDados.clienteParaPadrao(nomeCliente,telefoneCliente,enderecoCliente,cpfCliente);
	}
	
	public void listarTodosCliente(ClienteGroup cg) {
		for(int i = 0 ; i< cg.tamanhoGrupo() ; i++) {
			System.out.println(cg.getClienteNaPosicao(i).toString());
		}
	}
	
	public String pesquisarCliente() {
		System.out.println("Insira o nome do cliente");
		String nomeCliente = this.scanner.next();
		return nomeCliente ;
	}
	
	public String removerCliente() {
		System.out.println("Insira o nome do cliente que deseja remover");
		String nomeClienteRemover = this.scanner.next();
		return nomeClienteRemover;
	}
	
	public String edicaoCliente() {
		System.out.println("Insira o nome do cliente que deseja editar os dados");
		String nomeClienteEditar = this.scanner.next();
		System.out.println("Insira o telefone do cliente editar");
		String telefoneClienteEditar = this.scanner.next();
		System.out.println("Insira o endereco do cliente para editar");
		String enderecoClienteEditar = this.scanner.next();
		System.out.println("Insira o cpf do cliente para editar");
		String cpfClienteEditar = this.scanner.next();
		
		return this.hdDados.clienteParaPadrao(nomeClienteEditar,telefoneClienteEditar,enderecoClienteEditar, cpfClienteEditar);
	}

}
