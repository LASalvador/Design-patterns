package br.com.fatec.services;

import java.sql.*;

import javax.naming.spi.DirStateFactory.Result;

import br.com.fatec.model.Cliente;
import br.com.fatec.model.ClienteGroup;

public class SQLite {
	private Connection conn;
	private Statement stm;

	public SQLite() {
		try {
			this.conn = DriverManager.getConnection("jdbc:sqlite:lista.db");
			this.stm = this.conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error ao criar banco");
		}
		
	}

	public void initDB() {	  
		try {
	
			this.stm.execute("CREATE TABLE IF NOT EXISTS cliente ("
				+ "id integer PRIMARY KEY AUTOINCREMENT,"
				+ "nome varchar(70),"
				+ "idade integer,"
				+ "genero varchar(70),"
				+ "telefone varchar(70),"
				+ "dataNasc varchar(70));");
			this.stm.execute("CREATE TABLE IF NOT EXISTS servico ("
					+ "id integer PRIMARY KEY AUTOINCREMENT,"
					+ "nome varchar(70),"
					+ "valor real,"
					+ "descricao varchar(70));");
			
			this.stm.execute("CREATE TABLE IF NOT EXISTS servicoXCliente("
					+ "id integer PRIMARY KEY AUTOINCREMENT,"
					+ "cliente_id integer,"					
					+ "servico_id integer,"
					+ "FOREIGN KEY(servico_id) REFERENCES servico(id)"
					+ "FOREIGN KEY(cliente_id) REFERENCES cliente(id));");
		} 
		catch (SQLException e) {
			e.printStackTrace();  
		}  
	}
	
	public void inserirCliente(Cliente cliente) {
		try {
			this.stm.execute("insert into cliente(nome, idade, genero, telefone, datanasc) values ("
					+ "'"  + cliente.getNome() + "',"
					+ cliente.getIdade() + ","
					+ "'" + cliente.getGenero() + "',"
					+ "'" + cliente.getTelefone() + "',"
					+ "'" + cliente.getdataNasc() + "'" 
					+ ");" );
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public ResultSet listarTodosCliente() {
		ResultSet resultSet = null;
	
		try {
			resultSet = this.stm.executeQuery("select * from cliente");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultSet;
	}
	public ResultSet selecionarCliente(String nomeCliente) {
		ResultSet resultSet = null;
		try {
			
			String query = "select * from cliente where nome =  '" + nomeCliente + "'"; 
			resultSet = this.stm.executeQuery(query);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultSet;
	}
	
	public void atualizarCliente(Cliente c, int id) {
		String query = "UPDATE cliente " 
		+ "SET nome = '"+ c.getNome()  + "', "
		+ "idade = "+ c.getIdade()  + ", "
		+ "genero = '"+ c.getGenero()  + "', "
		+ "telefone = '"+ c.getTelefone()  + "', "
		+ "dataNasc = '"+ c.getdataNasc()  + "' "
		+ "WHERE id = " + id;
	
		try {
			this.stm.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deletarCliente(int id) {
		String query = "DELETE FROM cliente WHERE id = " + id + ";" ;
		try {
			this.stm.execute(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
