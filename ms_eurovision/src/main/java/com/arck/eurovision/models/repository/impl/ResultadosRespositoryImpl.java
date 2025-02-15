package com.arck.eurovision.models.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.arck.eurovision.models.entity.Resultados;
import com.arck.eurovision.models.repository.ResultadosRespository;

import jakarta.persistence.EntityManager;

@Repository
public class ResultadosRespositoryImpl implements ResultadosRespository{
	
	@Autowired
    private EntityManager entityManager;

	private final static String SELECT_GET_VOTOS = "SELECT "
	+ "	p.id, p.nombre, p.bandera, p.cancion_youtube, p.cantante, p.cancion, COALESCE(SUM(v.voto), 0) AS voto_total "
	+"FROM pais p "
	+"LEFT JOIN voto v ON v.pais = p.id " 
	+"GROUP BY p.id, p.bandera, p.nombre, p.id "
	+"order by voto_total DESC ";
	
	@SuppressWarnings("unchecked")
	public List<Resultados> getVotacion(){
		return entityManager.createNativeQuery(SELECT_GET_VOTOS)
		         .getResultList();
	}
}
