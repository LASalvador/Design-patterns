package br.com.fatec.main;

import java.sql.SQLException;

import br.com.fatec.controller.Controller;
import br.com.fatec.services.SQLite;
public class Principal {
	public static void main(String[] args) {	
		SQLite connect = null;	
		connect = new SQLite();
		connect.initDB();
		
		Controller c = new Controller();
		c.inicio();
	}
}
