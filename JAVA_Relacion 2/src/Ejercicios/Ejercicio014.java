package Ejercicios;

import java.util.Scanner;

public class Ejercicio014 {

	public static void main(String[] args) {
		
		 Scanner s=new Scanner(System.in);
		 
		 System.out.println("Introduzca un número que hará el papel de base");
		 int base= s.nextInt();
		 
		 System.out.println("Introduzca un número que hará el papel de exponente (debe ser entero y positivo)");
		 int exponente= s.nextInt();
		 
		 double potencia=1;
		 
		 
		 if (exponente==0){
			 potencia=1;
		 }
		 
		 if (exponente > 0) {
	         for (int i = 0; i < exponente; i++) {
	          potencia *= base;
	        }
	      }
		      
		  if (exponente < 0) {
		      for (int i = 0; i < -exponente; i++) {
		        potencia *= base;
		      }
		      
		       potencia = 1/potencia;
		   }

	 System.out.println(base + "^" + exponente + " = " + potencia);
	 s.close();
	}
		    
}
