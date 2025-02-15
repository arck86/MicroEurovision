package com.arck.eurovision.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.arck.eurovision.models.entity.Pais;

public interface PaisRepository extends JpaRepository<Pais, Long>{
	
	@Query("from Pais p order by p.nombre asc")
	public List<Pais> findAllByOrden();
	
}
