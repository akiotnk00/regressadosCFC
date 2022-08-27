package com.regressados.regressadosCFC.repository;

import org.springframework.data.repository.CrudRepository;

import com.regressados.regressadosCFC.orm.DespesaORM;

public interface DespesaRepository extends CrudRepository<DespesaORM, Integer> {

}
