package com.regressados.regressadosCFC.orm;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class PraticaORM {

	// Atributos.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;

	// Relacionamentos.
	private AgendamentoORM agendamento;

	// Getters e Setters.
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public AgendamentoORM getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(AgendamentoORM agendamento) {
		this.agendamento = agendamento;
	}

}
