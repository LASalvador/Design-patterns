package br.com.fatec.view;

import br.com.fatec.model.AgendamentoGroup;
import br.com.fatec.service.HandlerDados;

public class viewAgendamento extends View {
	
	public String cadastroAgendamento() {
		System.out.println("Digite o nome do cliente");
		String nomeCliente = this.scanner.next();
		System.out.println("Digite a data do agendamento");
		String dataAgendamento = this.scanner.next();
		System.out.println("Digite o servico");
		String descricaoAgendamento = this.scanner.next();
		System.out.println("Digite a placa do veiculo");
		String numPlacaVeiculo = this.scanner.next();
		
		return this.hdDados.cadastroAgendamento(nomeCliente, dataAgendamento, descricaoAgendamento , numPlacaVeiculo);
	}
	
	public void listarTodosAgendamnetos(AgendamentoGroup ag) {
		for(int i = 0 ; i< ag.tamanhoGrupo() ; i++) {
			System.out.println(ag.getAgendamentoNaPosicao(i).toString());
		}
	}
	
	public int pesquisarAgendamento() {
		System.out.println("Insira o id do agendamento");
		int id = this.scanner.nextInt();
		return id;
	}
	
	public String edicaoAgendamento() {
		System.out.println("Digite a data do agendamento");
		String dataAgendamentoEditar = this.scanner.next();
		return dataAgendamentoEditar;
	}
}
