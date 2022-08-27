package com.regressados.regressadosCFC.orm;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pagamentos")
public class PagamentoORM {

	// Atributos.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	private String formaPagamento;
	private BigDecimal valor;
	private LocalDate dataPagamento;
	private String descricao;
	
	// Relacionamentos.
	@ManyToOne
	@JoinColumn(name = "orcamento_id", nullable = false)
	private OrcamentoORM orcamento;
	
	@OneToMany(mappedBy = "pagamento")
	private List<ParcelaORM> parcelas;
	
	// Getters e Setters.
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public LocalDate getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public OrcamentoORM getOrcamento() {
		return orcamento;
	}
	public void setOrcamento(OrcamentoORM orcamento) {
		this.orcamento = orcamento;
	}
	public List<ParcelaORM> getParcelas() {
		return parcelas;
	}
	public void setParcelas(List<ParcelaORM> parcelas) {
		this.parcelas = parcelas;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	
}
