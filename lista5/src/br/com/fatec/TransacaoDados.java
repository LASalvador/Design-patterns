package br.com.fatec;

import java.time.LocalDateTime;

public class TransacaoDados {
	private Transacao transacao;
	private String local;
	private FormataData formataData;
	private DiffData diffData;
	
	public TransacaoDados(Transacao transacao, String local) {
		this.transacao = transacao;
		this.local = local;
		this.transacao.setData(this.formatarData());
	}
	private String formatarData() {
		LocalDateTime data = LocalDateTime.now();
		
		if(this.local.equals("Brasil")) {
			this.formataData = new DataBra();
		} 
		else if(this.local.equals("EUA")) {
			this.formataData = new DataEua();
		}
		return formataData.formataData(data); 
	}
	public String diffOrigem() {
		LocalDateTime data = LocalDateTime.now();
		if(this.local.equals("Brasil")) {
			this.diffData = new DataBra();
		} 
		else if(this.local.equals("EUA")) {
			this.diffData = new DataEua();
		}
	
		return diffData.diffData(this.transacao.getData(), data);
	}
	

}
