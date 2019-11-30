package br.com.controller.view;

import br.com.fatec.model.Lancamento;
import br.com.fatec.model.LancamentoGroup;

public class ViewLancamento extends View {
	public String cadastrarEntrada() {
		return this.cadastrarLancamento("Entrada", "Salario, Vendas ou Investimentos");
	}

	public String cadastrarSaida() {
		return this.cadastrarLancamento("Saida", "Luz,Gas, Alimentacao, locomocao, Outros");
	}
	
	public String cadastrarLancamento(String tipoLancamento, String classificacoes) {
		String classificacao;
		double valor;
		
		System.out.println("Qual é a classificação do lancamento? " + classificacoes);
		
		classificacao = this.scanner.next();
		
		System.out.println("Qual é o valor do lancamento?");
		valor = this.scanner.nextDouble();
		
		return this.hdDados.lancamentoParaPadrao(tipoLancamento, classificacao, valor);
	}
	
	public void listarLancamentos(LancamentoGroup lg) {
		double entrada = 0 ;
		double saida = 0;
		
		for(int i = 0; i < lg.tamanhoGrupo() ; i++) {
			Lancamento l = lg.getLancamentoNaPosicao(i);
			System.out.println(l.toString());
			if(l.getTipoLancamento().equals("entrada")) {
				entrada += l.getValor();
			} else {
				saida += l.getValor();
			}
			System.out.println("Valor Total de Entrada: " + entrada);
			System.out.println("Valor Total de Saída: " + saida);
		}
	}
}
