package br.com.fatec;

public class Principal {
	public static void main(String[] args) {
		Conta c1 = new Conta("João", 100);
		Conta c2 = new Conta("Maria", 100);
		
		Transacao t1 =  new Transacao(c1, c2, 50);
		TransacaoDados td1 = new TransacaoDados(t1, "EUA");
		
		System.out.println(t1.getData());
		System.out.println(td1.diffOrigem());
	}
}

//https://www.mkyong.com/java/how-to-calculate-date-time-difference-in-java/