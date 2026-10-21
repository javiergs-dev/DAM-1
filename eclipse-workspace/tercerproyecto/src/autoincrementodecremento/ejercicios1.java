package autoincrementodecremento;

public class ejercicios1 {
	 public static void main(String[] args) throws Exception {
	        int x = 10;
	        
	        System.out.println(x);
	        x++;
	        System.out.println(x);
	        System.out.println(++x);
	        System.out.println(x++);
	        System.out.println(x);
	        System.out.println(x++);
	        System.out.println(++x);
	        System.out.println(++x);
	        ++x;x++;
	        System.out.println(++x);
	        System.out.println(x++);
	        System.out.println(++x);
	        
	        char A = 'c';
	        char B;		
	        System.out.println("NUEVO");
	        System.out.println(A++);
	        System.out.println(A++);
	        System.out.println(++A);
	        B = --A; // PRIMEO SE HACE EL CÁLCULO Y LUEGO DESIGNAS (ADEMÁS EL CÁLCULO SE TIENE EN CUENTA PARA PRÓXIMOS CÁLCULOS DE A)
	        System.out.println(++A);
	        A++;
	        --B;
	        System.out.println(B++);
	        System.out.println(++B);
	        System.out.println(++A);
	        System.out.println(B--);
	        System.out.println(A);
	        System.out.println(B);
	        
	        int i = 1, j = 1, k = 1;
	        System.out.println("NUEVO");
	        i = ++j;
	        System.out.printf("a) i = ++j; => i = %d, j = %d, k = %d",i, j, k);
	        
	        i = 1; j = 1; k = 1;
	        i = k++;
	        System.out.printf("b) i = ++k; => i = %d, j = %d, k = %d", i, j, k);
	        
	        i = 1; j= 1; k = 1;
	        i = k + ++j;
	        System.out.printf("c) i = k + ++j; => i = %d, j = %d, k = %d", i, j, k);
	        
	        i = 1; j= 1; k = 1;
	        i = i + j++;
	        System.out.printf("d) i = i + ++j; => i = %d, j = %d, k= %d", i, j, k);
	        
	        i = 1; j = 1; k = 1;
	        i = j + ++k;
	        System.out.printf("e) i = j + ++k; => i = %d, j = %d, k = %d", i, j, k);
	        
	        i = 1; j =1; k = 1;
	        i =  ++j + k++;
	        System.out.printf("f) i = ++j + k++; => i = %d, j = %d, k = %d", i, j, k);
	        
	        i = 1; j = 1; k = 1;
	        j = k-- + --i;
	        System.out.printf("g) j = k-- + --i; => i = %d");
	 }
	 
}





