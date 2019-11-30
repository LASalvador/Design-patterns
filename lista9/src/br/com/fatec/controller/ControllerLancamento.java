package br.com.fatec.controller;

import java.sql.ResultSet;

import br.com.controller.view.ViewLancamento;
import br.com.fatec.model.Lancamento;
import br.com.fatec.services.LancamentoService;

public class ControllerLancamento extends Controller{
	
	private LancamentoService lancamentoService;
	private ViewLancamento viewLancamento;
	
	public ControllerLancamento() {
		this.lancamentoService = new LancamentoService();
		this.viewLancamento = new ViewLancamento();
	}
	public void cadastrarEntrada(int idConta) {
		String dadosLancamento = this.viewLancamento.cadastrarEntrada();
		this.cadastrarLancamento(dadosLancamento, idConta);
	}
	
	public void cadastrarSaida(int idConta) {
		String dadosLancamento = this.viewLancamento.cadastrarSaida();
		this.cadastrarLancamento(dadosLancamento, idConta);
	}
	
	private void cadastrarLancamento(String dadosLancamento, int idConta) {
		Lancamento lancamento = this.lancamentoService.construirLancamento(dadosLancamento);
		this.connect.inserirLancamento(lancamento, idConta);
		ResultSet rs = this.connect.pegarSaldoConta(idConta);
		double saldo = this.lancamentoService.pegarSaldo(rs);
		
		if(lancamento.getTipoLancamento().equals("Entrada")) {
			saldo+= lancamento.getValor();
		} else {
			saldo-= lancamento.getValor();
		}
		this.connect.atualizarSaldoConta(saldo, idConta);
	}
	
}

