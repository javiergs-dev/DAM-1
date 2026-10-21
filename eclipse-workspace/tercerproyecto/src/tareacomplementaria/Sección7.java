package tareacomplementaria;

public class Sección7 {
	public void main (String [] args) {
		double porcentajePropina = 0.10;
        double precio = 32.50;
        double total = precio + (precio * porcentajePropina);
        System.out.printf("Total con propina: %.2f €%n", total);
	}
}
