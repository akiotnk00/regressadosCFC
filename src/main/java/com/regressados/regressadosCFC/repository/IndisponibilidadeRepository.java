package com.regressados.regressadosCFC.repository;

import org.springframework.data.repository.CrudRepository;

import com.regressados.regressadosCFC.orm.IndisponibilidadeORM;

public interface IndisponibilidadeRepository extends CrudRepository<IndisponibilidadeORM, Integer> {

}
