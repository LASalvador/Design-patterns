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
		if(escolha <= 5) {
			lidarCliente(escolha);
		} 
		else if( escolha <=10) {
			lidarServico();
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
            controllerCliente.listaCliente();
            break;
        case 4:
            controllerCliente.editarCliente();
            break;
        case 5:
        	controllerCliente.removerCliente();
            break;
		}
	}
	public void lidarServico() {
		
	}
}
