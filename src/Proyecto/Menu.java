package Proyecto;

import java.util.Scanner;

public class Menu {


	public static void main(String[] args) {
		System.out.println("Opciones:" + "\n" + "1. Jugar" + "\n" + "2. Ver historial" + "\n" + "3. Salir");
		Scanner scannerMenu = new Scanner (System.in);
		int numeroMenu = scannerMenu.nextInt();
		if (numeroMenu == 1) {
			System.out.println("---");
			Primitiva menuPrimitiva = new Primitiva();
		}
		else if (numeroMenu == 2) {
			System.out.println("2222");
			Historial menuHistorial = new Historial();
		}
		else if (numeroMenu == 3) {
			scannerMenu.close();
		}else {
			System.out.println("Introduzca un número entre 1 y 3.");
		}
	}
	

}
