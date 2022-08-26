package com.regressados.regressadosCFC.orm;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "telefones")
public class TelefoneORM {

	// Atributos.
	private long codigo;
	private String numero;
	private String descricao;
	
	// Relacionamentos.
	private PessoaORM pessoa;

	// Getters e Setters.
	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public PessoaORM getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaORM pessoa) {
		this.pessoa = pessoa;
	}
	
	//
	
}
