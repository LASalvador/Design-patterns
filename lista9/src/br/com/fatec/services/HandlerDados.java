package br.com.fatec.services;

public class HandlerDados {
	
	String divisor = "!";
	
	public String clienteParaPadrao(String nomeCliente, String telefoneCliente, String enderecoCliente,
			String emailCliente, String senhaCliente) {
		return nomeCliente + divisor + telefoneCliente + divisor + enderecoCliente + divisor + emailCliente + divisor + senhaCliente ;
	}
	
	public String[] padraoParaCliente(String cliente) {
		return cliente.split(divisor);
	}
	
	public String authParaPadrao(String email, String senha) {
		return email + divisor + senha;
	}
	
	public String[] padraoParaAuth(String auth) {
		return auth.split(divisor);
	}
	
	public String lancamentoParaPadrao(String tipo, String classificacao,double valor) {
		return tipo + divisor + classificacao + divisor + valor;
	}
	
	public String[] paraParaLancamento(String lancamento) {
		return lancamento.split(divisor);
	}

}
