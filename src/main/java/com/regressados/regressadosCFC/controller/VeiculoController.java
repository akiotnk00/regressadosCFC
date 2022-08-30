package com.regressados.regressadosCFC.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regressados.regressadosCFC.orm.VeiculoORM;
import com.regressados.regressadosCFC.services.VeiculoService;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoController {

	@Autowired
	private VeiculoService veiculoService;

	@GetMapping
	public Page<VeiculoORM> findVeiculos(Pageable pageable) {
		return veiculoService.findVeiculos(pageable);

	}
}
