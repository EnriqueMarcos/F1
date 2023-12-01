package Proyecto;

public class Historial {
	
	Primitiva[] arrayP;
	int capacidad = 10;

	/*crea un array para guardar 10 partidas*/
	public Historial() {
		
		arrayP = new Primitiva[capacidad];
		
	}
	
	/*se agrega una partida en los espacios vacios del array*/
	public int agregar(Primitiva otra) {
		
		for (int i = 0; i < arrayP.length; i++) {
			
			
			
			if (arrayP[i] == null) {
				
				arrayP[i] = otra;
				return 0;
				
			}
			
		}
		return -1;
	}
	
	/*borra las partidas cuando hay mas de 10 */
	public void borrarHistorial() {
		
		for (int i = 0; i < arrayP.length; i++) {
			
			if (arrayP[i] != null) {
				
				arrayP[i] = null;
				
			}
		}
	}

	/*imprime las partidas guardadas en el array*/
	public void mostrarHistorial() {

		for (int i = 0; i < arrayP.length; i++) {
			
			if (arrayP[i] != null) {
				
				arrayP[i].imprimirPrimitiva();
				
			}
		}
	}

}