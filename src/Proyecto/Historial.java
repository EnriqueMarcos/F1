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
	 
	 StringBuffer stringBuffer = new StringBuffer();
	 public void mostrarHistorial() {
	        for (int i = 0; i < contadorPartidas; i++) {
	        	stringBuffer.append(partidas[i].imprimirAciertos(partidas[i]));
	        	stringBuffer.append(partidas[i].imprimirPremio(partidas[i]));
	        	stringBuffer.append(partidas[i].imprimirReintegroAcertado(partidas[i]));
	        	stringBuffer.append(partidas[i].imprimirCombiPremiada());
	        	stringBuffer.append("-----------------------------------------------------------------");
	        }
	    }
}

