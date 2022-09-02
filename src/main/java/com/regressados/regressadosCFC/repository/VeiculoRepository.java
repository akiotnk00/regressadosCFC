package com.regressados.regressadosCFC.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.regressados.regressadosCFC.orm.VeiculoORM;

public interface VeiculoRepository extends JpaRepository<VeiculoORM, Integer> {
	
	@Query("SELECT v FROM VeiculoORM v")
	Page<VeiculoORM> findVeiculosORM(Pageable pageable);
	
	
}
