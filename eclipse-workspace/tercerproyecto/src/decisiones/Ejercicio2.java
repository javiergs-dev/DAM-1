package decisiones;

public class Ejercicio2 {
	public static void main(String[] args) throws Exception {
		int numero = -7; 
		String A = null;
		
		if (numero > 0) {
			   A = "positivo";
		} 
		if (numero < 0) {
			A = "negativo";
		}
		
		System.out.printf("%d es %s ", numero, A);
		System.out.printf("es %s, ", numero % 2 == 0 ? "par" : "impar");	
		System.out.printf("y %d %ses divisible por 5%n", numero, numero % 5 == 0 ? "": "no ");
		System.out.printf("%d %scumple todas las condiciones %n", numero, numero > 0 && numero % 2 == 0 && numero % 5 == 0 ? "" : "no ");
		
		

		
		// -7 es negativo, es impar y no es divisible por 5
		
		 // pendiente por acabar
		
		
		
		
		
		
		
		
		
	}
}
