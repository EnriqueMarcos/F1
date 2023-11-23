package Proyecto;

import java.util.Scanner;

import java.util.Arrays;

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
		
		Combinacion partida = new Combinacion(numPartida, numerosJugador, reintegro);
		
		Combinacion combiGanadora = new Combinacion(numPartida, numerosJugador, reintegro);
		combiGanadora = combiGanadora.generarCombinacion();
		
		
		
		
		//-------------
		
		int numEspa = 0;
		int numEsp1 = 0;
		
		System.out.println("========================================");
		System.out.println("||                                    ||");
		System.out.print("||             Partida " + partida.numPartida);
		
		if (partida.numPartida < 10){
			System.out.print(" ");
		}
		
		System.out.println( "             ||");
		System.out.println("||                                    ||");
		System.out.print("||   Combinacion: ");
		
		Arrays.sort(partida.numeros);
		
		for (int i = 0; i < numerosJugador.length; i++) {
			if (numerosJugador[i] <= 9){
				numEspa++;
			}
				System.out.print(numerosJugador[i] + " ");	
		}
		
		for (int n = 0; n < numEspa; n++) {
			System.out.print(" ");
		}
		
		System.out.print("  ||");
		System.out.println();
		System.out.println("||                                    ||");
		System.out.println("||   Reintegro: " + partida.reintegro +  "                     ||");
		System.out.println("||                                    ||");
		System.out.println("||                    Jugado: 2,00€   ||");
		System.out.println("||                                    ||");
		System.out.print("||   Premiada: ");
		
		Arrays.sort(combiGanadora.numeros);
		
		for (int h = 0; h < combiGanadora.numeros.length; h++) {
			if (combiGanadora.numeros[h] <= 9){
				numEsp1++;
			}
				System.out.print(combiGanadora.numeros[h] + " ");	
		}
		
		for (int n1 = 0; n1 < numEsp1; n1++) {
			System.out.print(" ");
		}
		
		
		System.out.print("     ||");
		System.out.println();
		System.out.println("||                                    ||");
		System.out.println("||   Reintegro: " + combiGanadora.reintegro +  "                     ||");
		System.out.println("||                                    ||");
		System.out.println("========================================");
		System.out.println();
		System.out.println("========================================");
		System.out.println("||                                    ||");
		System.out.println("||       Numero de aciertos: "+ partida.numeroDeAciertos(combiGanadora) + "        ||");
		
		if (reintegro == combiGanadora.reintegro) {
			System.out.println("||                                    ||");
			System.out.println("||        Reintegro acertado          ||");
		}
		else{
			System.out.println("||                                    ||");
			System.out.println("||         Reintegro fallado          ||");
		}
		
		
		if (reintegro != combiGanadora.reintegro && partida.numeroDeAciertos(combiGanadora) == 0) {
			System.out.println("||                                    ||");
			System.out.println("||       ¡¡Ni lo jugado ganas!!       ||");
		}
		
		
		int dineroGanado = 0;
		switch (partida.numeroDeAciertos(combiGanadora)){
		case 1,2,3:
			dineroGanado = 0;
			System.out.println("||                                    ||");
			System.out.println("||          Dinero ganado: "+ dineroGanado + "          ||");
			break;
		case 4:
			dineroGanado = 1000;
			System.out.println("||                                    ||");
			System.out.println("||         Dinero ganado: "+ dineroGanado + "        ||");
			break;
		case 5:
			dineroGanado = 10000;
			System.out.println("||                                    ||");
			System.out.println("||        Dinero ganado: "+ dineroGanado + "        ||");
			break;
		case 6:
			dineroGanado = 1000000;
			System.out.println("||                                    ||");
			System.out.println("||      Dinero ganado: "+ dineroGanado + "        ||");
			break;
		}
		if (reintegro == combiGanadora.reintegro) {
			dineroGanado += 2;
		}
		
		System.out.println("||                                    ||");
		System.out.println("========================================");
		
		//-------------
	}
	
	public static int leerNumero() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		return s;
	}
}
