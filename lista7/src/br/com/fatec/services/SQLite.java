package br.com.fatec.services;

import java.sql.*;

public class SQLite {
	private Connection conn;
	private Statement stm;

	public SQLite() throws SQLException {
		this.conn = DriverManager.getConnection("jdbc:sqlite:lista.db");
		this.stm = this.conn.createStatement();
	}

	public void initDB() {	  
		try {
			this.stm.executeUpdate("DROP TABLE IF EXISTS cliente");
			
			this.stm.executeUpdate("CREATE TABLE cliente ("
				+ "id integer PRIMARY KEY NOT NULL,"
				+ "nome varchar(70),"
				+ "idade integer"
				+ "genero varchar(70),"
				+ "telefone varchar(70),"
				+ "dataNasc varchar(70);");
			this.stm.executeUpdate("CREATE TABLE cliente ("
					+ "id integer PRIMARY KEY NOT NULL,"
					+ "nome varchar(70),"
					+ "idade integer"
					+ "genero varchar(70),"
					+ "telefone varchar(70),"
					+ "dataNasc varchar(70);");
		} 
		catch (SQLException e) {
			e.printStackTrace();  
		}  
	}
}
