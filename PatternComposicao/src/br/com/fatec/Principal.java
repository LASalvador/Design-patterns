package br.com.fatec;

import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		Veiculo v = new Passeio(2);
		
		// Date data = new Date();
		// data.getTime()

		ContaEstacionamento c = new ContaEstacionamento();
		c.setInicio()
		c.setVeiculo(v);
		c.setFim();
		c.calcularDuracao();
		c.calcularValor();

	}

}
