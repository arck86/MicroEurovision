package com.arck.eurovision.service;

import java.util.List;

import com.arck.eurovision.models.entity.Resultados;
import com.arck.eurovision.models.entity.Voto;

public interface VotoService {

	List<Voto> save(List<Voto> votos);
	
	List<Resultados> findVotosWithInfo();

}
