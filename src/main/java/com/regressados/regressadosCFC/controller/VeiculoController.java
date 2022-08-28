package com.regressados.regressadosCFC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regressados.regressadosCFC.orm.VeiculoORM;
import com.regressados.regressadosCFC.services.AlunoService;
import com.regressados.regressadosCFC.services.VeiculoService;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoController {

	@Autowired
	private  VeiculoService veiculoService;
	
	@GetMapping("/todos")
	public Iterable<VeiculoORM> findAll() {
		return veiculoService.findAll();

}
}

