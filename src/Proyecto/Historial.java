package Proyecto;

public class Historial {

	public int contadorPartidas = 0;
	public Combinacion[] partidas;
	
	 public Historial() {
	        this.partidas = new Combinacion[10];
	        this.contadorPartidas = 0;
	    }
	 
	 public void guardarPartidas(Combinacion partida) {
		 if (contadorPartidas < 10) {
			 partidas[contadorPartidas] = partida;
			 contadorPartidas++;
		 }else {
			contadorPartidas = 0;
			 partidas[contadorPartidas] = partida;
			 contadorPartidas++;
		 }
	 }
}

