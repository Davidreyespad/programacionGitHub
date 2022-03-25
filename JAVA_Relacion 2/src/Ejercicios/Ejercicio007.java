package Ejercicios;

import java.util.Scanner;

public class Ejercicio007 {

	public static void main(String[] args) {
		
		  int intento=1;
		  int pin=1234;
		  
		  Scanner s = new Scanner(System.in);

	      do {
	    	  System.out.print("Ingresa la combinación:");
	          int numero= s.nextInt();
	    	  if(numero == pin) {
	    		  System.out.println("¡La caja fuerte se ha abierto satisfactoriamente!");
	    		  System.out.println("¡Bienvenido!");
	    		  intento=5;
	        } else {
	    		  System.out.println("¡Lo siento, esa no es la combinación!");
	    		  System.out.println("Intentalo de nuevo, llevas " +intento+ " intentos");
	        }
	    	  intento=intento+1;
	    }while(intento<=4 );
	}
}
	
