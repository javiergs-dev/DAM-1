package tareajavier;

public class Acceso {
	public static void main(String [] args) {	
		// Decidir con una sola expresión lógica si la persona puede entrar a una sala: mayor de 18 años, o mayor de 14 si es socia y va acompañada de un adulto
		
		int edad = 15;
		boolean esSocio = true;
		boolean vaConAdulto = true ;

		boolean puedeEntrar = edad > 18 || (edad > 14 && esSocio && vaConAdulto);

		System.out.println(puedeEntrar ? "Acceso permitido" : "Acceso denegado" );
		
	}
}
