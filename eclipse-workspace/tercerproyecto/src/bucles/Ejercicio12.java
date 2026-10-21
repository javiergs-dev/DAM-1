package bucles;

public class Ejercicio12 {
	public static void main (String[] args) {
		//Muestra los números del 20 al 27
		int inicio = 20;
		int fin = 27;
		int suma = 0;
		int num = 1;
		for (int i = inicio; i <= fin; ++i) {
			suma = i;
			System.out.printf("Número %d = %d.%n", num++, suma);
		}
	}
}
