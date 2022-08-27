package com.regressados.regressadosCFC.repository;

import org.springframework.data.repository.CrudRepository;

import com.regressados.regressadosCFC.orm.AlunoORM;

public interface AlunoRepository extends CrudRepository<AlunoORM, Integer> {

}
