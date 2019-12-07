package br.com.fatec.service;

public class HandlerDados {
	public String clienteParaPadrao(String nomeCliente, String telefoneCliente, String enderecoCliente, String cpfCliente) {
		return nomeCliente + "!" + telefoneCliente + "!" + enderecoCliente +"!"+ cpfCliente ;
	}
	public String[] PadraoParaCliente(String cliente) {
		return cliente.split("!");
	}
	
	public String VeiculoParaPadrao(String modeloVeiculo, String anoFabricacao, String numPlacaVeiculo, double valorVeiculo) {
		return modeloVeiculo + "!" + anoFabricacao + "!" + numPlacaVeiculo +"!"+ valorVeiculo ;
	}
	public String[] PadraoParaVeiculo(String veiculo) {
		return veiculo.split("!");
	}	

	public String cadastroAgendamento( String nomeCliente, String dataAgendamento, String horarioAgendamento,String numPlacaVeiculo) {
		return nomeCliente + "!" + dataAgendamento+ "!" +  horarioAgendamento + "!" + numPlacaVeiculo;
	}	
	
	public String agendamentoParaPadrao( String nomeCliente, String dataAgendamento, String horarioAgendamento,String numPlacaVeiculo) {
		return nomeCliente + "!" + dataAgendamento+ "!" +  horarioAgendamento + "!" + numPlacaVeiculo;
	}
	
	public String[] PadraoParaAgendamento(String agendamento) {
		return agendamento.split("!");
	}
}
