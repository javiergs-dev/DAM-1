package tareajavier;

public class Calculadora {
	public static void main(String[] args) {

        
        double num1 = 10;
        double num2 = 0.5;
        char cálculo = '+';

        
        if (cálculo == '+') {
            
            System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, num1 + num2);

        } else if (cálculo == '-') {
          
            System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, num1 - num2);

        } else if (cálculo == '*') {
          
            System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, num1 * num2);

        } else if (cálculo == '/') {
          
            System.out.printf(num2 == 0 ? "División por cero%n" : "%s / %s = %s%n",
                    num1, num2, num1 / num2);

        } else {
            
            System.out.println("Cálculo no válido");

        }
	}
}