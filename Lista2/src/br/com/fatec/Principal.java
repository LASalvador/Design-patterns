package br.com.fatec;

public class Principal {

	public static void main(String[] args) {
	
		
	Produto p1 = new Produto("brusinha", 40.00);
	Desconto d1 = new Desconto(50, 2);
	CalculadorPreco c1 = new CalculadorPreco(p1,d1);
	System.out.println("Produto "+ p1.getNome() +":"+ c1.calcularPreco());

	Produto p2 = new Produto("camiseta", 50.00);
	Desconto d2 = new Desconto(25, 1);
	CalculadorPreco c2 = new CalculadorPreco(p2,d2);
	System.out.println("Produto "+ p2.getNome() +":"+ c2.calcularPreco());
	
	}

}
