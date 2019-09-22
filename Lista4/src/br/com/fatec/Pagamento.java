package br.com.fatec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Pagamento {
	
	@XmlElement(name = "nome")
	private String nome;
	@XmlElement(name = "CPF")
	private String CPF;
	@XmlElement(name = "bancoRecebimento")
	private String bancoRecebimento;
	@XmlElement(name = "bancoPagamento")
	private String bancoPagamento;
	@XmlElement(name = "data")
	private String data;
	@XmlElement(name = "valor")
	private double valor;
	@XmlElement(name = "parcelas")
	private int parcelas;
	@XmlElement(name = "numeroBoleto")
	private String numeroBoleto;
	@XmlElement(name = "numeroCartao")
	protected String numeroCartao;
	@XmlElement(name = "nomeTitular")
	protected String nomeTitular;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getBancoRecebimento() {
		return bancoRecebimento;
	}
	public void setBancoRecebimento(String bancoRecebimento) {
		this.bancoRecebimento = bancoRecebimento;
	}
	public String getBancoPagamento() {
		return bancoPagamento;
	}
	public void setBancoPagamento(String bancoPagamento) {
		this.bancoPagamento = bancoPagamento;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getParcelas() {
		return parcelas;
	}
	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	public String getNumeroBoleto() {
		return numeroBoleto;
	}
	public void setNumeroBoleto(String numeroBoleto) {
		this.numeroBoleto = numeroBoleto;
	}
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	
	
}
