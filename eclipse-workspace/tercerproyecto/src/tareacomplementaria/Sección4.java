package tareacomplementaria;

public class Sección4 {
      public void main(String [] args) {
    	  int totalCentimos = 187; // 1,87Eur
    	  int monedas50 = totalCentimos / 50;
    	  int monedas20 = (totalCentimos % 50) / 20;
    	  int monedas10 = ((totalCentimos % 50) % 20) / 10;
    	  
    	  System.out.printf("1 euro y 87 céntimos se puede dividir usando únicamente %d monedas de 50cent, %d monedas de 20cent y %d monedas de 10cent.", monedas50,monedas20,monedas10);
    	  
      }
}
