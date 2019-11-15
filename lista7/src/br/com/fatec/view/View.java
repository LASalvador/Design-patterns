package br.com.fatec.view;

import java.util.Scanner;

import br.com.fatec.services.HandlerDados;

public class View {
	
	protected Scanner scanner;
	protected HandlerDados hdDados;
	
	public View() {
		this.scanner = new Scanner(System.in);
		this.hdDados = new HandlerDados();
	}
	
	public int menu() {
		System.out.println("Escolha uma das opções:");
		System.out.println("1 - Criar um usuario");
		System.out.println("2 - Listar todos os usuarios");
		System.out.println("3 - Listar dados de um usuario");
		System.out.println("4 - Editar um usuario");
		System.out.println("5 - Remover um usuario");
		System.out.println("6 - Criar um servico");
		System.out.println("7 - Listar dados de todos os servicos");
		System.out.println("8 - Listar dados de um servico");
		System.out.println("9 - Editar um servico");
		System.out.println("10 - Remover um servico");
		
		int escolha = this.scanner.nextInt();
		return escolha;
	}
	public void msgSucesso(String msgInicio) {
		System.out.println(msgInicio + "com sucesso");
	}
}
