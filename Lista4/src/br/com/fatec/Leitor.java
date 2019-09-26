package br.com.fatec;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Leitor {
	private File arquivoRemessa;
	private FileReader leitorArquivo;
	private String extensao;
	private Parser parserArquivo;
	private ArrayList<Pagamento> pagamentos;
	
	public Leitor(String caminhoArquivo) {
		this.arquivoRemessa = new File(caminhoArquivo);
		this.extensao = caminhoArquivo.substring(caminhoArquivo.lastIndexOf("."), caminhoArquivo.length());
	}
	
	public ArrayList<Pagamento> lerArquivo() {
		if(!this.arquivoRemessa.exists()) {
			System.out.println("Arquivo não existe");
			return null;
		}
		
		if(extensao.equals(".json")) {
			parserArquivo = new ParserJson();
		} else {
			parserArquivo = new ParserXML();
		}
		
		pagamentos = parserArquivo.parserArquivo(arquivoRemessa);
		return pagamentos;
	}
	
	public File getArquivoRemessa() {
		return arquivoRemessa;
	}


	public void setArquivoRemessa(File arquivoRemessa) {
		this.arquivoRemessa = arquivoRemessa;
	}


	public String getExtensao() {
		return extensao;
	}


	public void setExtensao(String extensao) {
		this.extensao = extensao;
	}


	public ArrayList<Pagamento> getPagamentos() {
		return pagamentos;
	}


	public void setPagamentos(ArrayList<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}
}

// https://howtodoinjava.com/gson/gson-parse-json-array/
// http://www.javacreed.com/simple-gson-example/
// https://pt.stackoverflow.com/questions/336050/ler-xml-com-xstream