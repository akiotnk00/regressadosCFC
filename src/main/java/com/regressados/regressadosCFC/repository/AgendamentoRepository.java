package com.regressados.regressadosCFC.repository;

import org.springframework.data.repository.CrudRepository;

import com.regressados.regressadosCFC.orm.AgendamentoORM;

public interface AgendamentoRepository extends CrudRepository<AgendamentoORM, Integer> {

}
