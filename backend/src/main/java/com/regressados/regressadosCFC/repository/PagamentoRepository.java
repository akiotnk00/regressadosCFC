package com.regressados.regressadosCFC.repository;

import org.springframework.data.repository.CrudRepository;

import com.regressados.regressadosCFC.orm.PagamentoORM;

public interface PagamentoRepository extends CrudRepository<PagamentoORM, Integer> {

}
