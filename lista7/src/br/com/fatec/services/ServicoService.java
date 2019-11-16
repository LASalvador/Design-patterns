package br.com.fatec.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fatec.model.Servico;
import br.com.fatec.model.ServicoGroup;

public class ServicoService extends Services{
	
	public Servico criarServico(String servico) {
		String[] dadosServico = this.handlerDados.padraParaServico(servico);
		Servico s = new Servico(dadosServico[0], dadosServico[1], Double.parseDouble(dadosServico[2]));
		return s;
	}

	public ServicoGroup criarServicoGroup(ResultSet resultSet) {
		ServicoGroup sg = new ServicoGroup();
		try {
			while (resultSet.next()) {
			    String nome = resultSet.getString("nome");
			    double valor = resultSet.getDouble("valor");
			    String descricao = resultSet.getString("descricao");
			    
			    Servico s = new Servico(nome, descricao, valor);
			    
			    sg.adicionarServico(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sg;
	}

	public Servico criarServico(ResultSet rs) {
		Servico s = null;
		try {
			s = new Servico(rs.getString("nome"), rs.getString("descricao"), rs.getDouble("valor"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return s;
	}
	
	public int pegarIdServico(ResultSet rs) {
		int id = -1;
		
		try {
			id = rs.getInt("id");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return id;
	}
}	
