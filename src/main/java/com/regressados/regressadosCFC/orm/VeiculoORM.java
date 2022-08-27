package com.regressados.regressadosCFC.orm;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "veiculos")
public class VeiculoORM {
	
	// Atributos.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	// Ativo, Desativado, Manutenção,
	private String situacao;
	private String placa;
	private Integer ano;
	private String cor;
	private String modelo;
	private String marca;
	private String tipo;

	// Relacionamentos.
	@OneToMany(mappedBy = "veiculo")
	private List<DespesaORM> despesas;
	
	@OneToMany(mappedBy = "veiculo")
	private List<AgendamentoORM> agendamentos;
	
	@OneToMany(mappedBy = "veiculo")
	private List<IndisponibilidadeORM> indisponibilidades;
	
	// Getters e Setters.
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<DespesaORM> getDespesas() {
		return despesas;
	}

	public void setDespesas(List<DespesaORM> despesas) {
		this.despesas = despesas;
	}

	public List<AgendamentoORM> getAgendamentos() {
		return agendamentos;
	}

	public void setAgendamentos(List<AgendamentoORM> agendamentos) {
		this.agendamentos = agendamentos;
	}

	public List<IndisponibilidadeORM> getIndisponibilidades() {
		return indisponibilidades;
	}

	public void setIndisponibilidades(List<IndisponibilidadeORM> indisponibilidades) {
		this.indisponibilidades = indisponibilidades;
	}
	
	

}
