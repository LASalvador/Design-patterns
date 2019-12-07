package br.com.fatec.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fatec.model.Cliente;
import br.com.fatec.model.ClienteGroup;

public class ClienteService extends Services {
	private ClienteGroup clientes;
	
	public ClienteService() {
		clientes = new ClienteGroup();
	}
	
	public Cliente criarCliente(String cliente) {
		String[] dadosCliente = this.handlerDados.PadraoParaCliente(cliente);
		Cliente c = new Cliente(dadosCliente[0], dadosCliente[1], dadosCliente[2], dadosCliente[3]);
		return c;
	}
	
	public Cliente criarCliente(ResultSet rs) {
		Cliente c = null;
		try {
			c = new Cliente(rs.getString("nome"), rs.getString("cpf"), rs.getString("telefone"), rs.getString("endereco"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return c;
	}
	
	public ClienteGroup criarClienteGroup(ResultSet resultSet) {
		ClienteGroup cg = new ClienteGroup();
		try {
			while (resultSet.next()) {
			    String nome = resultSet.getString("nome");
			    String cpf = resultSet.getString("cpf");
			    String telefone = resultSet.getString("telefone");
			    String endereco = resultSet.getString("endereco");
			    
			    Cliente c = new Cliente(nome,cpf, telefone, endereco);
			    cg.adicionarCliente(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cg;
	}
	
	public int pegarIdCliente(ResultSet rs) {
		int id = -1;
		try {
			id = rs.getInt("id");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return id;
	}
}
