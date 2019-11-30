package br.com.fatec.model;

public class Lancamento {
	private String tipoLancamento;
	private String classificacao;
	private double valor;
	private String descricao;
	
	public Lancamento(String tipo, String classificacao, double valor) {
		setTipoLancamento(tipo);
		setClassificacao(classificacao);
		setValor(valor);
	}
	
	public String getTipoLancamento() {
		return tipoLancamento;
	}
	public void setTipoLancamento(String tipoLancamento) {
		this.tipoLancamento = tipoLancamento;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.tipoLancamento + " - " + this.classificacao + " - " + this.valor;
	}
	
}
