package br.com.fatec.view;

import br.com.fatec.model.Cliente;
import br.com.fatec.model.ClienteGroup;

public class ViewCliente extends View{
	public String criacaoCliente() {
		System.out.println("Insira o nome do cliente");
		String nomeCliente = this.scanner.next();
		System.out.println("Insira a idade do cliente");
		String idadeCliente = this.scanner.next();
		System.out.println("Insira o genero do cliente");
		String generoCliente = this.scanner.next();
		System.out.println("Insira a data de nascimento do cliente");
		String dataNasCliente = this.scanner.next();
		System.out.println("Insira o telefone do cliente");
		String telefoneCliente = this.scanner.next();
		
		return this.hdDados.clienteParaPadrao(nomeCliente,idadeCliente,generoCliente,telefoneCliente,dataNasCliente);
	}
	
	public void listarTodosCliente(ClienteGroup cg) {
		for(int i = 0 ; i< cg.tamanhoGrupo() ; i++) {
			System.out.println(cg.getClienteNaPosicao(i).toString());
		}
	}
	
	public void listarCliente(Cliente cliente) {
		System.out.println(cliente.toString());
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
		System.out.println("Insira o nome do cliente para editar");
		String nomeClienteEditar = this.scanner.next();
		System.out.println("Insira a idade do cliente para editar");
		String idadeClienteEditar = this.scanner.next();
		System.out.println("Insira o genero do cliente para editar");
		String generoClienteEditar = this.scanner.next();
		System.out.println("Insira a data de nasciemento do cliente editar");
		String dataNasClienteEditar = this.scanner.next();
		System.out.println("Insira o telefone do cliente editar");
		String telefoneCliente = this.scanner.next();
		
		return this.hdDados.clienteParaPadrao(nomeClienteEditar,idadeClienteEditar,generoClienteEditar, telefoneCliente ,dataNasClienteEditar);
	}
}

// https://receitasdecodigo.com.br/java/usando-sqlite-em-java
