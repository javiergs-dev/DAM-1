package bucles;

public class Ejercicio15 {
	public static void main (String [] args) {
	//Muestra todos los múltiplos de 4 entre 1 y 60, excepto aquellos que también sean múltiplos de 12
		int inicio = 4;
		int fin = 60;
		
	for (int i = inicio; i<=fin ; i++) {
		if((i % 4 == 0) != (i % 12 == 0))	{
			System.out.print(i + " ");
		}
		
	}
	}
}
	
