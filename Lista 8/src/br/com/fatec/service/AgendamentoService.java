package br.com.fatec.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fatec.model.Agendamento;
import br.com.fatec.model.AgendamentoGroup;

public class AgendamentoService extends Services{
	
	private AgendamentoGroup agendamentos;
	
	public AgendamentoService() {
		agendamentos = new AgendamentoGroup();
	}
	
	public Agendamento criarAgendamento(String agendamento) {
		String[] dadosAgendamento = this.handlerDados.PadraoParaAgendamento(agendamento);
		Agendamento a = new Agendamento(dadosAgendamento[0],dadosAgendamento[1], dadosAgendamento[2],dadosAgendamento[3]);
		return a;
	}
	
	public AgendamentoGroup criarAgendamentoGroup(ResultSet resultSet) {
		AgendamentoGroup sg = new AgendamentoGroup();

		try {
			while (resultSet.next()) {
				String nomeCliente = resultSet.getString("nomeCliente");
				String dataAgendamento = resultSet.getString("data");
				String modelo = resultSet.getString("modelo");
				String numPlacaVeiculo = resultSet.getString("placa");
				String descricao = resultSet.getString("desc");
			
			    Agendamento a = new Agendamento(nomeCliente, dataAgendamento, descricao, numPlacaVeiculo, modelo);
			    
			    sg.adicionarAgendamento(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sg;
	}
	
	public Agendamento criarAgendamento(ResultSet rs) {
		Agendamento a = null;
		try {
			a = new Agendamento(rs.getString("nomeCliente"), rs.getString("dataAgendamento"),rs.getString("horarioAgendamento"), rs.getString("numPlacaVeiculo"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return a;
	}
	
	public int pegarIdAgendamento(ResultSet rs) {
		int id = -1;
		
		try {
			id = rs.getInt("id");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return id;
	}

}
