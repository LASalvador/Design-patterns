package br.com.fatec.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fatec.model.Cliente;
import br.com.fatec.model.ClienteGroup;
import br.com.fatec.model.Lancamento;
import br.com.fatec.model.LancamentoGroup;

public class LancamentoService extends Services {
	
	public Lancamento construirLancamento(String dadosLancamento) {
		String[] dados;
		Lancamento lancamento;
		dados= this.handlerDados.paraParaLancamento(dadosLancamento);
		lancamento = new Lancamento(dados[0], dados[1], Double.parseDouble(dados[2]));		
		return lancamento;
	}
	
	public double pegarSaldo(ResultSet rs) {
		double saldo = 0;
		
		try {
			saldo = rs.getDouble("valor");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return saldo;
	}

	public LancamentoGroup construirLancamentoGroup(ResultSet resultSet) {
		LancamentoGroup lg = new LancamentoGroup();
		try {
			while (resultSet.next()) {
			    String tipo = resultSet.getString("tipo");
			    String classificacao = resultSet.getString("classificacao");
			    double valor = resultSet.getDouble("idade");
			    
			    
			    Lancamento l = new Lancamento(tipo, classificacao, valor);
			    lg.adicionarLancamento(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lg;
	}
}
