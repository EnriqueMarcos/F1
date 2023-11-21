package Proyecto;

import java.util.Random;

public class Combinacion {
	
	int numPartida;
	int[] numeros;
	int reintegro;
	
	
	
	public Combinacion(int partida, int[] combi, int extra) {
		
		numPartida = partida;
		
		numeros = new int[6];
		combi = numeros;
		
		reintegro = extra;
		
		
	}
	
	public int numeroDeAciertos(Combinacion combiPremiada) {
		
		//.
		return 0;
		
		
		
	}
		
	public static int numeroAleatorio(int min, int max){
		Random rn = new Random();
		return rn.nextInt(max - min + 1) + min;
	}
	
}
