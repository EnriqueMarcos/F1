package Proyecto;

import java.util.Scanner;

public class Primitiva {

	public void iniciar(int numPartida) {
		
		int[] numerosJugador = new int[6];
		
		System.out.println("Dime los 6 numeros");
		for (int i = 0; i < numerosJugador.length; i++) {
			int numero = leerNumero();
			while (numero < 0 || numero > 20) {
				System.out.println("Introduce un numero entre 0 y 20 ");
				numero = leerNumero();
			}
				
		    for (int j = 0; j < i; j++) {
		        while (numero == numerosJugador[j]) {
		            System.out.println("No puedes repetir numeros ");
		            numero = leerNumero();
		        }
		    }

		    numerosJugador[i] = numero;
		    
		}
		
		System.out.println("Introduce el reintegro ");
		int reintegro = leerNumero(); 
		while(reintegro < 0 || reintegro > 9) {
			System.out.println("Numero no valido, introduce otro: ");
			reintegro = leerNumero();
			
		}
		
		System.out.println("*********** - ");
		Combinacion partida = new Combinacion(numPartida, numerosJugador, reintegro);
		
		Combinacion combiGanadora = new Combinacion(numPartida, numerosJugador, reintegro);
		combiGanadora = combiGanadora.generarCombinacion();
		
		
		
		
		StringBuffer str = new StringBuffer();
		str.append("------------");
		str.append("\n");
		str.append("Partida ");
		str.append(partida.numPartida);
		str.append("\n");
		str.append("Combinacion: ");
		System.out.print(str.toString());
		
		for (int i = 0; i < numerosJugador.length; i++) {
			System.out.print(numerosJugador[i] + " ");
		}
		
		System.out.println();
		System.out.println("Reintegro: " + partida.reintegro);
		System.out.println("------------");
		
		
		
		StringBuffer str1 = new StringBuffer();
		str.append("------------");
		str.append("\n");
		str.append("Partida ");
		str.append(combiGanadora.numPartida);
		str.append("\n");
		str.append("Combinacion: ");
		System.out.print(str1.toString());
		
		for (int i = 0; i < combiGanadora.numeros.length; i++) {
			System.out.print(combiGanadora.numeros[i] + " ");
		}
		
		System.out.println();
		System.out.println("Reintegro: " + combiGanadora.reintegro);
		System.out.println("------------");
		
		
		
		
		
	}

	
	public static int leerNumero() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		return s;
	}
}
