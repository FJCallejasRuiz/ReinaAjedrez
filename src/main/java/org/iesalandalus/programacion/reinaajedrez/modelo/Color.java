package org.iesalandalus.programacion.reinaajedrez.modelo;

public enum Color {
	BLANCO("Blanco"),
	NEGRO("Negro");

	public String cadenaAMostrar;

	private Color(String cadena) {
		this.cadenaAMostrar = cadena;
	}
	
	
	
}