package Proyecto;

import java.util.Scanner;

public class Menu {

	static int numPartida = 0;
	
	
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
			Primitiva menuPrimitiva = new Primitiva();
			numPartida++;
			menuPrimitiva.iniciar(numPartida);
			inicioMenu();
		}
		else  if (numeroMenu == 2) {
            Historial historial = new Historial();
            historial.mostrarHistorial();
			inicioMenu();
        }
		else if (numeroMenu == 3) {
			System.out.println("¡Hasta pronto!");
		}
	}

}