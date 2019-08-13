package br.com.fatec;

import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		Veiculo v = new Passeio(2);
		
		 Date data  = new Date();
		 double timeAtual = data.getTime();
		

		ContaEstacionamento c = new ContaEstacionamento();
		c.setVeiculo(v);
		c.setInicio(timeAtual);
		double duasHoras = 2592E6 * 1;
		double timeFinal = timeAtual + duasHoras;
		c.setFim(timeFinal);
		c.calcularDuracao();
		System.out.println(c.calcularValor());

	}

}
