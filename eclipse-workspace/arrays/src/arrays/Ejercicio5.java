package arrays;

public class Ejercicio5 {
	public static void main(String[]args) {
		int[]numeros = {2, -3, 4, -1, 6};
		for(int i = 0; i < numeros.length ; i++ ) {
			if (numeros[i] > 0) {
				
				numeros [i] = 0;
			}
			
		}
		for (int numero : numeros) {
			
		System.out.print(numero + " ");
		}
	}
	
}
