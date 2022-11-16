package org.iesalandalus.programacion.reinaajedrez.modelo;

import java.util.Objects;

public class Posicion {
	private int fila;

	private char columna;

	public Posicion(int numFila, char letColumna) {
		setFila(numFila);
		setColumna(letColumna);
	}
	
	public Posicion(Posicion posicion) {
		if (posicion == null){
			throw new NullPointerException("ERROR: No es posible copiar una posición nula.");
		}else {
		fila = posicion.getFila();
		columna = posicion.getColumna();
		}
	}

	public int getFila() {
		return fila;
	}

	private void setFila(int fila) {
		if (fila < 1 || fila > 8) {
			throw new IllegalArgumentException("ERROR: Fila no válida.");
		} else {
			this.fila = fila;
		}

	}

	public char getColumna() {
		return columna;
	}

	private void setColumna(char columna) {
		switch (columna) {

		case 'a':
			this.columna = columna;
			break;

		case 'b':
			this.columna = columna;
			break;

		case 'c':
			this.columna = columna;
			break;

		case 'd':
			this.columna = columna;
			break;

		case 'e':
			this.columna = columna;
			break;

		case 'f':
			this.columna = columna;
			break;

		case 'g':
			this.columna = columna;
			break;

		case 'h':
			this.columna = columna;
			break;

		default:
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(columna, fila);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}

	
	@Override
	public String toString() {
		return "fila=" + fila + ", columna=" + columna;
	}
	
	
	
}
