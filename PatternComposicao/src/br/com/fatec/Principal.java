package br.com.fatec;

import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		Veiculo v = new Passeio(2);

		ContaEstacionamento c = new ContaEstacionamento();
		c.setVeiculo(v);

		CalculoValor cv = null;

//		if (v.tempo < (15 * 3600000)) {
//			cv = new ValorDiaria(c.getVeiculo().valor);
//
//		}

		c.setCalculo(cv);

	}

}
