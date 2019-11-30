package br.com.controller.view;

import java.util.Scanner;

import br.com.fatec.services.HandlerDados;

public class View {
	
	protected Scanner scanner;
	protected HandlerDados hdDados;
	
	public View() {
		this.scanner = new Scanner(System.in);
		this.hdDados = new HandlerDados();
	}
	
	public int homePage() {
		System.out.println("Escolha uma das opções:");
		System.out.println("1 - Cadastrar-se");
		System.out.println("2 - Logar");
		
		int escolha = this.scanner.nextInt();
		return escolha;
	}
	
	public int menu() {
		System.out.println("Escolha uma opção:");
		System.out.println("1 - Cadastro de entradas");
		System.out.println("2 - Cadastro de saidas");
		System.out.println("3 - Exibir histórico de transações");
		return this.scanner.nextInt();
	}
	
	public void msgSucesso(String msgInicio) {
		System.out.println(msgInicio + " com sucesso");
	}
}
