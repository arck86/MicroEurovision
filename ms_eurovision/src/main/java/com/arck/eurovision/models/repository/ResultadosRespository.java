package com.arck.eurovision.models.repository;

import java.util.List;

import com.arck.eurovision.models.entity.Resultados;

public interface ResultadosRespository {

	public List<Resultados> getVotacion();
}
