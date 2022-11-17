package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Reina {

	private Color color;
	private Posicion posicion;

	
	public Reina() {
		this.setColor(Color.BLANCO);
		posicion=new Posicion(1,'d');
	}
	
	public Reina(Color color) {
		if (color == null){
			throw new NullPointerException("ERROR: El color no puede ser nulo.");
		}else {
			
		if (color == Color.BLANCO) {
			this.setColor(Color.BLANCO);
			posicion=new Posicion(1,'d');
		}else {
			this.setColor(Color.NEGRO);
			posicion=new Posicion(8,'d');
		}
		}
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
	
	public void mover (Direccion direccion, int pasos) throws OperationNotSupportedException {
		if (direccion == null) {
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		}
		
		if (pasos<1 || pasos>7) {
			throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
		}
		
		int filaTemporal=posicion.getFila();
		char colTemporal=posicion.getColumna();
		
		switch (direccion) {
			case NORTE:	
				filaTemporal += pasos;
			break;
			
			case NORESTE:
				filaTemporal += pasos;
				colTemporal += pasos;
			break;
			
			case ESTE:
				colTemporal += pasos;
			break;
			
			case SURESTE:
				filaTemporal -= pasos;
				colTemporal += pasos;
			break;
			
			case SUR:
				filaTemporal -= pasos;
			break;
			
			case SUROESTE:
				filaTemporal -= pasos;
				colTemporal -= pasos;
			break;
			
			case OESTE:
				colTemporal -= pasos;
			break;
			
			case NOROESTE:
				filaTemporal += pasos;
				colTemporal -= pasos;
			break;	
		}
		
	
		if (filaTemporal>=1 && filaTemporal<=8 && (
				colTemporal == 'a' ||
				colTemporal == 'b' ||
				colTemporal == 'c' ||
				colTemporal == 'd' ||
				colTemporal == 'e' ||	
				colTemporal == 'f' ||
				colTemporal == 'g' ||
				colTemporal == 'h')) {
			posicion=new Posicion(filaTemporal,colTemporal);
		}else {
			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
		}
		
		
		
		
		
	}
	
	@Override
	public String toString() {
		return "color=" + color + ", posicion=(fila=" + posicion.getFila() +", columna="+ posicion.getColumna()+")";
	}
	
}
