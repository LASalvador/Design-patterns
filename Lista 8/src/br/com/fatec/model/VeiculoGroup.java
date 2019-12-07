package br.com.fatec.model;

import java.util.ArrayList;

public class VeiculoGroup {
	
	private ArrayList<Veiculo> veiculos;
	
	public VeiculoGroup() {
		veiculos = new ArrayList<Veiculo>(); 
	}
	public void adicionarVeiculo(Veiculo veiculo) {
		veiculos.add(veiculo);
	}
	public ArrayList<Veiculo> getVeiculo(){
		return this.veiculos;
	}
	
	public Veiculo getVeiculoNaPosicao(int posicao) {
		return this.veiculos.get(posicao);
	}
	
	public int tamanhoGrupo() {
		return veiculos.size();
	}
}
