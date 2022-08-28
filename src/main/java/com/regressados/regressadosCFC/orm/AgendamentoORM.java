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
@Table(name = "agendamentos")
public class AgendamentoORM {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	private LocalDate dataAgendamento;

	// Relacionamentos.
	@ManyToOne
	@JoinColumn(name = "matricula_id", nullable = false)
	private MatriculaORM matricula;

	@ManyToOne
	@JoinColumn(name = "instrutor_id", nullable = false)
	private InstrutorORM instrutor;

	@ManyToOne
	@JoinColumn(name = "veiculo_id", nullable = false)
	private VeiculoORM veiculo;

	@ManyToOne
	@JoinColumn(name = "funcionario_id", nullable = false)
	private FuncionarioORM funcionario;

	// Getters e Setters.
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public LocalDate getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(LocalDate dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	public InstrutorORM getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(InstrutorORM instrutor) {
		this.instrutor = instrutor;
	}

	public VeiculoORM getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(VeiculoORM veiculo) {
		this.veiculo = veiculo;
	}

	public MatriculaORM getMatricula() {
		return matricula;
	}

	public void setMatricula(MatriculaORM matricula) {
		this.matricula = matricula;
	}

}
