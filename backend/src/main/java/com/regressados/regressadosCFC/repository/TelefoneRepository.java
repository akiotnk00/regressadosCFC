package com.regressados.regressadosCFC.repository;

import org.springframework.data.repository.CrudRepository;

import com.regressados.regressadosCFC.orm.TelefoneORM;

public interface TelefoneRepository extends CrudRepository<TelefoneORM, Integer> {

}
