package br.com.fatec.model;

import java.util.ArrayList;

public class LancamentoGroup {
	
	private ArrayList<Lancamento> lancamentos;
	
	public LancamentoGroup() {
		lancamentos = new ArrayList<Lancamento>(); 
	}
	public void adicionarLancamento(Lancamento lancamento) {
		lancamentos.add(lancamento);
	}
	public ArrayList<Lancamento> getLancamentos(){
		return this.lancamentos;
	}
	public Lancamento getLancamentoNaPosicao(int posicao) {
		return this.lancamentos.get(posicao);
	}
	public int tamanhoGrupo() {
		return this.lancamentos.size();
	}
}
