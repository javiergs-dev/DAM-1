package tarea1;

public class vuelto {
	public static void main(String[] args) {
		double precio = 82.45, pago = 100;        
		
		System.out.printf("Si tengo que pagar 82.45EUR y entrego 100EUR en efectivo, mi cambio es => %s%n", (pago - precio));
		 
		System.out.printf("El cambio en céntimos es => %.2f%n",(pago - precio) * 100 );
		
		int cambiocentimos = (int) ((pago - precio) * 100);
		System.out.printf("Los billetes de 10 que me quedan con el cambio son => %s%n", (cambiocentimos % 1000) * 100);
		
		System.out.printf("El resto en euros después del cambio es => %s%n", cambiocentimos / 100);
		
		
		
	}
}
