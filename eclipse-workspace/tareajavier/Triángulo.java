package tareajavier;

public class Triángulo {
	   public static void main(String[] args) {

		   // Compruebar primero si forman un triángulo válido (la suma de dos lados cualesquiera debe ser mayor que el tercero). Si es válido, indica de qué tipo es: equilátero (los tres lados iguales), isósceles (dos lados iguales) o escaleno (los tres distintos).

	        double a = 5;
	        double b = 4;
	        double c = 8;

	        boolean esValido = a + b > c && a + c > b && b + c > a;

	        if (esValido) {
	            if (a == b && b == c) {
	                System.out.println("Triángulo equilátero");
	            } else if (a == b || a == c || b == c) {
	                System.out.println("Triángulo isósceles");
	            } else {
	                System.out.println("Triángulo escaleno");
	            }
	        } else {
	            System.out.println("No forman un triángulo válido");
	        }
	    }
}
