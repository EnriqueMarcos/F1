package Proyecto;

public class Cartera {
	
	int dineroTotal;
	int[] arrayDinero;
	
	/*se crea una cartera con un array y un dinero base*/
	public Cartera() {
		
		arrayDinero = new int[100];
		dineroTotal = 100;
		
	}
	
	/*establece en 0 los valores base del array*/
	public void llenarCarteraDe0() {
		
		for (int i = 0; i < arrayDinero.length; i++) {
				arrayDinero[i] = 0;
		}
	}
	
	/*se añaden los premios al array de dinero*/
	public int agregarPremio(Primitiva otro) {
		
		for (int i = 0; i < arrayDinero.length; i++) {
			if (arrayDinero[i] == 0) {
				arrayDinero[i] = otro.premio;
				return 0;
			}	
		}
		return -1;
	}
	
	/*suma el dinero de los premios con el que tienes en la cartera y*/
	public int suma() {
		
		for (int i = 0; i < arrayDinero.length; i++) {
			
			dineroTotal += arrayDinero[i];
			
		}
		return dineroTotal;
	}
	
	/*imprime un espacion con el dinero en la cartera*/
	public String mostrarCartera() {
		
		StringBuffer stringBuffer = new StringBuffer();
		
		stringBuffer.append("-----------------------------------");
		stringBuffer.append("\n");
		stringBuffer.append("Tu dinero actual es: " + dineroTotal + "€");
		stringBuffer.append("\n");
		stringBuffer.append("-----------------------------------");
		
		return stringBuffer.toString();
		
	}

}
