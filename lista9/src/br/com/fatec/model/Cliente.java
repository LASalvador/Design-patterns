package br.com.fatec.model;

public class Cliente {
	private String nome;
	private String telefone;
	private String endereco;
	private String email;
	private String senha;
	
	public Cliente(String nomeCliente, String telefoneCliente, String enderecoCliente,
			String emailCliente, String senhaCliente) {
		setNome(nomeCliente);
		setTelefone(telefoneCliente);
		setEndereco(enderecoCliente);
		setEmail(emailCliente);
		setSenha(senhaCliente);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
