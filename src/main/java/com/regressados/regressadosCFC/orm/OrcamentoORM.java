package com.regressados.regressadosCFC.orm;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class OrcamentoORM {
	// Atributos.
	private boolean status;
	private BigDecimal valor;
	private String categoria;
	private LocalDate dataOrcamento;
	
	// Relacionamentos.
	private AlunoORM aluno;
	private List<PagamentoORM> pagamentos;
	
	// Getters e Setters.
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public LocalDate getDataOrcamento() {
		return dataOrcamento;
	}
	public void setDataOrcamento(LocalDate dataOrcamento) {
		this.dataOrcamento = dataOrcamento;
	}
	public AlunoORM getAluno() {
		return aluno;
	}
	public void setAluno(AlunoORM aluno) {
		this.aluno = aluno;
	}
	public List<PagamentoORM> getPagamentos() {
		return pagamentos;
	}
	public void setPagamentos(List<PagamentoORM> pagamentos) {
		this.pagamentos = pagamentos;
	}
	
	
}
