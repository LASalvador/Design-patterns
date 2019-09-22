package br.com.fatec;

import java.io.File;
import java.util.ArrayList;

public interface Parser {
	public ArrayList<Pagamento> parserArquivo(File leitor);
}
