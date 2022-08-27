package com.regressados.regressadosCFC.repository;

import org.springframework.data.repository.CrudRepository;

import com.regressados.regressadosCFC.orm.InstrutorORM;

public interface InstrutorRepository extends CrudRepository<InstrutorORM, Integer> {

}
