package com.regressados.regressadosCFC.repository;

import org.springframework.data.repository.CrudRepository;

import com.regressados.regressadosCFC.orm.VeiculoORM;

public interface VeiculoRepository extends CrudRepository<VeiculoORM, Integer> {

}
