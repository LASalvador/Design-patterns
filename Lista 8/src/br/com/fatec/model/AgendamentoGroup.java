package br.com.fatec.model;

import java.util.ArrayList;

public class AgendamentoGroup {
	
	private ArrayList<Agendamento> agendamentos;
	
	public AgendamentoGroup() {
		agendamentos = new ArrayList<Agendamento>(); 
	}
	public void adicionarAgendamento(Agendamento agendamento) {
		agendamentos.add(agendamento);
	}
	public ArrayList<Agendamento> getAgendamento(){
		return this.agendamentos;
	}
	public Agendamento getAgendamentoNaPosicao(int posicao) {
		return this.agendamentos.get(posicao);
	}
	public int tamanhoGrupo() {
		return this.agendamentos.size();
	}

}
