package com.regressados.regressadosCFC.orm;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "despesas")
public class DespesaORM {
	// Atributos.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	private BigDecimal valor;
	private String descricao;
	private LocalDate dataDespesa;
	
	// Relacionamentos.
	@ManyToOne
	@JoinColumn(name = "veiculo_id", nullable = true)
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

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataDespesa() {
		return dataDespesa;
	}

	public void setDataDespesa(LocalDate dataDespesa) {
		this.dataDespesa = dataDespesa;
	}

	public VeiculoORM getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(VeiculoORM veiculo) {
		this.veiculo = veiculo;
	}

	public FuncionarioORM getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(FuncionarioORM funcionario) {
		this.funcionario = funcionario;
	}
	
	
	
}
