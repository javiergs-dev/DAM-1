package arrays;

public class Ejercicio2 {
	public static void main (String[]args) {
	/*Dado el array {1, 2, 3, 4, 5}, escribe un programa que lo recorra con un bucle, 
	calcule la suma de todos sus elementos y la muestre en la consola.*/
		int []numeros = {1,2,3,4,5,};
		int suma = 0;
		
			for (int num : numeros) {
				suma += num;
			}
			System.out.println("La suma es " + suma);
			
		}
	}

