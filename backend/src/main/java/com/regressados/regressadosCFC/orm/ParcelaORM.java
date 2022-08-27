package com.regressados.regressadosCFC.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "parcelas")
public class ParcelaORM {
	// Atributos.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	
	// Relacionamentos.
	@ManyToOne
	@JoinColumn(name = "pagamento_id", nullable = false)
	private PagamentoORM pagamento;

	// Getters e Setters.
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public PagamentoORM getPagamento() {
		return pagamento;
	}

	public void setPagamento(PagamentoORM pagamento) {
		this.pagamento = pagamento;
	}
	
	
}
