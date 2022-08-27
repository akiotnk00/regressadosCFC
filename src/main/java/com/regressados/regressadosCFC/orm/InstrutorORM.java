package com.regressados.regressadosCFC.orm;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "instrutores")
public class InstrutorORM extends PessoaORM {

	// Relacionamentos.
	@OneToMany(mappedBy = "instrutor")
	private List<AgendamentoORM> agendamentos;

	@OneToMany(mappedBy = "instrutor")
	private List<IndisponibilidadeORM> indisponibilidade;

	@ManyToOne
	@JoinColumn(name = "unidade_id", nullable = false)
	private UnidadeORM unidade;

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
