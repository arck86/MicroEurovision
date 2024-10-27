package com.arck.eurovision.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arck.eurovision.service.PaisesService;

@RestController
public class PaisesController {
	
	@Autowired
	private PaisesService paisesService;
	
	@GetMapping("/listar")
	public ResponseEntity<?> listar(){
		return ResponseEntity.ok(paisesService.listar());
	}

}
