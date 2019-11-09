package br.com.fatec.controller;

import br.com.fatec.view.View;

public class Controller {
	
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
        case 2:
            System.out.println("Edição");
            break;
        case 3:
            System.out.println("Remoção");
            break;
        case 4:
            System.out.println("Lista todos");
            break;
        case 5:
            System.out.println("Lista um");
            break;
		}
	}
	public void lidarServico() {
		
	}
}
