package Proyecto;

import java.util.Scanner;

public class Primitiva {

	

	public static void main(String[] args) {
		int[] juego1 = new int[6];
		
		System.out.println("Dime los 6 numeros");
		for (int i = 0; i < juego1.length; i++) {
			
		    juego1[i] = leerNumero(1, 20);
		        
		}
	}
	
	
	public static int leerNumero(int i, int j) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		return s;
	}
}
