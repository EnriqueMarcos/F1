package Proyecto;

public class Historial {

	public int contadorPartidas = 0;
	public Combinacion[] partidas;


	public Historial() {
		this.partidas = new Combinacion[10];
		this.contadorPartidas = 0;
	}

	
	public int guardarPartidas(Combinacion partida) {

		if (contadorPartidas < 10) {
			partidas[contadorPartidas] = partida;
			contadorPartidas++;
		}else {
			contadorPartidas = 0;
			partidas[contadorPartidas] = partida;
			contadorPartidas++;
		}

		return contadorPartidas;
		
	}


	public String mostrarHistorial() {

		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < contadorPartidas; i++) {
			stringBuffer.append("Partida " + contadorPartidas);
			stringBuffer.append("Aciertos: " + partidas[i].numeroDeAciertos(partidas[i]));
			stringBuffer.append(partidas[i].imprimirReintegroAcertado(partidas[i]));
			stringBuffer.append("Premio: " + partidas[i].premio(partidas[i]));
			stringBuffer.append("-----------------------------------------------------------------");
		}
		
		return stringBuffer.toString();

	}

}