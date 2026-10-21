package bucles;

public class Ejercicio8 {
	public void main(String[] args) {
		// Calcula la suma de todos los múltiplos de 5 entre 1 y 100. Muestra el
		// resultado en el siguiente formato:

		int inicio = 0;
		int suma = 0;
		int fin = 100;
		int multiplo = 5;
		for (int i = inicio; i <= fin; ++i) {
			if (i % 5 == 0) {
				suma += i;
			}
		}

		System.out.printf("La suma de los multiplos de %d entre %d y %d es %d.%n", multiplo, inicio, fin, suma);

	}
}
