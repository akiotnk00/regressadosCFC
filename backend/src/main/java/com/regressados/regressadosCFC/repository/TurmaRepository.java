package com.regressados.regressadosCFC.repository;

import org.springframework.data.repository.CrudRepository;

import com.regressados.regressadosCFC.orm.TurmaORM;

public interface TurmaRepository extends CrudRepository<TurmaORM, Integer> {

}
