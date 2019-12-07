package br.com.fatec.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fatec.model.Veiculo;
import br.com.fatec.model.VeiculoGroup;

public class VeiculoService extends Services {
	
	private VeiculoGroup veiculos;
	
	public VeiculoService() {
		veiculos = new VeiculoGroup();
	}
	
	public Veiculo criarVeiculo(String veiculo) {
		String[] dadosVeiculo = this.handlerDados.PadraoParaVeiculo(veiculo);
		Veiculo v = new Veiculo(dadosVeiculo[0],dadosVeiculo[1], dadosVeiculo[2],Double.parseDouble(dadosVeiculo[3]));
		return v;
	}
	
	public VeiculoGroup criarVeiculoGroup(ResultSet resultSet) {
		VeiculoGroup sg = new VeiculoGroup();
		try {
			while (resultSet.next()) {
			    String numPlaca = resultSet.getString("num_placa");
			    String modelo = resultSet.getString("modelo");
			    String anoFabricacao = resultSet.getString("ano_fabricacao");
			    double valor = resultSet.getDouble("valor");
			
			    Veiculo v = new Veiculo(modelo,anoFabricacao, numPlaca, valor);
			    
			    sg.adicionarVeiculo(v);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sg;
	}
	
	public Veiculo criarVeiculo(ResultSet rs) {
		Veiculo v = null;
		try {
			v = new Veiculo(rs.getString("numPlaca"), rs.getString("modelo"),rs.getString("anoFabricacao"), rs.getDouble("valor"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return v;
	}
	
	public int pegarIdVeiculo(ResultSet rs) {
		int id = -1;
		
		try {
			id = rs.getInt("id");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return id;
	}
}