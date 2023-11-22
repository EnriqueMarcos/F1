package Proyecto;

import java.util.Random;

public class Combinacion {
	
	int numPartida;
	int[] numeros;
	int reintegro;
	
	int min = 1;
	int max = 20;
	
	public Combinacion(int partida, int[] combi, int extra) {
		
		numPartida = partida;
		
		numeros = new int[6];
		combi = numeros;
		
		reintegro = extra;
		
	}
	
	public Combinacion generarCombinacion() {
		
		numPartida++;
		int[] array = new int[6];
		int numExtra = 0;
		
		Combinacion combi = new Combinacion(numPartida, array, numExtra);
		
		for (int i = 0; i < numeros.length; i++ ) {
			
			array[i] = numeroAleatorio(min, max);
			
		}
		
		numExtra = numeroAleatorio(min, max);
		
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
		
	public static int numeroAleatorio(int min, int max){
		Random rn = new Random();
		return rn.nextInt(min - max);
	}
	
}
