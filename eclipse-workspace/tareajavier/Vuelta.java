package tareajavier;

public class Vuelta {
public static void main(String [] args) {	
	// calcular el cambio, cuántos billetes de 10 € caben en él y cuántos euros y céntimos sueltos quedan
	
	double precio = 82.45, pago = 100;
	
	System.out.printf("Si tengo que pagar 82.45EUR y entrego 100EUR en efectivo, mi cambio es =》 %s%n", (pago - precio));
	
	System.out.printf("El cambio en céntimos es =》 %.2f%n", (pago - precio)  * 100);
	
	int cambioCentimos = (int) ((pago - precio) * 100 );
	
	System.out.printf("Los billetes de 10 que me quedan con el cambio son =》 %s%n", cambioCentimos / 1000);
	
	System.out.printf("El restop en euros después del cambio es =》 %s%n", cambioCentimos / 100);
	
	}
}
