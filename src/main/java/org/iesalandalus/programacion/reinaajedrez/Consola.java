package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

	private Consola() {
	}

	public static void mostrarMenu() {
		System.out.println("Menú del ajedrez realizado por Francisco Javier Callejas Ruiz.");
		System.out.println("1. Crear reina por defecto.");
		System.out.println("2. Crear reina eligiendo un color.");
		System.out.println("3. Mover reina.");
		System.out.println("4. Salir del menú.");
	}

	public static int elegirOpcionMenu() {
		System.out.println("Por favor, escriba el número de la opción que desee.");
		int numeroMenu = Entrada.entero();
		while (numeroMenu < 1 || numeroMenu > 4) {
			System.out.println("El número introducido no pertenece a una opción, inténtelo de nuevo.");
			numeroMenu = Entrada.entero();
		}
		switch (numeroMenu) {

		case 1:
			System.out.println("Has escogido la opción '1. Crear reina por defecto.'");

			return numeroMenu;
		case 2:
			System.out.println("Has escogido la opción '2. Crear reina eligiendo un color.'");
			return numeroMenu;
		case 3:
			System.out.println("Has escogido la opción '3. Mover reina.'");
			return numeroMenu;
		default:
			System.out.println("Has escogido la opción '4. Salir del menú.'");
			return numeroMenu;
		}

	}

	public static Color elegirOpcion() {
		System.out.println("Elija el color de la reina.");
		System.out.println("1. BLANCA.");
		System.out.println("2. NEGRA.");
		int colorMenu = Entrada.entero();
		while (colorMenu != 1 || colorMenu != 2) {
			System.out.println("El número introducido no pertenece a una opción, inténtelo de nuevo.");
			colorMenu = Entrada.entero();
		}
		if (colorMenu == 1) {
			System.out.println("Has escogido la opción '1. BLANCA.'");
			return Color.BLANCO;
		} else
			System.out.println("Has escogido la opción '2. NEGRA.'");
		return Color.NEGRO;
	}

	public static void mostrarMenuDirecciones() {
		System.out.println("Las direcciones de movimiento son:");
		System.out.println("1. Norte.");
		System.out.println("2. Noreste.");
		System.out.println("3. Este.");
		System.out.println("4. Sureste.");
		System.out.println("5. Sur.");
		System.out.println("6. Suroeste.");
		System.out.println("7. Oeste.");
		System.out.println("8. Noroeste.");
	}

	public static Direccion elegirDireccion() {
		System.out.println("Elija la opción de movimiento.");
		int direccionMenu = Entrada.entero();
		while (direccionMenu < 1 || direccionMenu > 8) {
			System.out.println("El número introducido no pertenece a una opción, inténtelo de nuevo.");
			direccionMenu = Entrada.entero();
		}
		switch (direccionMenu) {
		case 1:
			return Direccion.NORTE;
		case 2:
			return Direccion.NORESTE;
		case 3:
			return Direccion.ESTE;
		case 4:
			return Direccion.SURESTE;
		case 5:
			return Direccion.SUR;
		case 6:
			return Direccion.SUROESTE;
		case 7:
			return Direccion.OESTE;
		default:
			return Direccion.NOROESTE;
		}

	}

	public static int elegirPasos() {
		System.out.println("Por favor, elija el número de pasos a mover la reina.");
		int pasosReina = Entrada.entero();
		return pasosReina;
	}

}
