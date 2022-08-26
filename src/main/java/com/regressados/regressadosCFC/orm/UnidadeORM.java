package com.regressados.regressadosCFC.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "unidades")
public class UnidadeORM {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
}
