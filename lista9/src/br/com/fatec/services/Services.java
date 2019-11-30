package br.com.fatec.services;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Services {
	HandlerDados handlerDados;
	
	public Services() {
		this.handlerDados = new HandlerDados();
	}
	
	public int retornarId(ResultSet resultSet) {
		int id = -1;
		
		try {
			id = resultSet.getInt("id");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return id;
	}
}
