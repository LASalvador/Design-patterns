package br.com.fatec;

public class Principal {

	public static void main(String[] args) {
	
	Produto p1 = new Produto("blusa",50);
	p1.setDescricao("blusa vinho, tamanho M, algodao");
	
	Produto p2 = new Produto("barbeador", 15);
	p2.setDescricao("lamina 3X, nao causa irritacao");
	
	Produto p3 = new Produto("iluminador",35);
	p3.setDescricao("iluminador bruna Tavares, 350ml, rose gold");
	
	Produto p4 = new Produto("boneca",200);
	p4.setDescricao("baby a life doentinha, faz xixi e fala");
	
	Produto p5 = new Produto("xiaomi redmi 6", 800);
	p5.setDescricao("celuar high tech, ultima geracao");

	Produto p6 = new Produto("barbie",100);
	p6.setDescricao("barbie cole��o princesa, com coroa e varios vestidos");
	
	
//	Produtos compostos 1
	ProdutoComposto pc1 = new ProdutoComposto("Composicao");
	pc1.adicionarProduto(p1);
	pc1.adicionarProduto(p2);
	pc1.adicionarProduto(p3);
	pc1.calcularValorTotal();
	Desconto d1 = new Desconto(25, 1);
	CalculadorPreco c1 = new CalculadorPreco(pc1,d1);
	System.out.println("Produto "+ pc1.getNome() +" : "+c1.calcularPreco());
//	Produtos compostos2	
	ProdutoComposto pc2 = new ProdutoComposto("Composicao 2");
	pc2.adicionarProduto(p4);
	pc2.adicionarProduto(p5);
	pc2.adicionarProduto(p6);
	pc2.calcularValorTotal();
	Desconto d2 = new Desconto(50, 2);
	CalculadorPreco c2 = new CalculadorPreco(pc2,d2);
	System.out.println("Produto "+pc2.getNome() +" : "+c2.calcularPreco());

	
	}

}
