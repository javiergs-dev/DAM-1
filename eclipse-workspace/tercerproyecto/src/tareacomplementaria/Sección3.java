package tareacomplementaria;

public class Sección3 {
	public static void main (String [] args) {
		double kmPorMilla = 1.60934;
		double milla5K = 3.1;
		double milla10K = 6.2;
		double mediaMaratón = 13.1;
		double maratón = 26.2;
		
		System.out.printf("5k:       %.1f millas = %.2f km%n", milla5K, milla5K * kmPorMilla );
		System.out.printf("5k:       %.1f millas = %.2f km%n", milla10K, milla10K * kmPorMilla );
		System.out.printf("5k:       %.1f millas = %.2f km%n", mediaMaratón, mediaMaratón * kmPorMilla );
		System.out.printf("5k:       %.1f millas = %.2f km%n", maratón, maratón * kmPorMilla );
		
	}
}
