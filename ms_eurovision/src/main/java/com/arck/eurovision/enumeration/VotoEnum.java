package com.arck.eurovision.enumeration;

public enum VotoEnum {
	
	UNO(1,"Uno"),
	DOS(2,"Dos"),
	TRES(3,"Tres"),
	CUATRO(4,"Cuatro"),
	CINCO(5,"Cinco"),
	SEIS(6,"Seis"),
	SIETE(7,"Siete"),
	OCHO(8,"Ocho"),
	NUEVE(9,"Nueve"),
	DIEZ(10,"Diez"),
	ONCE(11,"Once"),
	DOCE(12,"Doce");
	
	private int id;
	private String numero;
	
	
	private VotoEnum(int id, String numero) {
		this.id = id;
		this.numero = numero;
	}
	
	public int getId() {
		return id;
	}
	public String getNumero() {
		return numero;
	}	

}
