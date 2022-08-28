package com.regressados.regressadosCFC.repository;

import org.springframework.data.repository.CrudRepository;

import com.regressados.regressadosCFC.orm.OrcamentoORM;

public interface OrcamentoRepository extends CrudRepository<OrcamentoORM, Integer> {

}
