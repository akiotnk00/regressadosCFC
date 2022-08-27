package com.regressados.regressadosCFC.orm;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "unidades")
public class UnidadeORM {

	// Atributos.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	private String nome;
	private String telefone;
	private String email;
	private LocalDate registro;
	private LocalDate validade;

	// Relacionamentos.
	@OneToMany(mappedBy = "unidade")
	private List<InstrutorORM> instrutores;
	@OneToMany(mappedBy = "unidade")
	private List<AlunoORM> alunos;
	@OneToMany(mappedBy = "unidade")
	private List<VeiculoORM> veiculos;
	@OneToMany(mappedBy = "unidade")
	private List<FuncionarioORM> funcionarios;

	// Getters e Setters.
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<InstrutorORM> getInstrutores() {
		return instrutores;
	}

	public void setInstrutores(List<InstrutorORM> instrutores) {
		this.instrutores = instrutores;
	}

	public List<AlunoORM> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<AlunoORM> alunos) {
		this.alunos = alunos;
	}

	public List<VeiculoORM> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<VeiculoORM> veiculos) {
		this.veiculos = veiculos;
	}

	public List<FuncionarioORM> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<FuncionarioORM> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public LocalDate getRegistro() {
		return registro;
	}

	public void setRegistro(LocalDate registro) {
		this.registro = registro;
	}

	public LocalDate getValidade() {
		return validade;
	}

	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}

}
