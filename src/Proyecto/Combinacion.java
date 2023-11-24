package Proyecto;

import java.util.Arrays;
import java.util.Random;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


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


	public boolean reintegro(Combinacion combiPremiada) {

		boolean reintegroAcertado = false;

		if (reintegro == combiPremiada.reintegro) {
			reintegroAcertado = true;
		}
		return reintegroAcertado;
		
	}


	public int premio(Combinacion combiPremiada) {

		int dineroGanado = 0;
		boolean reintegroPremio = reintegro(combiPremiada);

		switch (numeroDeAciertos(combiPremiada)){

		case 0,1,2,3:
			return dineroGanado = 0;

		case 4:
			return dineroGanado = 1000;

		case 5:
			return dineroGanado = 10000;

		case 6:
			return dineroGanado = 1000000;
		}

		if (reintegroPremio = true) {
			dineroGanado += 2;
		}

		return dineroGanado;
		
	}


	public String imprimirBoleto() {

		int numEspacios = 0;
		int numEspacios1 = 0;

		StringBuffer stringBuffer = new StringBuffer();

		stringBuffer.append("╔══════════════════════════════════════╗" + "\n");
		stringBuffer.append("║                                      ║" + "\n");
		stringBuffer.append("║       ╔═════╗                        ║" + "\n");
		stringBuffer.append("║       ║     ║     La Primitiva       ║" + "\n");
		stringBuffer.append("║       ║     ║                        ║" + "\n");
		stringBuffer.append("║       ╚═   ═╝                        ║" + "\n");
		stringBuffer.append("║                                      ║" + "\n");
		stringBuffer.append("║             Partida " + numPartida);

		if (numPartida < 10){
			stringBuffer.append(" ");
		}
		
		stringBuffer.append("               ║" + "\n");
		stringBuffer.append("║                                      ║" + "\n");
		stringBuffer.append("║   Combinación: ");

		Arrays.sort(numeros);

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] <= 9){
				numEspacios++;
			}
			stringBuffer.append(numeros[i] + " ");
		}

		for (int n = 0; n < numEspacios; n++) {
			stringBuffer.append(" ");
		}

		stringBuffer.append("    ║");
		stringBuffer.append("\n");
		stringBuffer.append("║                                      ║" + "\n");
		stringBuffer.append("║   Reintegro: " + reintegro +  "                       ║" + "\n");
		stringBuffer.append("║                                      ║" + "\n");
		stringBuffer.append("║   " + fecha() + "       Jugado: 2,00€     ║" + "\n");
		stringBuffer.append("║                                      ║" + "\n");


		return stringBuffer.toString();

	}


	public String imprimirAciertos(Combinacion combiPremiada) {

		int aciertos = numeroDeAciertos(combiPremiada);

		StringBuffer stringBuffer = new StringBuffer();

		stringBuffer.append("║              Resultado               ║" + "\n");
		stringBuffer.append("║                                      ║" + "\n");
		stringBuffer.append("║   Numero de aciertos: " + aciertos + "              ║" + "\n");
		stringBuffer.append("║                                      ║");

		return stringBuffer.toString();

	}


	public String imprimirPremio(Combinacion combiPremiada) {

		int dineroGanado = premio(combiPremiada);

		switch (numeroDeAciertos(combiPremiada)){

		case 0,1,2,3:
			return ("║   Premio: " + dineroGanado + "€                         ║" + "\n" + "║                                      ║");

		case 4:
			return ("║   Premio: " + dineroGanado + "€                      ║" + "\n" + "║                                      ║");

		case 5:
			return ("║   Premio: " + dineroGanado + "€                     ║" + "\n" + "║                                      ║");

		case 6:
			return ("║   Premio: " + dineroGanado + "€                   ║" + "\n" + "║                                      ║");

		}

		return null;

	}


	public String imprimirReintegroAcertado(Combinacion combiPremiada) {

		boolean reintegroPremio = reintegro(combiPremiada);

		if (reintegroPremio = true) {
			return ("║   Reintegro: acertado                ║" + "\n" + "║                                      ║");
		}
		else {
			return ("║   Reintegro: fallado                 ║" + "\n" + "║                                      ║");
		}

	}


	public String imprimirCombiPremiada() {

		int numEspacios = 0;
		int numEspacios1 = 0;

		StringBuffer stringBuffer = new StringBuffer();

		stringBuffer.append("║   Combinación: ");

		Arrays.sort(numeros);

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] <= 9){
				numEspacios++;
			}
			stringBuffer.append(numeros[i] + " ");
		}

		for (int n = 0; n < numEspacios; n++) {
			stringBuffer.append(" ");
		}

		stringBuffer.append("    ║");
		stringBuffer.append("\n");
		stringBuffer.append("║                                      ║" + "\n");
		stringBuffer.append("║   Reintegro: " + reintegro +  "                       ║" + "\n");
		stringBuffer.append("║                                      ║" + "\n");
		stringBuffer.append("╚══════════════════════════════════════╝");

		return stringBuffer.toString();

	}


	//MÉTODO QUE GENERA NÚMEROS ALEATORIOS
	public static int numeroAleatorio(int min, int max){
		Random rn = new Random();
		return rn.nextInt(max-min)+min;
	}


	//MÉTODO QUE GENERA LA FECHA ACTUAL CON FORMATO DIA-MES-AÑO
	public String fecha() {

		LocalDate fechaActual = LocalDate.now();

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String fechaFormato = fechaActual.format(formato);

		return fechaFormato;
	}

}