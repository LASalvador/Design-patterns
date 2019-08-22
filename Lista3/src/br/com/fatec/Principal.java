package br.com.fatec;

public class Principal {

	public static void main(String[] args) {
	Produto p1 = new Produto();
	p1.setNome("blusa");
	p1.setValorProduto(50);
	p1.setDescricao("blusa vinho, tamanho M, algodao");
	
	Produto p3 = new Produto();
	p3.setNome("barbeador");
	p3.setValorProduto(15);
	p3.setDescricao("lamina 3X, nao causa irritacao");
	
	Produto p4 = new Produto();
	p4.setNome("iluminador");
	p4.setValorProduto(35);
	p4.setDescricao("iluminador bruna Tavares, 350ml, rose gold");
	
	Produto p5 = new Produto();
	p5.setNome("boneca");
	p5.setValorProduto(200);
	p5.setDescricao("baby a life doentinha, faz xixi e fala");
	
	Produto p6 = new Produto();
	p6.setNome("xiaomi");
	p6.setValorProduto(800);
	p6.setDescricao("celuar high tech, ultima geracao");

	
	Produto p2 = new Produto();
	p2.setNome("barbie");
	p2.setValorProduto(100);
	p2.setDescricao("barbie coleção princesa, com coroa e varios vestidos");
	
	ProdutoComposto pc1 = new ProdutoComposto("Composicao");
	pc1.adicionarProduto(p2);
	pc1.adicionarProduto(p5);
	pc1.adicionarProduto(p4);
	pc1.calcularValorTotal();
	CalculadorPreco c1 = new CalculadorPreco(pc1);
	Desconto d2 = new Desconto(25, 1);
	pc1.setCalPreco(c1);
	pc1.setDesconto(d2);
	System.out.println("Produto Composto 1:"+pc1.getCalPreco().calcularDesconto());
	
	ProdutoComposto pc2 = new ProdutoComposto("Composicao 2");
	pc2.adicionarProduto(p6);
	pc2.adicionarProduto(p1);
	pc2.adicionarProduto(p3);
	pc2.calcularValorTotal();
	CalculadorPreco c2 = new CalculadorPreco(pc2);
	Desconto d1 = new Desconto(50, 2);
	pc2.setCalPreco(c2);
	pc2.setDesconto(d1);
	System.out.println("Produto Composto 2:"+pc2.getCalPreco().calcularDesconto());
	
//	Desconto d2 = new Desconto(25, 1);
//	CalculadorPreco c2 = new CalculadorPreco(p2);
//	p2.setDesconto(d2);
//	p2.setCalPreco(c2);
//	System.out.println("Produto 2:"+p2.getCalPreco().calcularDesconto());
	
	}

}
