package Proyecto;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		System.out.println("Opciones:" + "\n" + "1. Jugar" + "\n" + "2. Ver historial" + "\n" + "3. Salir");
		Scanner scannerMenu = new Scanner (System.in);
		int numeroMenu = scannerMenu.nextInt();
		while (numeroMenu != 1 && numeroMenu != 2 && numeroMenu != 3) {
			System.out.println("Introduzca un número entre 1 y 3.");
			numeroMenu = scannerMenu.nextInt();
		}
		if (numeroMenu == 1) {
			Primitiva menuPrimitiva = new Primitiva();
			menuPrimitiva.iniciar();
		}
		else if (numeroMenu == 2) {
			Historial menuHistorial = new Historial();
		}
		else if (numeroMenu == 3) {
			System.out.println("¡Hasta pronto!");
		}
	}

}