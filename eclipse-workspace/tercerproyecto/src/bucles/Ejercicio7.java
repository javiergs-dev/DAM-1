package bucles;

public class Ejercicio7 {
 public void main(String [] arg) {
	 // Crea un solo bucle sin crear un array que cuente y sume los números del 1 al 1_000 pero saltando de 100 en 100) y lo muestre en pantalla según el formato indicado.
	int suma = 0;
	int cantidad = 0;
			for (int i = 1; i <= 1000; i +=100) {
		 		cantidad++;
		 		suma += i;
			}
			
			 System.out.printf("La suma de los %d elementos pedidos es %d.",cantidad,suma);
 }
}
