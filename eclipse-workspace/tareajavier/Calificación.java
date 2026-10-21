package tareajavier;

public class Calificación {
	public static void main(String[] args) {

		        double nota = 4.5;
		        char letra;

		        if (nota >= 9) {
		            letra = 'A';
		        } else if (nota >= 7) {
		            letra = 'B';
		        } else if (nota >= 5) {
		            letra = 'C';
		        } else {
		            letra = 'D';
		        }

		        if (letra == 'A') {
		            System.out.printf("Nota %.2f = Sobresaliente%n", nota, letra);
		        } else if (letra == 'B') {
		            System.out.printf("Nota %.2f = Notable%n", nota, letra);
		        } else if (letra == 'C') {
		            System.out.printf("Nota %.2f = Suficiente%n", nota, letra);
		        } else {
		            System.out.printf("Nota %.2f = Insuficiente%n", nota, letra);
		        }
		    }
}
