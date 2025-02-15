package com.arck.eurovision.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arck.eurovision.models.entity.Resultados;
import com.arck.eurovision.models.entity.Voto;
import com.arck.eurovision.models.repository.ResultadosRespository;
import com.arck.eurovision.models.repository.VotoRepository;
import com.arck.eurovision.service.VotoService;

@Service
public class VotoServiceImpl implements VotoService{
	
	@Autowired
	private VotoRepository votoRepository;
	
	@Autowired
	private ResultadosRespository resultadosRespository;
	
	@Override
	public List<Voto> save(List<Voto> votos){
		return votoRepository.saveAll(votos);
	}
	
	public List<Resultados> findVotosWithInfo(){
		return resultadosRespository.getVotacion();
	}
}
