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

		CalculoValor cv = null;

		if (c.duracao <= (12 * 3600000)) {
			cv = new ValorHora(c.getVeiculo().valor);
		} 
		else if(c.duracao <= (15 * 86400000)){
			cv = new ValorDiaria(c.getVeiculo().valor);
		} else {
			cv = new ValorMensal(c.getVeiculo().valor);
		}

		
		c.setCalculoValor(cv);
		c.calcularValor();

	}

}
