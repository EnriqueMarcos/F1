package Proyecto;

import java.util.Scanner;
import java.util.Arrays;

public class Primitiva {


	public void iniciar(int numPartida) {

		int[] numerosJugador = new int[6];

		System.out.println("Introduce 6 números (entre 1 y 20)");
		for (int i = 0; i < numerosJugador.length; i++) {
			int numero = leerNumero();
			while (numero < 1 || numero > 20) {
				System.out.println("Error, introduce un número entre 1 y 20");
				numero = leerNumero();
			}

			for (int j = 0; j < i; j++) {
				while (numero == numerosJugador[j]) {
					System.out.println("Error, no puedes repetir números");
					numero = leerNumero();
				}
			}

			numerosJugador[i] = numero;

		}

		System.out.println("Introduce el reintegro (entre 1 y 9)");
		int reintegro = leerNumero(); 
		while(reintegro < 0 || reintegro > 9) {
			System.out.println("Error, introduce un número entre 1 y 9");
			reintegro = leerNumero();

		}

		Combinacion partida = new Combinacion(numPartida, numerosJugador, reintegro);

		Combinacion combiGanadora = new Combinacion(numPartida, numerosJugador, reintegro);
		combiGanadora = combiGanadora.generarCombinacion();


		System.out.print(partida.imprimirBoleto());
		System.out.println(partida.imprimirAciertos(combiGanadora));
		System.out.println(partida.imprimirReintegroAcertado(combiGanadora));
		System.out.print(combiGanadora.imprimirCombiPremiada());
		System.out.println(partida.imprimirPremio(combiGanadora));
		
	}

	
	public static int leerNumero() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		return s;
	}

}