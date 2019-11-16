package br.com.fatec.controller;

import java.sql.ResultSet;

import br.com.fatec.model.Servico;
import br.com.fatec.model.ServicoGroup;
import br.com.fatec.services.ServicoService;
import br.com.fatec.view.ViewServico;

public class ControllerServico extends Controller {
	
	ViewServico viewServico;
	ServicoService servicoService;
	
	public ControllerServico() {
		viewServico =  new ViewServico();
		servicoService = new ServicoService();
	}

	public void criarServico() {
		String servico = this.viewServico.criacaoServico();
		Servico s = this.servicoService.criarServico(servico);
		this.connect.inserirServico(s);
		this.viewServico.msgSucesso("Servico criado ");
	}
	public void listarTodosServicos() {
		ResultSet rs = this.connect.listarTodosServicos();
		ServicoGroup sg = this.servicoService.criarServicoGroup(rs);
		this.viewServico.listarTodosServicos(sg);
	}

	public void listarServico() {
		String nomeServico = this.viewServico.pegarNomeServico();
		ResultSet rs = this.connect.selecionarServico(nomeServico);
		Servico s =  this.servicoService.criarServico(rs);
		this.viewServico.listarServico(s);
	}

	public void editarServico() {
		
		String nomeServico = this.viewServico.pegarNomeServico();
		ResultSet rs = this.connect.selecionarServico(nomeServico);
		int id = this.servicoService.pegarIdServico(rs);
		String dadosServico = this.viewServico.editarServico();
		Servico s = this.servicoService.criarServico(dadosServico);
		this.connect.atualizarServico(s, id);
		this.viewServico.msgSucesso("Servico editado ");
		
	}

	public void removerServico() {
		
		String nomeServico = this.viewServico.pegarNomeServico();
		ResultSet rs = this.connect.selecionarServico(nomeServico);
		int id = this.servicoService.pegarIdServico(rs);
		this.connect.deletarServico(id);
		this.viewServico.msgSucesso("Servico excluído ");
		
	}
	
}
