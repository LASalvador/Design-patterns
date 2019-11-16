package br.com.fatec.controller;

import java.sql.ResultSet;

import br.com.fatec.services.RelatorioService;
import br.com.fatec.view.ViewRelatorio;

public class ControllerRelatorio extends Controller{
	
	ViewRelatorio viewRelatorio;
	RelatorioService relatorioServico;
	
	public ControllerRelatorio() {
		viewRelatorio = new ViewRelatorio();
		relatorioServico = new RelatorioService();
	}

	public void cadastrarUsoServico() {
		String dados = this.viewRelatorio.cadastrarUsoServico();
		String[] dadosRelatorio = this.relatorioServico.gerarIDs(dados);
		this.connect.inserirUsoServico(Integer.parseInt(dadosRelatorio[0]), Integer.parseInt(dadosRelatorio[0]));
		this.viewRelatorio.msgSucesso("Cadastro de uso de serviço realizado ");
	}

	public void mediaIdade() {
		ResultSet rs = this.connect.pegarMediaIdade();
		int mediaIdade = this.relatorioServico.pegarMediaIdade(rs);
		this.viewRelatorio.mostrarMediaIdade("media de idade geral", mediaIdade);
	}

	public void mediaIdadePorGenero() {
		int genero = this.viewRelatorio.escolherSexo();
		String generoEscolhido;
		if(genero == 1) {
			generoEscolhido = "f";
		} else {
			generoEscolhido = "m";
		}
		
	}
	
}
