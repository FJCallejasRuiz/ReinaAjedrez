package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {

	private Color color;
	private Posicion posicion;

	
	public Reina() {
		color=Color.BLANCO;
		posicion=new Posicion(1,'d');
	}

	public Color getColor() {
		return color;
	}

	private void setColor(Color color) {
		if (color == Color.BLANCO || color == Color.NEGRO) {

			this.color = color;
		} else {
			throw new IllegalArgumentException("ERROR: Color no válida.");

		}
	}

	public Posicion getPosicion() {
		return posicion;
	}

	private void setPosicion(Posicion posicion) {

		if (posicion.getFila() >= 1 && posicion.getFila() <= 8 &&

				(
				posicion.getColumna() == 'a' ||
				posicion.getColumna() == 'b' ||
				posicion.getColumna() == 'c' ||
				posicion.getColumna() == 'd' ||
				posicion.getColumna() == 'e' ||
				posicion.getColumna() == 'f' ||
				posicion.getColumna() == 'g' ||
				posicion.getColumna() == 'h'))

		{
			this.posicion = posicion;

		} else {
			throw new IllegalArgumentException("ERROR: Posición no válida.");
		}
	}
	
	
	
	
	
}
