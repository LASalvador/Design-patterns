package br.com.fatec.view;

import java.util.Scanner;

import br.com.fatec.service.HandlerDados;

public class View {
	
	protected Scanner scanner;
	protected HandlerDados hdDados;
	
	public View() {
		this.scanner = new Scanner(System.in);
		this.hdDados =  new HandlerDados();
	}
	
	public int menu() {
		System.out.println("Escolha uma das opções:");
		System.out.println("1 - Cadastro de cliente");
		System.out.println("2 - Editar cliente");
		System.out.println("3 - Excluir cliente");
		System.out.println("4 - Listar cliente");
		System.out.println("5 - Cadastro de veiculo");
		System.out.println("6 - Editar veiculo");
		System.out.println("7 - Excluir veiculo");
		System.out.println("8 - Listar veiculo");
		System.out.println("9 - Agendamento de revisões");
		System.out.println("10 - Troca de datas de agendamentos de revisões");
		System.out.println("11 - Cancelamento de agendamento de revisão");
		System.out.println("12 - Relatorio dos servicos foram feitos");
		
		int escolha = this.scanner.nextInt();
		return escolha;
	}
	public void msgSucesso(String msgInicio) {
		System.out.println(msgInicio + "com sucesso");
	}
}
