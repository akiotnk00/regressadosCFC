package com.regressados.regressadosCFC.orm;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "alunos")
public class AlunoORM extends PessoaORM {
	// Teste Akio
	// Relacionamentos.
	@OneToMany(mappedBy = "aluno")
	private List<MatriculaORM> matriculas;

	@ManyToOne
	@JoinColumn(name = "unidade_id", nullable = false)
	private UnidadeORM unidade;
	
	// Getters e Setters.
	public List<MatriculaORM> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<MatriculaORM> matriculas) {
		this.matriculas = matriculas;
	}

	public UnidadeORM getUnidade() {
		return unidade;
	}

	public void setUnidade(UnidadeORM unidade) {
		this.unidade = unidade;
	}
	
}
