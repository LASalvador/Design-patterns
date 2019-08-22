package br.com.fatec;

import java.util.Date;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Date data  = new Date();
		double timeAtual = data.getTime();
		Scanner s = new Scanner(System.in);
		Veiculo v = null;
		System.out.println("Insira o tipo do veiculo: \n 1-Passeio\n2-Carga\n");
		int tipoVeiculo = s.nextInt();
		
		if(tipoVeiculo == 1) {
			System.out.println("Qual a categoria do carro: \n");
			String cat = s.nextLine();
			v = new Passeio(cat);
		}
		else if (tipoVeiculo == 2){
			System.out.println("Quantidade de eixos: \n");
			int eixos = s.nextInt();
			
			System.out.println("Qual o valor da carga: \n");
			double vCarga = s.nextDouble();
			v = new Carga("D", eixos, vCarga);
		}
		
		System.out.println("Insira o tipo de plano: \n 1-Hora\n2-Diaria\n3-Mensal\n");
		int tipoPlano = s.nextInt();
		
		double unidadeTempo = 0;
		if(tipoPlano == 1) unidadeTempo = 36E5;
		else if(tipoPlano == 2) unidadeTempo = 36E5;
		else if(tipoPlano == 3) unidadeTempo = 2592E6;
		
		System.out.println("Tempo que ira ficar: \n");
		double tempoEst = s.nextDouble();
		
		
		ContaEstacionamento c = new ContaEstacionamento();
		c.setVeiculo(v);
		c.setInicio(timeAtual);
		double fim = unidadeTempo * tempoEst;
		double timeFinal = timeAtual + fim;
		c.tipo = tipoPlano;
		c.setFim(timeFinal);
		c.calcularDuracao();
		c.setTaxa();
		System.out.println(c.calcularValor());
	}
}
