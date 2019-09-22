package br.com.fatec;

import java.util.ArrayList;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "list")
public class PagamentoList {
	
	@XmlElements({
		@XmlElement(name = "br.com.pageseguro.RemessaBoleto", type = Pagamento.class),
		@XmlElement(name = "br.com.pageseguro.RemessaCartaoDebito", type = Pagamento.class),
		@XmlElement(name = "br.com.pageseguro.RemessaCartaoCredito", type = Pagamento.class)
	})
	private ArrayList<Pagamento> lista = new ArrayList<>();

	public ArrayList<Pagamento> getPagamentos() {
		return lista;
	}

	public void setPagamentos(ArrayList<Pagamento> pagamentos) {
		this.lista = pagamentos;
	}
}
