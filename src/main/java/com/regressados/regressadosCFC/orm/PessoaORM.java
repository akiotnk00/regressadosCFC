package com.regressados.regressadosCFC.orm;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

@MappedSuperclass
public abstract class PessoaORM {

	// Atributos.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	private String cpf;
	private String nomeCompleto;
	private LocalDate dataNascimento;

	// Relacionamentos.
	@OneToMany(cascade = CascadeType.ALL)
	private List<EnderecoORM> enderecos;

	@OneToMany(cascade = CascadeType.ALL)
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
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
