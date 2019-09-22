package br.com.fatec;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import com.google.gson.reflect.TypeToken;
import com.google.gson.*;

public class ParserJson implements Parser{
	@Override
	public ArrayList<Pagamento> parserArquivo(File leitor) {
		
		FileReader leitorArquivo = null;
		try {
			leitorArquivo = new FileReader(leitor);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("========Errrrrooou==========");
			e.printStackTrace();
		}
		Gson gson = new Gson();
		Type userListType = new TypeToken<ArrayList<Pagamento>>(){}.getType();
		ArrayList<Pagamento> pagamentos = gson.fromJson(leitorArquivo, userListType);
		if(pagamentos == null) {
			System.out.println("Erro ao ler");
			return null;
		}
		return pagamentos;
	}

}
