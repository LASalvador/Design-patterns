package br.com.fatec.model;

import java.util.ArrayList;

public class ClienteGroup {
	
	private ArrayList<Cliente> clientes;
	
	public ClienteGroup() {
		clientes = new ArrayList<Cliente>(); 
	}
	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	public ArrayList<Cliente> getClientes(){
		return this.clientes;
	}
	public Cliente getClienteNaPosicao(int posicao) {
		return this.clientes.get(posicao);
	}
	public int tamanhoGrupo() {
		return this.clientes.size();
	}
}
