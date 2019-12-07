package br.com.fatec.view;

import br.com.fatec.model.VeiculoGroup;

public class ViewVeiculo extends View{
	
	public String criacaoVeiculo() {
		System.out.println("Insira o modelo do veiculo");
		String modeloVeiculo = this.scanner.next();
		System.out.println("Insira o numero da placa do veiculo");
		String nplacaVeiculo = this.scanner.next();
		System.out.println("Insira o ano de fabricacao do veiculo");
		String anoFabricacaoVeiculo = this.scanner.next();
		System.out.println("Insira o valor do veiculo");
		String valorVeiculo = this.scanner.next();
		return this.hdDados.VeiculoParaPadrao(modeloVeiculo, anoFabricacaoVeiculo, nplacaVeiculo, Double.parseDouble(valorVeiculo));
	}
	
	public void listarTodosVeiculos(VeiculoGroup cg) {
		for(int i = 0; i < cg.tamanhoGrupo() ; i++) {
			System.out.println(cg.getVeiculoNaPosicao(i).toString());
		}
	}
	
	public String removerVeiculo() {
		System.out.println("Insira a placa do veiculo que deseja remover");
		String nplavaVeiculoRemover = this.scanner.next();
		return nplavaVeiculoRemover;
	}
	
	public String editarVeiculo() {
		System.out.println("Insira o modelo do veiculo");
		String modeloVeiculoEditar = this.scanner.next();
		System.out.println("Insira o numero da placa do veiculo");
		String nplacaVeiculoEditar = this.scanner.next();
		System.out.println("Insira o ano de fabricacao do veiculo");
		String anoFabricacaoVeiculo = this.scanner.next();
		System.out.println("Insira o valor do veiculo");
		String valorVeiculoEditar = this.scanner.next();
		return this.hdDados.VeiculoParaPadrao(modeloVeiculoEditar, anoFabricacaoVeiculo, nplacaVeiculoEditar, Double.parseDouble(valorVeiculoEditar));
	}
	
	public String pegarNumPlacaVeiculo() {
		System.out.println("Insira o Numero da Placa");
		String numPlaca = this.scanner.next();
		return numPlaca;
	}

}
