package Proyecto;

import java.util.Scanner;

public class Menu {

	static int numPartida = 0;
	
	static int[] array;
	static int numero;
	static int premio;
	static int reintegro;
	static Historial historial = new Historial();;
	
	
	public static void main(String[] args) {
		inicioMenu();
	}
	
	public static void inicioMenu() {
		System.out.println("Opciones:" + "\n" + "1. Jugar" + "\n" + "2. Ver historial" + "\n" + "3. Salir");
		Scanner scannerMenu = new Scanner (System.in);
		int numeroMenu = scannerMenu.nextInt();
		while (numeroMenu != 1 && numeroMenu != 2 && numeroMenu != 3) {
			System.out.println("Introduzca un número entre 1 y 3.");
			numeroMenu = scannerMenu.nextInt();
		}
		if (numeroMenu == 1) {
			numPartida++;
			Primitiva menuPrimitiva = new Primitiva(array, numero, premio, numPartida, reintegro);
			if (historial.agregar(menuPrimitiva) == -1) {
				historial.borrarHistorial();
				numPartida = 1;
				menuPrimitiva.numeroPartida = 1;
				historial.agregar(menuPrimitiva);
			}
			menuPrimitiva.iniciar(numPartida);
			inicioMenu();
		}
		else if (numeroMenu == 2) {
            historial.mostrarHistorial();
			inicioMenu();
        }
		else if (numeroMenu == 3) {
			System.out.println("¡Hasta pronto!");
		}
	}
	
	

}