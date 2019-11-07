package br.com.fatec.view;

import java.util.Scanner;

public class View {
	
	private Scanner scanner;
	
	public View() {
		this.scanner = new Scanner(System.in);
	}
	
	public int menu() {
		System.out.println("Escolha uma das opções:");
		System.out.println("1 - Criar um usuario");
		System.out.println("2 - Editar um usuario");
		System.out.println("3 - Remover um usuario");
		System.out.println("4 - Listar dados de um usuario");
		System.out.println("5 - Listar dados de todos os usuarios");
		System.out.println("6 - Criar um servico");
		System.out.println("7 - Editar um servico");
		System.out.println("8 - Remover um servico");
		System.out.println("9 - Listar dados de um servico");
		System.out.println("10 - Listar dados de todos os servicos");
		
		int escolha = this.scanner.nextInt();
		return escolha;
	}
	
	public String criacaoCliente() {
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
		return nomeClienteEditar + "|" + idadeClienteEditar+ "|" + generoClienteEditar + "|" + dataNasClienteEditar ;
	}
	
	public String criacaoServico() {
		System.out.println("Insira o nome do servico");
		String nomeServico = this.scanner.next();
		System.out.println("Insira a descricao do servico");
		String descricaoServico = this.scanner.next();
		System.out.println("Insira o valor do servico");
		String valor = this.scanner.next();
		return nomeServico + "|" + valor + "|" + descricaoServico;
	}
	
	public String listarTodosServico() {
		System.out.println("Insira o nome do servico");
		String nomeServico = this.scanner.next();
		System.out.println("Insira a descricao do servico");
		String descricaoServico = this.scanner.next();
		System.out.println("Insira o valor do servico");
		String valor = this.scanner.next();
		return nomeServico + "|" + valor + "|" + descricaoServico;
	}
	
	public String listarServico() {
		System.out.println("Insira o nome do servico");
		String nomeServico = this.scanner.next();
		return nomeServico;
	}
	
	public String removerServico() {
		System.out.println("Insira o nome do servico que deseja remover");
		String nomeServicoRemover = this.scanner.next();
		return nomeServicoRemover;
	}
	
	public String editarServico() {
		System.out.println("Insira o nome do servico");
		String nomeServicoEditar = this.scanner.next();
		System.out.println("Insira a descricao do servico");
		String descricaoServicoEditar= this.scanner.next();
		System.out.println("Insira o valor do servico");
		String valorEditar = this.scanner.next();
		return nomeServicoEditar+ "|" + valorEditar + "|" + descricaoServicoEditar;
	}
}
