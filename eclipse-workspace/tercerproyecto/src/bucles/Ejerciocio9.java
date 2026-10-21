package bucles;

public class Ejerciocio9 {
 public void main (String []args) {
	 /*Cuenta cuántos números entre 1 y 200 son múltiplos de 7. Muestra el resultado en el siguiente formato: 
	  La cantidad de multiplos de 7 entre 1 y 200 es 28.*/
	 int cantidadMultiplos = 0;
	 int inicio =1;
	 int fin =200;
	 int multiplo =7;
	 for (int i= inicio; i <= fin ; ++i) {
		 if (i % multiplo == 0) {
			 ++cantidadMultiplos;
		 }
		 
	 }
	 
	 System.out.printf("La cantidad de multiplos de %d entre %d y %d es %d", multiplo, inicio, fin, cantidadMultiplos);
 }
}
