package com.regressados.regressadosCFC.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regressados.regressadosCFC.orm.VeiculoORM;
import com.regressados.regressadosCFC.repository.AlunoRepository;
import com.regressados.regressadosCFC.repository.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository veiculoRepository;
	
	public  Iterable<VeiculoORM> findAll() {
		
		return veiculoRepository.findAll();
	}
	
}
