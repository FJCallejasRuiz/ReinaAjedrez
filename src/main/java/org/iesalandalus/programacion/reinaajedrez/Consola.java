package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
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

			break;
		case 2:
			System.out.println("Has escogido la opción '2. Crear reina eligiendo un color.'");
			break;
		case 3:
			System.out.println("Has escogido la opción '3. Mover reina.'");
			break;
		case 4:
			System.out.println("Has escogido la opción '4. Salir del menú.'");
			break;
		}
		return numeroMenu;
		}

	public static Color elegirOpcion() {
		System.out.println("Elija el color de la reina.");
		System.out.println("1. BLANCA.");
		System.out.println("2. NEGRA.");
		int colorMenu=Entrada.entero();
		while (colorMenu!=1 || colorMenu!=2) {
			System.out.println("El número introducido no pertenece a una opción, inténtelo de nuevo.");
			colorMenu = Entrada.entero();
		}
		if(colorMenu==1) {
			System.out.println("Has escogido la opción '1. BLANCA.'");
			return Color.BLANCO;
		}else
			System.out.println("Has escogido la opción '2. NEGRA.'");
			return Color.NEGRO;
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
