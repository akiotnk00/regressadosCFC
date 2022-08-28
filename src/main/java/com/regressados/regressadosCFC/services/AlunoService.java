package com.regressados.regressadosCFC.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regressados.regressadosCFC.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;
	
	public  String testeRetorno(String teste) {
		
		return teste+alunoRepository.count();
	}
	
}
