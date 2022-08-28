package com.regressados.regressadosCFC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regressados.regressadosCFC.services.AlunoService;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

	@Autowired
	private  AlunoService alunoService;
	
	@GetMapping("/teste")
	public String retornoTeste() {
		return alunoService.testeRetorno("Total de Alunos: ");
	}

}

