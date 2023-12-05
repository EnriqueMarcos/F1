package Proyecto;

import java.util.Scanner;
import java.util.Arrays;

public class Primitiva {
	
	int numeroPartida;
	int[] numerosJugador;
	int aciertos;
	int premio;
	int reintegro;
	int capacidad = 6;
	
	/*se crean los valores que tendra el objeto primitiva */
	public Primitiva(int[] arrayNum, int aciertosValor, int premioValor, int partida, int reintegroValor) {
		
		arrayNum = numerosJugador;
		aciertosValor = aciertos;
		premioValor = premio;
		numeroPartida = partida;
		reintegroValor = reintegro;
	}

	/*coloca los numeros que el jugador mete por consola en los espacios vacios*/
	public void iniciar(int numPartida) {
		
		numerosJugador = new int[capacidad];

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
					while (numero < 1 || numero > 20) {
						System.out.println("Error, introduce un número entre 1 y 20");
						numero = leerNumero();
					}
				}
				
			}

			numerosJugador[i] = numero;

		}

		System.out.println("Introduce el reintegro (entre 1 y 9)");
		reintegro = leerNumero(); 
		while(reintegro < 0 || reintegro > 9) {
			System.out.println("Error, introduce un número entre 1 y 9");
			reintegro = leerNumero();

		}

		Combinacion partida = new Combinacion(numPartida, numerosJugador, reintegro);

		Combinacion combiGanadora = new Combinacion(numPartida, numerosJugador, reintegro);
		combiGanadora = combiGanadora.generarCombinacion();
		
		aciertos = partida.numeroDeAciertos(combiGanadora);
		premio = partida.premio(combiGanadora);

		System.out.print(partida.imprimirBoleto());
		System.out.println(partida.imprimirAciertos(combiGanadora));
		System.out.println(partida.imprimirReintegroAcertado(combiGanadora));
		System.out.print(combiGanadora.imprimirCombiPremiada());
		System.out.println(partida.imprimirPremio(combiGanadora));
		
	}
	
	/*se imprimen los resultados*/
	public void imprimirPrimitiva() {
		
		/*Primitiva partida = new Primitiva(numerosJugador, aciertos, premio, numeroPartida, reintegro);*/
		
		StringBuffer stringBuffer = new StringBuffer();
		
		stringBuffer.append("-----------------------------");
		stringBuffer.append("\n");
		stringBuffer.append("         Partida: " + numeroPartida + "\n");
		stringBuffer.append("-Combinacion: ");
		
		for (int i = 0; i < numerosJugador.length; i++) {
			
			stringBuffer.append(numerosJugador[i] + " ");
		}
		
		stringBuffer.append("\n");
		stringBuffer.append("-Reintegro: " + reintegro);
		stringBuffer.append("\n");
		stringBuffer.append("-Aciertos: " + aciertos);
		stringBuffer.append("\n");
		stringBuffer.append("-reintego: " + aciertos);
		stringBuffer.append("\n");
		stringBuffer.append("-Premio: " + premio + "€");
		stringBuffer.append("\n");
		stringBuffer.append("-----------------------------");

		System.out.println(stringBuffer.toString());
		
	}
		
	/*MÉTODO QUE LEE EL NÚMERO INTRODUCIDO EN EL SCANNER*/
	public static int leerNumero() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		return s;
	}

}