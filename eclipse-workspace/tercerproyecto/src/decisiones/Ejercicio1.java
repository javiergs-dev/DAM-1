package decisiones;

public class Ejercicio1 {
	public static void main(String[] args) throws Exception {
		int A = 0;
		String infimo = null;
		
		if (A < -1_000_000) {
			infimo = "muy negativo";
		} else if (A < 0) {
			infimo = "negativo";
		} else if (A == 0 ) {
			infimo = "cero";
		} else if (A > 1_000_000) {
			infimo = " muy positivo";
		} else if (A > 0) {
			infimo = "positivo";
		}
	
	System.out.printf("El número %d es %s%n", A, infimo);
	
	
	
	}

}
