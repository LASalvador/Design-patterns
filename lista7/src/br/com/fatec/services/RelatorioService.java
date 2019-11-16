package br.com.fatec.services;

import java.sql.ResultSet;

public class RelatorioService extends Services {
	public String[] gerarIDs(String dados) {
		return this.handlerDados.padraoParaRelatorio(dados);
	}
	
	public int pegarMediaIdade(ResultSet rs) {
		int idade = 0;
		try {
			idade = rs.getInt("mediaIdade");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return idade;
		
	}
}
