package com.regressados.regressadosCFC.orm;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ExameORM {

	// Atributos.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	private String tipo;
	private List<MatriculaORM> matriculasMarcadas;
	private List<MatriculaORM> matriculasAprovadas;
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public List<MatriculaORM> getMatriculasMarcadas() {
		return matriculasMarcadas;
	}
	public void setMatriculasMarcadas(List<MatriculaORM> matriculasMarcadas) {
		this.matriculasMarcadas = matriculasMarcadas;
	}
	public List<MatriculaORM> getMatriculasAprovadas() {
		return matriculasAprovadas;
	}
	public void setMatriculasAprovadas(List<MatriculaORM> matriculasAprovadas) {
		this.matriculasAprovadas = matriculasAprovadas;
	}

	
}
