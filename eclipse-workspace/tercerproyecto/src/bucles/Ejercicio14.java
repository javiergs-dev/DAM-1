package bucles;

public class Ejercicio14 {
	public static void main (String[] args) {
		//Calcula la suma de los cuadrados de los primeros 30 números naturales (1² + 2² + 3² + ... + 30²)
		
		int inicio = 1;
		int fin = 30;
		int cuadrado = 0;
		
		for (int i = inicio; i <= fin; ++i) {
			cuadrado += i*i;
		}
		
		System.out.printf("Suma de cuadrados de primeros %d números naturales es %d.%n", fin, cuadrado);
		
		
		
	}
}	
