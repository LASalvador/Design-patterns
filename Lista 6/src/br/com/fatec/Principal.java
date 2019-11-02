package br.com.fatec;

public class Principal {
	public static void main(String[] args) {
	
		AnimalBuilder ab1 = new AnimalBuilder().iniciarBovino().bovinoComArroba(20).bovinocomSexo('m').bovinocomNovilho(false);
		Animal animal1 = ab1.criarBovino();
		
		AnimalBuilder ab2 = new AnimalBuilder().iniciarBovino().bovinoComKg(150).bovinocomSexo('f').bovinocomNovilho(true);
		Animal animal2 = ab2.criarBovino();
		
		AnimalBuilder ab3 = new AnimalBuilder().iniciarBovino().bovinoComKg(200).bovinocomSexo('f').bovinocomNovilho(false);
		Animal animal3 = ab3.criarBovino();
		
		AnimalBuilder ab4 = new AnimalBuilder().iniciarSuino().suinoComArroba(5);
		Animal animal4 = ab4.criarSuino();
		
		AnimalBuilder ab5 = new AnimalBuilder().iniciarSuino().suinoComKg(70);
		Animal animal5 = ab5.criarSuino();
		
		AnimalGroup ag1 = new AnimalGroup();
		ag1.adicionarAnimal(animal2);
		ag1.adicionarAnimal(animal3);
		ag1.adicionarAnimal(animal4);
		ag1.adicionarAnimal(animal5);
		System.out.println("Animal Unidade em KG");
		// KG		
		String unidade = "KG";
		CalculadorPrecoUnidade c1 = new CalculadorPrecoUnidade(animal1, unidade);
		c1.calcularPreco();
		System.out.println("Animal Grupo em KG");
		CalculadorPrecoGrupo c2 = new CalculadorPrecoGrupo(ag1,unidade);
		c2.calcularPreco();
		
		// Arroba
		unidade = "Arroba";
		System.out.println("Animal Unidade em Arroba");
		CalculadorPrecoUnidade c3 = new CalculadorPrecoUnidade(animal1, unidade);
		c1.calcularPreco();
		System.out.println("Animal Grupo em Arroba");
		CalculadorPrecoGrupo c4 = new CalculadorPrecoGrupo(ag1, unidade);
		c2.calcularPreco();
		
	
	}
}
