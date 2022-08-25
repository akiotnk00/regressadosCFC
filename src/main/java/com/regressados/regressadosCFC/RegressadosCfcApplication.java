package com.regressados.regressadosCFC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class RegressadosCfcApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegressadosCfcApplication.class, args);
	}

}
