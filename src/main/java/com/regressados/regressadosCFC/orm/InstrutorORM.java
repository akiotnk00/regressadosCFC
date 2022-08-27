package com.regressados.regressadosCFC.orm;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "instrutores")
public class InstrutorORM extends PessoaORM{

	// Relacionamentos.
	private List<AgendamentoORM> agendamentos;
	private List<IndisponibilidadeORM> indisponibilidade;
	
	// Getters e Setters.
	public List<AgendamentoORM> getAgendamentos() {
		return agendamentos;
	}
	public void setAgendamentos(List<AgendamentoORM> agendamentos) {
		this.agendamentos = agendamentos;
	}
	public List<IndisponibilidadeORM> getIndisponibilidade() {
		return indisponibilidade;
	}
	public void setIndisponibilidade(List<IndisponibilidadeORM> indisponibilidade) {
		this.indisponibilidade = indisponibilidade;
	}
	
	
}
