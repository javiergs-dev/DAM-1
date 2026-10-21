package bucles;

public class Ejercicio19 {
	public static void main(String[] args) {
		// Muestra las primeras 8 potencias de 3 (3¹, 3², 3³... hasta 3⁸) en la misma
		// línea, separadas por comas.

		int inicio = 3;
		int fin = 8;
		int multiplo = 1;

		for (int i = 1; i <= fin; ++i) {
			multiplo *= inicio;
			System.out.print(multiplo);
			if (i != fin) {
				System.out.print(", ");
				
			}
		}

	}
}
