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
@Table(name = "orcamentos")
public class OrcamentoORM {
	// Atributos.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	private boolean status;
	private BigDecimal valor;
	private String categoria;
	private LocalDate dataOrcamento;

	// Relacionamentos.
	@ManyToOne
	@JoinColumn(name = "aluno_id", nullable = true)
	private AlunoORM aluno;
	
	@OneToMany(mappedBy = "orcamento")
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

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

}
