package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;
import org.iesalandalus.programacion.reinaajedrez.Consola;
import org.iesalandalus.programacion.reinaajedrez.modelo.Posicion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;
import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {

	private static void crearReinaDefecto() {
		reina = new Reina();
	}

	private static void crearReinaColor(Color color) {

		reina = new Reina(color);

	}

	private static void mover() throws OperationNotSupportedException, NullPointerException, IllegalArgumentException {
		Consola.mostrarMenuDirecciones();
		Direccion direccionmain = Consola.elegirDireccion();
		int pasosmain = Consola.elegirPasos();

		reina.mover(direccionmain, pasosmain);
	}

	private static void mostrarReina() {
		if (reina == null) {
			System.out.println("No hay ninguna reina creada.");
		} else {
			System.out.print("Los atributos de la reina son: ");
			String mensajePosicion=reina.toString();
			System.out.println(mensajePosicion);
		}
	}

	private static int ejecutarOpcion() {

		int opcion = Consola.elegirOpcionMenu();
		{

			switch (opcion) {

			case 1:
				crearReinaDefecto();
				return opcion;
			case 2:
				try {
					Color colormain = Consola.elegirOpcion();
					crearReinaColor(colormain);
					return opcion;
				} catch (NullPointerException e) {
					System.out.println(e.getMessage());
				}

			case 3:
				try {
					mover();
					mostrarReina();
				} catch (OperationNotSupportedException e) {

					System.out.println(e.getMessage());
				} catch (NullPointerException e) {

					e.printStackTrace();
				} catch (IllegalArgumentException e) {

					System.out.println(e.getMessage());
			
				}
				return opcion;
			default:
				Consola.despedirse();
				return opcion;
			}
		}
	}

	public static Reina reina;

	public static void main(String[] args) {

		int escogido;
		do {
			Consola.mostrarMenu();
			escogido = ejecutarOpcion();

		} while (escogido >= 1 && escogido <= 3);

	}

}
