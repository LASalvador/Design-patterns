package br.com.fatec.view;

public class ViewServices extends View {
	
	public String criacaoServico() {
		System.out.println("Insira o nome do servico");
		String nomeServico = this.scanner.next();
		System.out.println("Insira a descricao do servico");
		String descricaoServico = this.scanner.next();
		System.out.println("Insira o valor do servico");
		String valor = this.scanner.next();
		return nomeServico + "|" + valor + "|" + descricaoServico;
	}
	
	public String listarTodosServico() {
		System.out.println("Insira o nome do servico");
		String nomeServico = this.scanner.next();
		System.out.println("Insira a descricao do servico");
		String descricaoServico = this.scanner.next();
		System.out.println("Insira o valor do servico");
		String valor = this.scanner.next();
		return nomeServico + "|" + valor + "|" + descricaoServico;
	}
	
	public String listarServico() {
		System.out.println("Insira o nome do servico");
		String nomeServico = this.scanner.next();
		return nomeServico;
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
		String valorEditar = this.scanner.next();
		return nomeServicoEditar+ "|" + valorEditar + "|" + descricaoServicoEditar;
	}
}
