package br.com.fatec;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pathUser = System.getProperty("user.home");
		String pathArquivo;
		Leitor leitor;
		
		// Pagando caminho do arquivo		
		System.out.println("Digite o caminho do arquivo a partir da pasta do usuario");
		pathArquivo = sc.next();
		pathArquivo = pathUser + "/" + pathArquivo;
		
		leitor = new Leitor(pathArquivo);
	
		ArrayList<Pagamento> pagamento = leitor.lerArquivo();
		
		for(Pagamento pag: pagamento) {
			System.out.println(pag.getNome());
			System.out.println(pag.getCPF());
		}
		
		
		
	}
}
