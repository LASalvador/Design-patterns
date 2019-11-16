package br.com.fatec.controller;

import br.com.fatec.services.SQLite;
import br.com.fatec.view.View;

public class Controller {
	SQLite connect;
	public Controller() {
		connect = new SQLite();
		connect.initDB();
	}
	
	public void inicio() {		
		View v = new View();
		int escolha = v.menu();
		lidarEscolharMenu(escolha);
		
	}
	public void lidarEscolharMenu(int escolha) {
		if(escolha <= 6) {
			lidarCliente(escolha);
		} 
		else if( escolha <=11) {
			lidarServico(escolha);
		} else {
			System.out.println("404 - NOT FOUND");
		}
	}
	public void lidarCliente(int escolha) {
		ControllerCliente controllerCliente = new ControllerCliente();
		switch (escolha) {
        case 1:
            controllerCliente.criarCliente();
            break;
        case 2:
        	controllerCliente.listarTodosClientes();
            break;
        case 3:
        	controllerCliente.listarClientesPorGenero();
            break;
        case 4:
            controllerCliente.listaCliente();
            break;
        case 5:
            controllerCliente.editarCliente();
            break;
        case 6:
        	controllerCliente.removerCliente();
            break;
		}
	}
	public void lidarServico(int escolha) {
		ControllerServico controllerServico = new ControllerServico();
		
		switch (escolha) {
		case 7:
			controllerServico.criarServico();
			break;
		case 8:
			controllerServico.listarTodosServicos();
			break;
		case 9:
			controllerServico.listarServico();
			break;
		case 10:
			controllerServico.editarServico();
			break;
		case 11:
			controllerServico.removerServico();
			break;
		}
	}
}
