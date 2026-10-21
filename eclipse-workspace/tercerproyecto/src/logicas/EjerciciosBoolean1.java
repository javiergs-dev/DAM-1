package logicas;

public class EjerciciosBoolean1 {
	public static void main(String[] args) throws Exception {
        boolean X = true, Y = false, Z = true;
        // Todo son tablas lógicas. El signo de exclamación (!) delante de un valor lo convierte al contrario
        System.out.printf("OPERACIONES LÓGICAS 1");
        System.out.println("a) (X && Y) || (X && Z) =>" + ( (X && Y) || (X && Z)) );
        System.out.println("b) (X || !Y) &&  (!X || Z) =>" + ( (X || !Y) || (!X || Z)) );
        System.out.println("c) X || Y && Z =>" + (X || Y & Z));
        System.out.println("d) !(X || Y) && Z =>" + (!(X || Y) && Z));
        System.out.println("e) X || Y || X && !Z && !Y => " + (X || Y || X && !Z && !Y));
        System.out.println("f) !X || !Y || Z && X && !Y => " + (!X || !Y || Z && X && !Y));
        
       
        
        
        
        
        
	}
}
