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
	 
	 
	 public void mostrarHistorial() {
	        for (int i = 0; i < contadorPartidas; i++) {
	            System.out.println(partidas[i].imprimirAciertos(partidas[i]));
	            System.out.println(partidas[i].imprimirPremio(partidas[i]));
	            System.out.println(partidas[i].imprimirReintegroAcertado(partidas[i]));
	            System.out.println(partidas[i].imprimirCombiPremiada());
	            System.out.println("-----------------------------------------------------------------");
	        }
	    }
}

