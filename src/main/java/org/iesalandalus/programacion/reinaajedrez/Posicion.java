package org.iesalandalus.programacion.reinaajedrez;

import java.util.Objects;

public class Posicion {
	private int fila;

	private char columna;

	public Posicion(int numFila, char letColumna) {
		setFila(numFila);
		setColumna(letColumna);
	}

	public Posicion(Posicion posicion) {
		fila = posicion.getFila();
		columna = posicion.getColumna();
	}

	public int getFila() {
		return fila;
	}

	private void setFila(int fila) {
		if (fila < 1 || fila > 8) {
			throw new IllegalArgumentException("El valor de la fila es incorrecto.");
		} else {
			this.fila = fila;
		}

	}

	public char getColumna() {
		return columna;
	}

	private void setColumna(char columna) {
		switch (columna) {

		case 'A':
			this.columna = columna;
			break;

		case 'B':
			this.columna = columna;
			break;

		case 'C':
			this.columna = columna;
			break;

		case 'D':
			this.columna = columna;
			break;

		case 'E':
			this.columna = columna;
			break;

		case 'F':
			this.columna = columna;
			break;

		case 'G':
			this.columna = columna;
			break;

		case 'H':
			this.columna = columna;
			break;

		default:
			throw new IllegalArgumentException("El valor de la columna es incorrecto.");
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

}
