package br.com.fatec.services;

import br.com.fatec.model.Lancamento;

public class LancamentoService extends Services {
	
	public Lancamento construirLancamento(String dadosLancamento) {
		String[] dados;
		Lancamento lancamento;
		dados= this.handlerDados.paraParaLancamento(dadosLancamento);
		lancamento = new Lancamento(dados[0], dados[1], Double.parseDouble(dados[2]));		
		return lancamento;
	}
}
