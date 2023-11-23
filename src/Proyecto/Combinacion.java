package Proyecto;

import java.util.Arrays;
import java.util.Random;

public class Combinacion {

	int numPartida;
	int[] numeros;
	int reintegro;

	int min = 1;
	int max = 20;


	public Combinacion(int partida, int[] combi, int extra) {

		numPartida = partida;

		numeros = combi;
		reintegro = extra;

	}


	public Combinacion generarCombinacion() {

		numPartida++;
		int[] array = new int[6];
		int numExtra = numeroAleatorio(0, 9);;

		Combinacion combi = new Combinacion(numPartida, array, numExtra);

		for (int i = 0; i < numeros.length; i++ ) {

			array[i] = numeroAleatorio(min, max);

			for (int j = 0; j < i; j++ ) {

				while (array[i] == array[j]){

					array[i] = numeroAleatorio(min, max);

				}

			}

		}

		return combi;
	}


	public int numeroDeAciertos(Combinacion combiPremiada) {
		int aciertos = 0;

		for (int i = 0; i < numeros.length; i++ ) {
			for (int j = 0; j < numeros.length; j++ )
				if (numeros[i] == combiPremiada.numeros[j]) {
					aciertos++;
				}

		}

		return aciertos;



	}


	public String imprimirBoleto() {
		//-------------

		int numEspa = 0;
		int numEsp1 = 0;
		
		StringBuffer stringBuffer = new StringBuffer();
		
		 stringBuffer.append("========================================" + "\n");
		 stringBuffer.append("||                                    ||" + "\n");
		 stringBuffer.append("||      ========                      ||" + "\n");
		 stringBuffer.append("||      ||    ||                      ||" + "\n");
		 stringBuffer.append("||      ||    ||    La Primitiva      ||" + "\n");
		 stringBuffer.append("||      ||    ||                      ||" + "\n");
		 stringBuffer.append("||      ===  ===                      ||" + "\n");
		 stringBuffer.append("||                                    ||" + "\n");
		 stringBuffer.append("||                                    ||" + "\n");
		 stringBuffer.append("||             Partida " + numPartida);
		 
		 if (numPartida < 10){
			 stringBuffer.append(" ");
		 }
		 stringBuffer.append("             ||" + "\n");
		 stringBuffer.append("||                                    ||" + "\n");
		 stringBuffer.append("||   Combinacion: ");
		 
		 Arrays.sort(numeros);
		 
		 for (int i = 0; i < numeros.length; i++) {
				if (numeros[i] <= 9){
					numEspa++;
				}
				 stringBuffer.append(numeros[i] + " ");
		 }
		 
		 for (int n = 0; n < numEspa; n++) {
			 stringBuffer.append(" ");
		 }
		 
		 stringBuffer.append("  ||");
		 stringBuffer.append("\n");
		 stringBuffer.append("||                                    ||" + "\n");
		 stringBuffer.append("||   Reintegro: " + reintegro +  "                     ||" + "\n");
		 stringBuffer.append("||                                    ||" + "\n");
		 stringBuffer.append("||                    Jugado: 2,00€   ||" + "\n");
		 stringBuffer.append("||                                    ||" + "\n");
		 stringBuffer.append("========================================");
		 
		 /*for (int i = 0; i <= 1000; i++) {
	            System.out.println(i + "\t\t" + (char) i);
		 }*/
		 
		 return stringBuffer.toString();
		//-------------

	}
	
	public String imprimirCombiPremiada() {
		//-------------

		int numEspa = 0;
		int numEsp1 = 0;
		
		StringBuffer stringBuffer = new StringBuffer();
		
		 stringBuffer.append("========================================" + "\n");
		 stringBuffer.append("||                                    ||" + "\n");
		 stringBuffer.append("||   Combinacion: ");
		 
		 Arrays.sort(numeros);
		 
		 for (int i = 0; i < numeros.length; i++) {
				if (numeros[i] <= 9){
					numEspa++;
				}
				 stringBuffer.append(numeros[i] + " ");
		 }
		 
		 for (int n = 0; n < numEspa; n++) {
			 stringBuffer.append(" ");
		 }
		 
		 stringBuffer.append("  ||");
		 stringBuffer.append("\n");
		 stringBuffer.append("||                                    ||" + "\n");
		 stringBuffer.append("||   Reintegro: " + reintegro +  "                     ||" + "\n");
		 stringBuffer.append("||                                    ||" + "\n");
		 stringBuffer.append("========================================");
		 
		 return stringBuffer.toString();
		//-------------

	}


	public static int numeroAleatorio(int min, int max){
		Random rn = new Random();
		return rn.nextInt(max-min)+min;
	}

}
