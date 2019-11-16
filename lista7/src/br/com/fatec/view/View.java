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
		System.out.println("1 - Criar um cliente");
		System.out.println("2 - Listar todos os clientes");
		System.out.println("3 - Listar todos clientes de um sexo");
		System.out.println("4 - Listar dados de um cliente");
		System.out.println("5 - Editar um cliente");
		System.out.println("6 - Remover um cliente");
		System.out.println("7 - Criar um servico");
		System.out.println("8 - Listar dados de todos os servicos");
		System.out.println("9 - Listar dados de um servico");
		System.out.println("10 - Editar um servico");
		System.out.println("11 - Remover um servico");
		System.out.println("12 - Inserir uso de um servico");
		System.out.println("13 - Relatório de idade média geral");
		System.out.println("14 - Relatório de idade média por genero");
		System.out.println("15 - Relatório de serviço mais procurado");
		System.out.println("16 - Relatório de serviço mais procurado por gênero");
		
		int escolha = this.scanner.nextInt();
		return escolha;
	}
	public void msgSucesso(String msgInicio) {
		System.out.println(msgInicio + "com sucesso");
	}
	
	public int escolherSexo() {
		System.out.println("Qual gênero você deseja?");
		System.out.println("1 - feminino");
		System.out.println("2 - masculino");
		int sexo = this.scanner.nextInt();
		return sexo;
	}
}
