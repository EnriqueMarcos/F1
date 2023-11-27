package Proyecto;

public class Cartera {
	
	int dineroTotal;
	int[] arrayDinero;
	
	
	public Cartera() {
		
		arrayDinero = new int[100];
		dineroTotal = 100;
		
	}
	
	
	public void llenarCarteraDe0() {
		
		for (int i = 0; i < arrayDinero.length; i++) {
				arrayDinero[i] = 0;
		}
	}
	
	
	public int agregarPremio(Primitiva otro) {
		
		for (int i = 0; i < arrayDinero.length; i++) {
			if (arrayDinero[i] == 0) {
				arrayDinero[i] = otro.premio;
				return 0;
			}	
		}
		return -1;
	}
	
	
	public int suma() {
		
		for (int i = 0; i < arrayDinero.length; i++) {
			
			dineroTotal += arrayDinero[i];
			
		}
		return dineroTotal;
	}
	
	
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
