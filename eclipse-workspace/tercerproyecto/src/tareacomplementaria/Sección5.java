package tareacomplementaria;

public class Sección5 {
 public void main (String [] args) {
	int edadMinima = 18;
	int edad1 = 15, edad2 = 18, edad3 = 24, edad4 = 17; 
	System.out.printf("Con %d años %s sacarse el carnet de conducir.%n", edad1, edad1 >= edadMinima ? "puede" : "no puede" );
	System.out.printf("Con %d años %s sacarse el carnet de conducir.%n", edad2, edad2 >= edadMinima ? "puede" : "no puede");
	System.out.printf("Con %d años %s sacarse el carnet de conducir.%n", edad3, edad3 >= edadMinima ? "puede" : "no puede");
	System.out.printf("Con %d años %s sacarse el carnet de conducir.%n", edad4, edad4 >= edadMinima ? "puede" : "no puede"); 
 }
}
