package com.regressados.regressadosCFC.repository;

import org.springframework.data.repository.CrudRepository;

import com.regressados.regressadosCFC.orm.FuncionarioORM;

public interface FuncionarioRepository extends CrudRepository<FuncionarioORM, Integer> {

}
