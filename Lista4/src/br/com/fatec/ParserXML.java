package br.com.fatec;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ParserXML implements Parser{

	@Override
	public ArrayList<Pagamento> parserArquivo(File leitor) {
		PagamentoList p = null;
		
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(PagamentoList.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			p = (PagamentoList)unmarshaller.unmarshal(leitor);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return p.getPagamentos();
	}

}
