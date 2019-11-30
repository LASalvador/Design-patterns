package br.com.controller.view;

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
}
