package com.arck.eurovision.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arck.eurovision.models.entity.Pais;
import com.arck.eurovision.models.repository.PaisRepository;
import com.arck.eurovision.service.PaisesService;

@Service
public class PaisesServiceImpl implements PaisesService {
	
	@Autowired
	private PaisRepository paisRepository;
	
	@Override
	public List<Pais> listar(){
		return paisRepository.findAllByOrden();
	}

}
