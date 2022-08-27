package com.regressados.regressadosCFC.repository;

import org.springframework.data.repository.CrudRepository;

import com.regressados.regressadosCFC.orm.UnidadeORM;

public interface UnidadeRepository extends CrudRepository<UnidadeORM, Integer> {

}
