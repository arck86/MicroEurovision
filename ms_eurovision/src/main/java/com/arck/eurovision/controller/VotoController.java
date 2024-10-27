package com.arck.eurovision.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arck.eurovision.models.entity.Voto;

@RestController 
public class VotoController {
	
//	@Autowired
//	VotoService votoService;

	@PostMapping("/votos/save")
	public ResponseEntity<?> save(@RequestBody List<Voto> votos){
		return null;
	}
}
