package br.com.fatec.controller;

import br.com.controller.view.View;
import br.com.fatec.services.SQLite;

public class Controller {
	
	protected SQLite connect;
	public Controller () {
		connect = new SQLite();
		connect.initDB();
	}
	
	public void inicio() {
		View v = new View();
		int escolha = v.homePage();
		int idConta = lidarEscolharHome(escolha);
		if(idConta == 0){
			System.out.println("Você não tem acesso ao sistema!");
			return;
		}
		escolha = v.menu();
		lidarEscolhaMenu(escolha, idConta);
	}
	
	private int lidarEscolharHome(int escolhaCliente) {
		int idConta = 0;
		ControllerCliente controllerCliente = new ControllerCliente();
		switch (escolhaCliente) {
		case 1:
			idConta = controllerCliente.criarCliente();
			break;
		case 2:
			idConta = controllerCliente.logar();
			break;
		default:
			System.out.println("404 - Not Found");
		}	
		return idConta;
	}
	
	private void lidarEscolhaMenu(int escolhaMenu, int idConta) {
		ControllerLancamento controllerLancamento = new ControllerLancamento();
		switch (escolhaMenu) {
		case 1:
			controllerLancamento.cadastrarEntrada(idConta);
			break;
		case 2:
			controllerLancamento.cadastrarSaida(idConta);
			break;
		case 3:
			controllerLancamento.mostrarHistorico(idConta);
			break;
		default:
			System.out.println("404 - Not Found");
			break;
		}
	}
}
