package br.com.fatec.controller;
import br.com.fatec.service.SQLite;
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
		if(escolha <= 4) {
			lidarCliente(escolha);
		} 
		else if( escolha <= 8) {
			lidarVeiculo(escolha);
		} else if(escolha  <=12) {
			lidarAgendamento(escolha);
		} else {
			System.out.println("404 - Not Found");
		}
	}
	
	private void lidarCliente(int escolha) {
		ControllerCliente controllerCliente = new ControllerCliente();
		switch (escolha) {
        case 1:
            controllerCliente.criarCliente();
            break;
        case 2:
            controllerCliente.editarCliente();
            break;
        case 3:
            controllerCliente.removerCliente();
            break;
        case 4:
            controllerCliente.listarTodosClientes();
            break;
		}
	}
	
	
	private void lidarVeiculo(int escolha) {
		ControllerVeiculo controllerVeiculo = new ControllerVeiculo();
		switch (escolha) {
        case 5:
            controllerVeiculo.criarVeiculo();
            break;
        case 6:
            controllerVeiculo.editarVeiculo();
            break;
        case 7:
            controllerVeiculo.removerVeiculo();
            break;
        case 8:
            controllerVeiculo.listarTodosVeiculos();
            break;
		}
		
	}
	
	private void lidarAgendamento(int escolha) {
		ControllerAgendamento controllerAgendamento = new ControllerAgendamento();
		
		switch (escolha) {
		case 9:
			controllerAgendamento.criarAgendamento();
			break;
		case 10: 
			controllerAgendamento.atualizarData();
			break;
		case 11:
			controllerAgendamento.cancelarAgendamento();
			break;
		case 12:
			controllerAgendamento.listarAgendamentos();
			break;
		}
	}
}
