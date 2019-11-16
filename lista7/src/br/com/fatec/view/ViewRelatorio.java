package br.com.fatec.view;

public class ViewRelatorio extends View{

	public String cadastrarUsoServico() {
		System.out.println("Digite o id do cliente");
		int idCliente = this.scanner.nextInt();
		System.out.println("Digite o id do servico");
		int idServico = this.scanner.nextInt();
		return this.hdDados.relatorioParaPadrao(idCliente, idServico);
	}
	public void mostrarMediaIdade(String msg, int idade) {
		System.out.println("A " + msg + " é : " + idade);
	}
	public void exibirRelatorio(String servico, int quantidade) {
		System.out.println("O serviço mais pedido é: " + servico + "com " + quantidade + "atendimentos");
	}
}
