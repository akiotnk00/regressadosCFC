package com.regressados.regressadosCFC.orm;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "turmas")
public class TurmaORM {
	// Atributos.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	private LocalDate dataAbertura;
	
	// Relacionamentos.
	@OneToMany(mappedBy = "turma")
	private List<MatriculaORM> matriculas;
	
	@OneToMany(mappedBy = "turma")
	private List<TeoricaORM> teoricas;

	// Getters e Setters.
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public List<MatriculaORM> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<MatriculaORM> matriculas) {
		this.matriculas = matriculas;
	}

	public List<TeoricaORM> getTeoricas() {
		return teoricas;
	}

	public void setTeoricas(List<TeoricaORM> teoricas) {
		this.teoricas = teoricas;
	}



	
}
