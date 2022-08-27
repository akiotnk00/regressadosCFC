package com.regressados.regressadosCFC.orm;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="teoricas")
public class TeoricaORM {

	// Atributos.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	private LocalDate dataTeorica;
	
	// Relacionamentos.
	@ManyToOne
	@JoinColumn(name = "turma_id", nullable = false)
	private TurmaORM turma;
	
	@ManyToOne
	@JoinColumn(name = "instrutor_id", nullable = false)
	private InstrutorORM instrutor;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public LocalDate getDataTeorica() {
		return dataTeorica;
	}
	public void setDataTeorica(LocalDate dataTeorica) {
		this.dataTeorica = dataTeorica;
	}
	public TurmaORM getTurma() {
		return turma;
	}
	public void setTurma(TurmaORM turma) {
		this.turma = turma;
	}
	public InstrutorORM getInstrutor() {
		return instrutor;
	}
	public void setInstrutor(InstrutorORM instrutor) {
		this.instrutor = instrutor;
	}

	
	
}
