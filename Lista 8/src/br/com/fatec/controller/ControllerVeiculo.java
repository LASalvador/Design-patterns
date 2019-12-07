package br.com.fatec.controller;

import java.sql.ResultSet;

import br.com.fatec.model.Veiculo;
import br.com.fatec.model.VeiculoGroup;
import br.com.fatec.service.VeiculoService;
import br.com.fatec.view.ViewVeiculo;

public class ControllerVeiculo extends Controller{
	
	ViewVeiculo viewVeiculo;
	VeiculoService veiculoService;
	
	public ControllerVeiculo() {
		viewVeiculo = new ViewVeiculo();
		veiculoService = new VeiculoService();
	}
	public void criarVeiculo() {
		String veiculo = this.viewVeiculo.criacaoVeiculo();
		Veiculo v = this.veiculoService.criarVeiculo(veiculo);
		this.connect.inserirVeiculo(v);
		this.viewVeiculo.msgSucesso("Veiculo criado ");
	}
	public void listarTodosVeiculos() {
		ResultSet rs = this.connect.listarTodosVeiculos();
		VeiculoGroup sg = this.veiculoService.criarVeiculoGroup(rs);
		this.viewVeiculo.listarTodosVeiculos(sg);
	}
	
	public void editarVeiculo() {
		
		String nplacaVeiculo = this.viewVeiculo.pegarNumPlacaVeiculo();
		ResultSet rs = this.connect.selecionarVeiculo(nplacaVeiculo );
		int id = this.veiculoService.pegarIdVeiculo(rs);
		String dadosServico = this.viewVeiculo.editarVeiculo();
		Veiculo s = this.veiculoService.criarVeiculo(dadosServico);
		this.connect.atualizarVeiculo(s, id);
		this.viewVeiculo.msgSucesso("Veiculo editado ");
	}
	
	public void removerVeiculo() {
		
		String nplacaVeiculo = this.viewVeiculo.pegarNumPlacaVeiculo();
		ResultSet rs = this.connect.selecionarVeiculo(nplacaVeiculo);
		int id = this.veiculoService.pegarIdVeiculo(rs);
		this.connect.deletarVeiculo(id);
		this.viewVeiculo.msgSucesso("Veiculo excluido ");
		
	}
	

}
