package Proyecto;

public class Historial {
	
	Primitiva[] arrayP;
	int capacidad = 10;

	
	public Historial() {
		
		arrayP = new Primitiva[capacidad];
		
	}
	
	
	public int agregar(Primitiva otra) {
		
		for (int i = 0; i < arrayP.length; i++) {
			
			
			
			if (arrayP[i] == null) {
				
				arrayP[i] = otra;
				return 0;
				
			}
			
		}
		return -1;
	}
	
	
	public void borrarHistorial() {
		
		for (int i = 0; i < arrayP.length; i++) {
			
			if (arrayP[i] != null) {
				
				arrayP[i] = null;
				
			}
		}
	}

	
	public void mostrarHistorial() {

		for (int i = 0; i < arrayP.length; i++) {
			
			if (arrayP[i] != null) {
				
				arrayP[i].imprimirPrimitiva();
				
			}
		}
	}

}