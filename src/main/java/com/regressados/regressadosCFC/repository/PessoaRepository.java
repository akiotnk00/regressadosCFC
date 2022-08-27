package com.regressados.regressadosCFC.repository;

import org.springframework.data.repository.CrudRepository;

import com.regressados.regressadosCFC.orm.PessoaORM;

public interface PessoaRepository extends CrudRepository<PessoaORM, Integer> {

}
