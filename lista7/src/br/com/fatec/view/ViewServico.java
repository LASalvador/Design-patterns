package br.com.fatec.view;

import br.com.fatec.model.Servico;
import br.com.fatec.model.ServicoGroup;

public class ViewServico extends View {
	
	public String criacaoServico() {
		System.out.println("Insira o nome do servico");
		String nomeServico = this.scanner.next();
		System.out.println("Insira o valor do servico");
		double valor = this.scanner.nextDouble();
		System.out.println("Insira a descricao do servico");
		String descricaoServico = this.scanner.next();
		
		return this.hdDados.servicoParaPadrao(nomeServico, descricaoServico, valor);
	}
	
	public void listarTodosServicos(ServicoGroup cg) {
		for(int i = 0; i < cg.tamanhoGrupo() ; i++) {
			System.out.println(cg.getServicoNaPosicao(i).toString());
		}
	}

	public void listarServico(Servico servico) {
		System.out.println(servico.toString());
	}
	
	public String removerServico() {
		System.out.println("Insira o nome do servico que deseja remover");
		String nomeServicoRemover = this.scanner.next();
		return nomeServicoRemover;
	}
	
	public String editarServico() {
		System.out.println("Insira o nome do servico");
		String nomeServicoEditar = this.scanner.next();
		System.out.println("Insira a descricao do servico");
		String descricaoServicoEditar= this.scanner.next();
		System.out.println("Insira o valor do servico");
		double valorEditar = this.scanner.nextDouble();
		return this.hdDados.servicoParaPadrao(nomeServicoEditar, descricaoServicoEditar, valorEditar);
	}
	
	public String pegarNomeServico() {
		System.out.println("Insira o nome do servico");
		String nomeServico = this.scanner.next();
		return nomeServico;
	}
}
