package br.com.fatec.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.fatec.model.Cliente;
import br.com.fatec.model.Lancamento;

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
				+ "telefone varchar(70),"
				+ "endereco varchar(70),"
				+ "email varchar(70),"
				+ "senha varchar(70));");
			
//			this.stm.execute("DROP TABLE IF EXISTS servico");
			
			this.stm.execute("CREATE TABLE IF NOT EXISTS conta ("
					+ "id integer PRIMARY KEY AUTOINCREMENT,"
					+ "valor real,"
					+ "cliente_id integer,"					
					+ "FOREIGN KEY(cliente_id) REFERENCES cliente(id));");
			
			this.stm.execute("CREATE TABLE IF NOT EXISTS lancamento("
					+ "id integer PRIMARY KEY AUTOINCREMENT,"
					+ "tipo varchar(70),"
					+ "classificacao varchar(70),"
					+ "decricao varchar(70),"
					+ "valor real,"					
					+ "conta_id integer,"
					+ "FOREIGN KEY(conta_id) REFERENCES conta(id));");
		} 
		catch (SQLException e) {
			e.printStackTrace();  
		}  
	}
// 	Usuario
	public void inserirCliente(Cliente cliente) {
		try {
			this.stm.execute("insert into cliente(nome, telefone, endereco, email, senha) values ("
					+ "'"  + cliente.getNome() + "',"
					+ "'"  + cliente.getTelefone() + "',"
					+ "'" + cliente.getEndereco() + "',"
					+ "'" + cliente.getEmail() + "',"
					+ "'" + cliente.getSenha() + "'" 
					+ ");" );
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public ResultSet verificarCliente(String emailCliente, String senhaCliente) {
		ResultSet resultSet = null;
		try {
			
			String query = "SELECT * FROM cliente WHERE email =  '" + emailCliente + "'"
			+ "AND senha = '" + senhaCliente + "';";
			
			resultSet = this.stm.executeQuery(query);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultSet;
	}
	
	public ResultSet pegarUltimoId() {
		ResultSet resultSet = null;
		try {
			
			String query = "SELECT last_insert_rowid() as 'id';";
			
			resultSet = this.stm.executeQuery(query);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultSet;
	}
	// Conta	
	public void inserirConta(int idUsuario, double valor ) {
		try {
			this.stm.execute("insert into conta(valor, cliente_id) values ("
					+ valor +","
					+ idUsuario 
					+ ");" );
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public ResultSet pegarIdContaPelaUsuario(int idCliente) {
		ResultSet resultSet = null;
		try {
			
			String query = "SELECT id FROM conta WHERE cliente_id = "+ idCliente +" ;";
			
			resultSet = this.stm.executeQuery(query);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultSet;
	}
	// Lancamento
	public void inserirLancamento(Lancamento lancamento, int idConta) {
		try {
			this.stm.execute("insert into lancamento(tipo, classificacao, valor, conta_id) values ("
					+ "'"  + lancamento.getTipoLancamento() + "',"
					+ "'"  + lancamento.getClassificacao() + "',"
					+ lancamento.getValor() + ","
					+ idConta  
					+ ");" );
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
