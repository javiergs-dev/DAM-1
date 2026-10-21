package tareacomplementaria;

public class Sección6 {
	public void main (String [] args) {
		double Fahrenheit = 98.6;
		double Celsius = (98.6 -32) * 5 / 9;
		System.out.printf("%.1f grados Farenheit son %.2f grados Celsius que redondeados son %d%n", Fahrenheit, Celsius, Math.round(Celsius),(int)Celsius);
	}
}
