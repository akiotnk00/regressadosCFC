package com.regressados.regressadosCFC.orm;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CaixaORM {

	// Atributos.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	private LocalDate dataAbertura;
	private BigDecimal valorInicial;
	
	// Relacionamentos.
	private List<PagamentoORM> pagamentos;
	
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
	public BigDecimal getValorInicial() {
		return valorInicial;
	}
	public void setValorInicial(BigDecimal valorInicial) {
		this.valorInicial = valorInicial;
	}
	public List<PagamentoORM> getPagamentos() {
		return pagamentos;
	}
	public void setPagamentos(List<PagamentoORM> pagamentos) {
		this.pagamentos = pagamentos;
	}
	
	
}
