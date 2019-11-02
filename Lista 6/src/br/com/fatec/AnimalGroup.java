package br.com.fatec;

import java.util.ArrayList;

public class AnimalGroup {
	private ArrayList<Animal> animais;
	
	public AnimalGroup() {
		this.animais = new ArrayList<Animal>();
	}
	
	public void adicionarAnimal(Animal animal) {
		this.animais.add(animal);
	}
	
	public ArrayList<Animal> getAnimais() {
		return this.animais;
	}
	
}
