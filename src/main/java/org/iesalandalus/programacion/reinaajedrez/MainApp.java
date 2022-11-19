package org.iesalandalus.programacion.reinaajedrez;
import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;
import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {

	private static void crearReinaDefecto() {
		Reina reina = new Reina();
	}

	private static void crearReinaColor(Color color) {

		Reina reina = new Reina(color);

	}
	
	private void mover() throws OperationNotSupportedException, NullPointerException, IllegalArgumentException{
		Consola.mostrarMenuDirecciones(); 
		Direccion direccionmain=Consola.elegirDireccion();
		int pasosmain=Consola.elegirPasos();
		
		reina.mover(direccionmain, pasosmain);
	}

	int opcion = Consola.elegirOpcionMenu();
	{

		switch (opcion) {

		case 1:

		case 2:

		case 3:

		default:
		}
	}
	
	public Reina reina = null;
	
	public static void main(String[] args) {
	}

}
