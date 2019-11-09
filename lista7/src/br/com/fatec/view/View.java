package br.com.fatec.view;

import java.util.Scanner;

public class View {
	
	protected Scanner scanner;
	
	public View() {
		this.scanner = new Scanner(System.in);
	}
	
	public int menu() {
		System.out.println("Escolha uma das opções:");
		System.out.println("1 - Criar um usuario");
		System.out.println("2 - Editar um usuario");
		System.out.println("3 - Remover um usuario");
		System.out.println("4 - Listar dados de um usuario");
		System.out.println("5 - Listar todos os usuarios");
		System.out.println("6 - Criar um servico");
		System.out.println("7 - Editar um servico");
		System.out.println("8 - Remover um servico");
		System.out.println("9 - Listar dados de um servico");
		System.out.println("10 - Listar dados de todos os servicos");
		
		int escolha = this.scanner.nextInt();
		return escolha;
	}
	public void msgSucesso() {
		System.out.println("Cliente criado com sucesso");
	}
}
