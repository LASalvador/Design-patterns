package br.com.controller.view;

public class ViewCliente extends View {
	
	public String criarCliente() {
		System.out.println("Insira o nome do cliente");
		String nomeCliente = this.scanner.next();
		System.out.println("Insira o telefone do cliente");
		String telefoneCliente = this.scanner.next();
		System.out.println("Insira o endereço do cliente");
		String enderecoCliente = this.scanner.next();
		System.out.println("Insira o email do cliente");
		String emailCliente = this.scanner.next();
		System.out.println("Insira a senha do cliente");
		String senhaCliente = this.scanner.next();
		return this.hdDados.clienteParaPadrao(nomeCliente,telefoneCliente, enderecoCliente, emailCliente, senhaCliente);
	}

	public String logar() {
		System.out.println("Insira seu email: ");
		String emailCliente = this.scanner.next();
		System.out.println("Insira sua senha: ");
		String senhaCliente = this.scanner.next();
		return this.hdDados.authParaPadrao(emailCliente, senhaCliente);
	}
	
	public double pegarValorContra() {
		System.out.println("Insira o valor inicial da conta:");
		double valor = this.scanner.nextDouble();
		return valor;
	}
	
}
