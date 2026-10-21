package uno;

public class Ejercicio2 {
	public static void main (String [] args) {
		
		//Calcula la suma de los cuadrados de los 30 primeros números naturales
		
		int resultado = 0;
		for (int i = 1; i <= 30 ; ++i) {
			resultado = (i*i);
		}
		System.out.printf("La suma de los cuadrados de los primeros 30 números naturales es %d",resultado);
		}
		
}
