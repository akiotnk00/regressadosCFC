package com.regressados.regressadosCFC.orm;

import java.time.LocalDate;

public class IndisponibilidadeORM {
	// Atributos.
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private String descricao;

	// Relacionamentos.
	private InstrutorORM instrutor;
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
	
	
}
