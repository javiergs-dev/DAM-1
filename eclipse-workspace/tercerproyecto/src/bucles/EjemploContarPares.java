package bucles;

public class EjemploContarPares {
 public static void main(String [] arg) {
	 
	 //Contar pares del 1 al 100
	 int cantidad = 0;
	 for (int i = 1; i <= 100; i++) {
		 if (i % 2 == 0) {
			 cantidad++;
		 }
	 
	 }
	 System.out.println(cantidad);
 }
}
