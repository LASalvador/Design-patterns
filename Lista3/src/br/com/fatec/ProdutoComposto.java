package br.com.fatec;

import java.util.ArrayList;

public class ProdutoComposto extends Produto{
	 private ArrayList<Produto> listaProdutos;
	 
	public ProdutoComposto(String nome) {
		this.nome= nome;
		this.listaProdutos = new ArrayList<Produto>();
	}
	
	public void adicionarProduto(Produto p) {
		listaProdutos.add(p);
	}
	
	public void calcularValorTotal(){
		for(int i=0; i < listaProdutos.size(); i++) {
			this.valorProduto += listaProdutos.get(i).getValorProduto();
		}
	}
	
}
