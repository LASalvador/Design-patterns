package br.com.fatec.service;

import java.sql.*;

import br.com.fatec.model.Agendamento;
import br.com.fatec.model.Cliente;
import br.com.fatec.model.Veiculo;

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
				+ "cpf varchar(11),"
				+ "telefone varchar(70),"
				+ "endereco varchar(90));");
			this.stm.execute("CREATE TABLE IF NOT EXISTS veiculo ("
					+ "id integer PRIMARY KEY AUTOINCREMENT,"
					+ "num_placa varchar(8),"
					+ "modelo varchar(70),"
					+ "ano_fabricacao varchar(4),"
					+ "valor real);");
//			this.stm.execute("DROP TABLE IF  EXISTS agendamento");
			this.stm.execute("CREATE TABLE IF NOT EXISTS agendamento("
					+ "id integer PRIMARY KEY AUTOINCREMENT,"
					+ "cliente_id integer,"					
					+ "veiculo_id integer,"
					+ "descricao varchar(10),"
					+ "data varchar(10),"
					+ "FOREIGN KEY(veiculo_id) REFERENCES veiculo(id),"
					+ "FOREIGN KEY(cliente_id) REFERENCES cliente(id));");
		} 
		catch (SQLException e) {
			e.printStackTrace();  
		}
	}
	
	public void inserirCliente(Cliente cliente) {
		try {
			this.stm.execute("insert into cliente(nome, cpf, telefone, endereco) values ("
					+ "'"  + cliente.getNome() + "',"
					+ "'" + cliente.getCpf() + "',"
					+ "'" + cliente.getTelefone() + "',"
					+ "'" + cliente.getEndereco() + "'" 
					+ ");" );
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public ResultSet listarTodosCliente() {
		ResultSet resultSet = null;
	
		try {
			resultSet = this.stm.executeQuery("select * from cliente order by nome");
			
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
		+ "cpf = "+ c.getCpf()  + ", "
		+ "telefone = '"+ c.getTelefone()  + "', "
		+ "endereco = '"+ c.getEndereco()  + "' "
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
	

	public void inserirVeiculo(Veiculo veiculo) {
		try {
			this.stm.execute("insert into veiculo(num_placa, modelo, ano_fabricacao, valor) values ("
					+ "'" + veiculo.getNumPlaca() + "',"
					+ "'" + veiculo.getModelo()+ "',"
					+ "'" + veiculo.getAnoFabricacao()+ "',"
					+ veiculo.getValor() 
					+ ");" );
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public ResultSet listarTodosVeiculos() {
		ResultSet resultSet = null;
		
		try {
			resultSet = this.stm.executeQuery("select * from veiculo order by modelo");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultSet;
	}
	
	public ResultSet selecionarVeiculo(String numPlaca) {
		ResultSet resultSet = null;
		try {
			
			String query = "select * from veiculo where num_placa =  '" + numPlaca + "'"; 
			resultSet = this.stm.executeQuery(query);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultSet;		
	}
	
	public void atualizarVeiculo(Veiculo v, int id) {

		String query = "UPDATE veiculo " 
		+ "SET num_placa = '"+ v.getNumPlaca()  + "', "
		+ "modelo = '"+ v.getModelo()  + "', "
		+ "ano_fabricacao = '"+ v.getAnoFabricacao()  + "', "
		+ "valor = "+ v.getValor() +" "
		+ "WHERE id = " + id;
	
		try {
			this.stm.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deletarVeiculo(int id) {
		String query = "DELETE FROM veiculo WHERE id = " + id + ";" ;
		try {
			this.stm.execute(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void inserirAgendamento(Agendamento a, int idCliente, int idVeiculo) {
		try {
			this.stm.execute("insert into agendamento(descricao, data, cliente_id,veiculo_id) values ("
					+ "'" + a.getDescricao() + "',"
					+ "'" + a.getDataAgendamento() + "',"
					+ idCliente+ ","
					+ idVeiculo 
					+ " );" );
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void atualizarDataAgendamento(String data, int id) {

		String query = "UPDATE agendamento " 
		+ "SET data = '"+ data  + "' "
		+ "WHERE id = " + id;
	
		try {
			this.stm.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deletarAgendamento(int id) {
		String query = "DELETE FROM agendamento WHERE id = " + id + ";" ;
		try {
			this.stm.execute(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet listarAgendamentos() {
		ResultSet resultSet = null;
		try {
			
			String query = "select c.nome as 'nomeCliente', a.data as 'data', " 
			+ "v.modelo as 'modelo' , v.num_placa as 'placa' , a.descricao as 'desc' "
			+ "from agendamento a inner join cliente c on a.cliente_id = c.id " 
			+ "inner join veiculo v on a.veiculo_id = v.id;"; 
			resultSet = this.stm.executeQuery(query);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultSet;
	}
}
