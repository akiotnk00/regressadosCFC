package com.regressados.regressadosCFC.orm;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "funcionarios")
public class FuncionarioORM extends PessoaORM {

	// Relacionamentos.
	@ManyToOne
	@JoinColumn(name = "unidade_id", nullable = false)
	private UnidadeORM unidade;

	// Getters e Setters.
	public UnidadeORM getUnidade() {
		return unidade;
	}

	public void setUnidade(UnidadeORM unidade) {
		this.unidade = unidade;
	}

	
	

}
