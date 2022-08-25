package com.regressados.regressadosCFC.orm;

import java.util.List;


public class PessoaORM {
	
	// Atributos.
	private long codigo;
	private String cpf;
	private String nomeCompleto;
	
	// Relacionamentos.
	private List<EnderecoORM> enderecos;
	private List<TelefoneORM> telefones;
	
	// Getters e Setters.
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public List<EnderecoORM> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(List<EnderecoORM> enderecos) {
		this.enderecos = enderecos;
	}
	public List<TelefoneORM> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<TelefoneORM> telefones) {
		this.telefones = telefones;
	}
	
	
}
