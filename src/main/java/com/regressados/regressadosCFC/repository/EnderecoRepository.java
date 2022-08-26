package com.regressados.regressadosCFC.repository;

import org.springframework.data.repository.CrudRepository;

import com.regressados.regressadosCFC.orm.EnderecoORM;

public interface EnderecoRepository extends CrudRepository<EnderecoORM, Integer> {

}
