package Ejercicios;

import java.util.Scanner;

public class Ejercicio015 {

	public static void main(String[] args) {
		
		 Scanner s=new Scanner(System.in);
		 
		 System.out.println("Introduzca un número que hará el papel de base");
		 double base= s.nextInt();
		 
		 System.out.println("Introduzca un número que hará el papel de exponente (debe ser entero y positivo)");
		 int exponenteFinal= s.nextInt();

		 double potencia;
		 int exponente;
		 
		    for (int i = 1; i <= exponenteFinal; i++) {
		        
		        potencia = 1;
		        exponente = i;
		        
		        for (int j = 0; j < exponente; j++) {
		          potencia *= base;
		        }
		        
		      System.out.println(base + "^" + i + " = " + potencia);
		    }
		     
	   s.close();
	}
}
