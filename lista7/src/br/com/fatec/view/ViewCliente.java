package br.com.fatec.view;

import br.com.fatec.services.HandlerDados;

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
		
		return HandlerDados.clienteParaPadrao(nomeCliente,idadeCliente,generoCliente,telefoneCliente,dataNasCliente);
	}
	
	public String listarTodosCliente() {
		System.out.println("Insira o nome do cliente");
		String nomeCliente = this.scanner.next();
		System.out.println("Insira a idade do cliente");
		String idadeCliente = this.scanner.next();
		System.out.println("Insira o genero do cliente");
		String generoCliente = this.scanner.next();
		System.out.println("Insira a data de nascimento do cliente");
		String dataNasCliente = this.scanner.next();
		return nomeCliente + "|" + idadeCliente + "|" + generoCliente + "|" + dataNasCliente;
	}
	
	public String listarCliente() {
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
		System.out.println("Insira a idade do cliente para editar");
		String idadeClienteEditar = this.scanner.next();
		System.out.println("Insira o genero do cliente para editar");
		String generoClienteEditar = this.scanner.next();
		System.out.println("Insira a data de nasciemento do cliente editar");
		String dataNasClienteEditar = this.scanner.next();
		System.out.println("Insira o telefone do cliente editar");
		String telefoneCliente = this.scanner.next();
		
		return HandlerDados.clienteParaPadrao(nomeClienteEditar,idadeClienteEditar,generoClienteEditar, telefoneCliente ,dataNasClienteEditar);
	}
}
