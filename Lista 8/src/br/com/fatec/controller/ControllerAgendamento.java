package br.com.fatec.controller;

import java.sql.ResultSet;

import br.com.fatec.model.Agendamento;
import br.com.fatec.model.AgendamentoGroup;
import br.com.fatec.service.AgendamentoService;
import br.com.fatec.service.ClienteService;
import br.com.fatec.service.VeiculoService;
import br.com.fatec.view.viewAgendamento;

public class ControllerAgendamento extends Controller{
	viewAgendamento viewAgendamento;
	AgendamentoService agendamentoService;
	
	public ControllerAgendamento() {
		viewAgendamento = new viewAgendamento();
		agendamentoService = new AgendamentoService();
	}
	
	public void criarAgendamento() {
		ClienteService cs = new ClienteService();
		VeiculoService vs = new VeiculoService();
		
		String agendamento = viewAgendamento.cadastroAgendamento();
		Agendamento a = agendamentoService.criarAgendamento(agendamento);
		ResultSet rs = this.connect.selecionarCliente(a.getNomeCliente());
		int idCliente = cs.pegarIdCliente(rs);
		rs = this.connect.selecionarVeiculo(a.getPlaca());
		int idVeiculo = vs.pegarIdVeiculo(rs);
		this.connect.inserirAgendamento(a, idCliente, idVeiculo);
		viewAgendamento.msgSucesso("Agendamento criado");
	}
		
	public void atualizarData() {
		int id = this.viewAgendamento.pesquisarAgendamento();
		String dtNova = this.viewAgendamento.edicaoAgendamento();
		this.connect.atualizarDataAgendamento(dtNova, id);
		this.viewAgendamento.msgSucesso("Data Editada");
	}

	public void cancelarAgendamento() {
		int id = this.viewAgendamento.pesquisarAgendamento();
		this.connect.deletarAgendamento(id);
		this.viewAgendamento.msgSucesso("Agendamento cancelado");
	}

	public void listarAgendamentos() {
		ResultSet rs = this.connect.listarAgendamentos();
		AgendamentoGroup cg = this.agendamentoService.criarAgendamentoGroup(rs);
		this.viewAgendamento.listarTodosAgendamnetos(cg);
	}
}
