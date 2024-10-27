package com.arck.eurovision.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arck.eurovision.models.entity.Voto;

public interface VotoRepository extends JpaRepository<Voto, Long>{

}
