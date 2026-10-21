package logicas;

public class TablasDeVerdad {
	public static void main(String[] args) throws Exception {
		System.out.println("TABLAS DE VERDAD");
		boolean X = true, Y = false;
		
		System.out.println("\nTabla de verdad de AND");
		System.out.println("======================");
		System.out.printf("%b && %b => %b%n", X, X, (X && X));
		System.out.printf("%b && %b => %b%n", X, Y, (X && Y));  //EJEMPLO CON PRINTF
		System.out.printf("%b && %b => %b%n", Y, X, (Y && X));
		System.out.printf("%b && %b => %b%n", Y, Y, (Y && Y));
		
		System.out.println("\nTabla de verdad de OR");
		System.out.println("======================");
		System.out.println("true || true => " + (X || X));
		System.out.println("true || false => " + (X || Y));     //EJEMPLO PRINTLN 
		System.out.println("false || true => " + (Y || X));
		System.out.println("false || false => " + (Y || Y));
		
		System.out.println("\nTabla de verdad de NOT");
		System.out.println("======================");
		System.out.println("!true => " + (!X));
		System.out.println("!false => " + (!Y));
		
		
	}
}
