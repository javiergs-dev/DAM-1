package bucles;

public class Ejercicio13 {
	public static void main (String[] args) {
		//Calcula y muestra los cuadrados de los números del 1 al 7 (1², 2², 3²...)
		
		int inicio = 1;
		int fin = 7;
		int cuadrado = 0;
	
		for (int i = inicio; i <= fin ; i++) {
			cuadrado = (i*i);
			
			System.out.printf("El cuadrado de %d es => %d.%n", inicio++, cuadrado);
		}
		
		
		
		
	}
}
