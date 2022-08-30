package com.regressados.regressadosCFC.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.regressados.regressadosCFC.orm.VeiculoORM;
import com.regressados.regressadosCFC.repository.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository veiculoRepository;
	
	public  Page<VeiculoORM> findVeiculos(Pageable pageable) {
		
		return veiculoRepository.findVeiculosORM(pageable);
	}
	
}
