package br.com.fatec;

public class Principal {

	public static void main(String[] args) {
	Produto p1 = new Produto("brusinha", 40.00);
	Desconto d1 = new Desconto(50, 2);
	CalculadorPreco c1 = new CalculadorPreco(p1);
	p1.setDesconto(d1);
	p1.setCalPreco(c1);
	System.out.println("Produto 1:"+p1.getCalPreco().calcularDesconto());
	
	
	
	Produto p2 = new Produto("camiseta", 50.00);
	Desconto d2 = new Desconto(25, 1);
	CalculadorPreco c2 = new CalculadorPreco(p2);
	p2.setDesconto(d2);
	p2.setCalPreco(c2);
	System.out.println("Produto 2:"+p2.getCalPreco().calcularDesconto());
	
	
	

	}

}
