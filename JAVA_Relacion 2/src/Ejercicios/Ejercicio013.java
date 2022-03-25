package Ejercicios;

import java.util.Scanner;

public class Ejercicio013 {

	public static void main(String[] args) {
		
	       Scanner s= new Scanner(System.in);
	       int n;
	       
	       
	       System.out.print("Introduce 10 números diferentes: ");  

	       int negativos = 0;
	       int positivos = 0;
	       
	       for (int i = 0; i < 10; i++) {
	       	n=s.nextInt();
	       	
	         if (n< 0) {
	           negativos++;
	         } else {
	           positivos++;
	         }
	       }

	       System.out.println("Ha introducido " + positivos + " positivos y " + negativos + " negativos");
	       s.close(); 
	       
	}

}
