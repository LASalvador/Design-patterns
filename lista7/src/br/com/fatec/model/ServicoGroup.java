package br.com.fatec.model;

import java.util.ArrayList;

public class ServicoGroup {
	ArrayList<Servico> servicos;
	
	public ServicoGroup() {
		servicos = new ArrayList<Servico>();
	}
	
	public void adicionarServico(Servico servico) {
		servicos.add(servico);
	}
	
	public ArrayList<Servico> getServicos(){
		return this.servicos;
	}
	public Servico getServicoNaPosicao(int posicao) {
		return this.servicos.get(posicao);
	}
	
	public int tamanhoGrupo() {
		return servicos.size();
	}
}
