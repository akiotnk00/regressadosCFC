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
@Table(name = "indisponibilidades")
public class IndisponibilidadeORM {
	// Atributos.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private String descricao;

	// Relacionamentos.
	@ManyToOne
	@JoinColumn(name = "instrutor_id", nullable = false)
	private InstrutorORM instrutor;
	@ManyToOne
	@JoinColumn(name = "veiculo_id", nullable = false)
	private VeiculoORM veiculo;

	// Getters e Setters.
	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

}
