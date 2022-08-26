package com.regressados.regressadosCFC.orm;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "enderecos")
public class EnderecoORM {

	// Atributos.
	private Integer codigo;
	private String rua;
	private Integer numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private char tipo;

	// Relacionamentos.
	private PessoaORM pessoa;

	
	// Getters e Setters.
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public PessoaORM getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaORM pessoa) {
		this.pessoa = pessoa;
	}
	
	//
	
	
}
