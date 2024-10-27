package com.arck.eurovision.models.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
@Table(name="voto")
public class Voto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
//	private Pais Pais;
	
	@Min(1)
	@Max(13)
	private Integer voto;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

//	public Pais getPais() {
//		return Pais;
//	}
//
//	public void setPais(Pais pais) {
//		Pais = pais;
//	}

	public Integer getVoto() {
		return voto;
	}

	public void setVoto(Integer voto) {
		this.voto = voto;
	}
	
}
