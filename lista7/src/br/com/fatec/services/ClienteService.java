package br.com.fatec.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fatec.model.Cliente;
import br.com.fatec.model.ClienteGroup;

public class ClienteService extends Services{ 
	
	public Cliente criarCliente(String cliente) {
		String[] dadosCliente = this.handlerDados.padraoParaCliente(cliente);
		Cliente c = new Cliente(dadosCliente[0],Integer.parseInt(dadosCliente[1]), dadosCliente[2], dadosCliente[3], dadosCliente[4]);
		return c;
	}
	public Cliente criarCliente(ResultSet rs) {
		Cliente c = null;
		try {
			c = new Cliente(rs.getString("nome"), rs.getInt("idade"), rs.getString("genero"), rs.getString("telefone"), rs.getString("dataNasc"));
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
			    int idade = resultSet.getInt("idade");
			    String genero = resultSet.getString("genero");
			    String telefone = resultSet.getString("telefone");
			    String dataNasc = resultSet.getString("dataNasc");
			    
			    Cliente c = new Cliente(nome,idade, genero, telefone, dataNasc);
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
