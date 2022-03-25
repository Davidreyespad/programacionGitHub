package Ejercicio2;

//Escribe una clase Cuenta para representar una cuenta bancaria. Los datos de la cuenta son: nombre del cliente (String), número de cuenta (String), tipo de interés (double) y saldo (double).
//La clase contendrá los siguientes métodos:
//Constructor por defecto
//Constructor con todos los parámetros
//Constructor copia.
//Métodos setters/getters para asignar y obtener los datos de la cuenta.
//Métodos ingreso y reintegro. Un ingreso consiste en aumentar el saldo en la cantidad que se indique. Esa cantidad no puede ser negativa. Un reintegro consiste en disminuir el saldo en una cantidad pero antes se debe comprobar que hay saldo suficiente. La cantidad no puede ser negativa. Los métodos ingreso y reintegro devuelven true si la operación se ha podido realizar o false en caso contrario.
//Método transferencia que permita pasar dinero de una cuenta a otra siempre que en la cuenta de origen haya dinero suficiente para poder hacerla. Ejemplo de uso del método transferencia:
//cuentaOrigen.transferencia(cuentaDestino, importe);
//que indica que queremos hacer una transferencia desde cuentaOrigen a cuentaDestino del importe indicado.
//Realiza las siguientes acciones:

//1. Crea objeto cuenta1 sin parámetros
//2. Introduce los valores de cuenta1 con valores pedidos por teclado.
//3. Muestra los valores de cuenta1.
//4. Crea el objeto cuenta2 con los valores siguientes:
//Juan Fernández Rubio
//1234567890
//1.75
//300
//5. Crea cuenta3 como copia de cuenta1
//6. Realiza un ingreso en cuenta1
//7. Muestra el saldo de cuenta1 después del ingreso
//8. Muestra los datos de cuenta2
//9. Muestra los datos de cuenta3
//10. Realiza una transferencia de 10€ desde cuenta3 a cuenta2
//11. Muestra el saldo de cuenta3

import java.util.Scanner;
public class Ejercicio02POO {

	public static void main(String[] args) {
	
		Scanner p=new Scanner (System.in);

		//1.Crea objeto cuenta1 sin parámetros
		
		Cuenta cuenta1=new Cuenta();
		
		//2. Introduce los valores de cuenta1 con valores pedidos por teclado
		
		System.out.println ("Introduce el nombre del usuario: ");
		String nombre=p.nextLine();
		cuenta1.setNombre(nombre);
		System.out.println ("Introduce el número de cuenta: ");
		String numeroCuenta=p.nextLine();
		cuenta1.setNumeroCuenta(numeroCuenta);
		System.out.println ("Introduce el interés: ");
		double interes=p.nextDouble();
		cuenta1.setInteres(interes);
		System.out.println ("Introduce el saldo: ");
		double saldo=p.nextDouble();
		cuenta1.setSaldo(saldo);
		
		//3. Muestra los valores de cuenta1.
		

		System.out.println("Los valores de la cuenta 1 son:"); 
		System.out.println("Nombre : "+cuenta1.getNombre());
		System.out.println("Número de cuenta : "+cuenta1.getNumeroCuenta());
		System.out.println("Interés : "+cuenta1.getInteres());
		System.out.println("Saldo : "+cuenta1.getSaldo());
		
		//4. Crea el objeto cuenta2 con los valores siguientes:
		//Juan Fernández Rubio
		//1234567890
		//1.75
		//300
				
		Cuenta cuenta2=new Cuenta("Juan Fernández Rubio","1234567890",1.75,300);
		System.out.println();
		System.out.println("Los valores de la cuenta 2 son:"); 
		System.out.println("Nombre : "+cuenta2.getNombre());
		System.out.println("Número de cuenta : "+cuenta2.getNumeroCuenta());
		System.out.println("Interés : "+cuenta2.getInteres());
		System.out.println("Saldo : "+cuenta2.getSaldo());
		
		
		//5. Crea cuenta3 como copia de cuenta1
		
		Cuenta cuenta3=new Cuenta(cuenta1);
		System.out.println();
		System.out.println("Los valores de la cuenta 3 son:"); 
		System.out.println("Nombre : "+cuenta3.getNombre());
		System.out.println("Número de cuenta : "+cuenta3.getNumeroCuenta());
		System.out.println("Interés : "+cuenta3.getInteres());
		System.out.println("Saldo : "+cuenta3.getSaldo());
		
		//6. Realiza un ingreso en cuenta1
		
		
		cuenta1.ingreso(4000);
		
		//7. Muestra el saldo de cuenta1 después del ingreso
		System.out.println("Se ha hecho un ingreso de 4000");
		System.out.println("El saldo en la cuenta 1 después del ingreso es de : "+cuenta1.getSaldo());
		System.out.println();
		
		//8. Muestra los datos de cuenta2
		System.out.println();
		System.out.println("Los valores de la cuenta 2 son:"); 
		System.out.println("Nombre : "+cuenta2.getNombre());
		System.out.println("Número de cuenta : "+cuenta2.getNumeroCuenta());
		System.out.println("Interés : "+cuenta2.getInteres());
		System.out.println("Saldo : "+cuenta2.getSaldo());
		System.out.println();
		
		//9. Muestra los datos de cuenta3
		System.out.println();
		System.out.println("Los valores de la cuenta 3 son:"); 
		System.out.println("Nombre : "+cuenta3.getNombre());
		System.out.println("Número de cuenta : "+cuenta3.getNumeroCuenta());
		System.out.println("Interés : "+cuenta3.getInteres());
		System.out.println("Saldo : "+cuenta3.getSaldo());
		System.out.println();
		
		//10. Realiza una transferencia de 10 desde cuenta3 a cuenta2
		System.out.println();
		System.out.println ("Los valores antes de la trasnferencia son: ");
		System.out.println("El saldo en la cuenta 3 antes de la trasferencia es de : "+cuenta3.getSaldo());
		System.out.println("El saldo en la cuenta 2 antes de la trasferencia es de : "+cuenta2.getSaldo());
		cuenta3.transferencia(cuenta2, 10);
		System.out.println();
		
		//11. Muestra el saldo de cuenta3
		System.out.println();
		
		System.out.println ("Se ha realizado una transferencia de 10  de la cuenta 3 a la 2: ");
		
		System.out.println("El saldo en la cuenta 3 después de la tranferencia es de : "+cuenta3.getSaldo());
		System.out.println("El saldo en la cuenta 2 después de la tranferencia es de : "+cuenta2.getSaldo());
		System.out.println();
		
		p.close();
		

	}

}
