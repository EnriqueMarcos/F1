package Proyecto;

import java.util.Scanner;

public class Primitiva {



	public static void main(String[] args) {
		int[] juego1 = new int[6];
		
		System.out.println("Dime los 6 numeros");
		for (int i = 0; i < juego1.length; i++) {
		    juego1[i] = leerNumero(1, 20);
		}
		System.out.println("Introduce el reintegro ");
		int reintegro = leerNumero(0,9); 
		if(reintegro < 9 || reintegro > 0) {
			System.out.println("error");
		}
	}

	
	public static int leerNumero(int i, int j) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		return s;
	}
}
