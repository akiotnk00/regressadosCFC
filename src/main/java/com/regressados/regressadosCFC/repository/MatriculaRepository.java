package com.regressados.regressadosCFC.repository;

import org.springframework.data.repository.CrudRepository;

import com.regressados.regressadosCFC.orm.MatriculaORM;

public interface MatriculaRepository extends CrudRepository<MatriculaORM, Integer> {


}
