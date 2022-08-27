package com.regressados.regressadosCFC.orm;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "matriculas")
public class MatriculaORM {
	// Atributos.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	private LocalDate dataMatricula;
	
	// Relacionamentos.
	@ManyToOne
	@JoinColumn(name = "aluno_id", nullable = false)
	private AlunoORM aluno;
	
	@OneToMany(mappedBy = "matricula")
	private List<AgendamentoORM> agendamentos;
	
	@ManyToOne
	@JoinColumn(name = "turma_id", nullable = false)
	private TurmaORM turma;
	
	// Getters e Setters.
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public LocalDate getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(LocalDate dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public AlunoORM getAluno() {
		return aluno;
	}

	public void setAluno(AlunoORM aluno) {
		this.aluno = aluno;
	}
	
	
}
