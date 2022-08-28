package com.regressados.regressadosCFC.repository;

import org.springframework.data.repository.CrudRepository;

import com.regressados.regressadosCFC.orm.PraticaORM;

public interface PraticaRepository extends CrudRepository<PraticaORM, Integer> {

}
