package com.regressados.regressadosCFC.orm;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "alunos")
public class AlunoORM extends PessoaORM {
	
	// Relacionamentos.
	private String rg;
	private LocalDate dataExpedicao;
	
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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public LocalDate getDataExpedicao() {
		return dataExpedicao;
	}

	public void setDataExpedicao(LocalDate dataExpedicao) {
		this.dataExpedicao = dataExpedicao;
	}
	
	
	
}
