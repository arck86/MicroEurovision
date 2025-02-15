package com.arck.eurovision.models.entity;

public class Resultados {
	
	private Long id;
	
	private String nombre;
	
	private String bandera;
	
	private String cancionYoutube;
	
	private String cantante;
	
	private String cancion;
	
	private Integer votoTotal;

	public Resultados(Long id, String nombre, String bandera, String cancionYoutube, String cantante, String cancion,
			Integer votoTotal) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.bandera = bandera;
		this.cancionYoutube = cancionYoutube;
		this.cantante = cantante;
		this.cancion = cancion;
		this.votoTotal = votoTotal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getBandera() {
		return bandera;
	}

	public void setBandera(String bandera) {
		this.bandera = bandera;
	}

	public String getCancionYoutube() {
		return cancionYoutube;
	}

	public void setCancionYoutube(String cancionYoutube) {
		this.cancionYoutube = cancionYoutube;
	}

	public String getCantante() {
		return cantante;
	}

	public void setCantante(String cantante) {
		this.cantante = cantante;
	}

	public String getCancion() {
		return cancion;
	}

	public void setCancion(String cancion) {
		this.cancion = cancion;
	}

	public Integer getVotoTotal() {
		return votoTotal;
	}

	public void setVotoTotal(Integer votoTotal) {
		this.votoTotal = votoTotal;
	}

	
}
