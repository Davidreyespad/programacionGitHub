package Ejercicio4;

//Crea una clase llamada Libro que guarde la información de cada uno de los libros de una biblioteca. La clase debe guardar el título del libro, autor, número de ejemplares del libro y número de ejemplares prestados. La clase contendrá los siguientes métodos:
//Constructor por defecto.
//Constructor con parámetros. 
//Métodos Setters/getters
//Método préstamo que incremente el atributo correspondiente cada vez que se realice un préstamo del libro. No se podrán prestar libros de los que no queden ejemplares disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en caso contrario.
//Método devolución que decremente el atributo correspondiente cuando se produzca la devolución de un libro. No se podrán devolver libros que no se hayan prestado. Devuelve true si se ha podido realizar la operación y false en caso contrario.
//Método toString para mostrar los datos de los libros. Este método se heredada de Object y lo debemos modificar (override) para adaptarlo a la clase Libro.
//Escribe un programa para probar el funcionamiento de la clase Libro.
//Para ello debe realizar las siguientes acciones:
//Crea el objeto libro1 utilizando el constructor con parámetros.
//1. Libro("El quijote", "Cervantes", 1, 0)
//2. Crea el objeto libro2 utilizando el constructor por defecto
//3. Asigna a libro2 los datos pedidos por teclado.
//4. Muestran por pantalla los datos del objeto libro1.
//5. Realiza un préstamo de libro1. El método devuelve true si se ha podido realizar el préstamo y false en caso contrario. 
////6. Realiza una devolución de libro1. El método devuelve true si se ha podido realizar la devolución y false en caso contrario. 
//7. Realiza un préstamo de libro1.
//8. Realiza otro préstamo de libro1. En este caso no se podrá realizar ya que solo hay un ejemplar de este libro y ya está prestado. Se mostrará por pantalla el mensaje “No quedan ejemplares del libro…”
//9. Mostrar los datos del objeto libro1
//10. Mostrar los datos del objeto libro2

import java.util.Scanner;

public class PruebaLibro {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int ejemplares, prestados;
		String titulo, autor;
		
	    //1. Crea el objeto libro1 utilizando el constructor con par�metros. Libro1("El quijote", "Cervantes", 1, 0)
		Libro libro1= new Libro("El quijote","Cervantes",1,0);
		
	    //2. Crea el objeto libro2 utilizando el constructor por defecto
		Libro libro2 = new Libro();
		
		
	   // 3. Asigna a libro2 los datos pedidos por teclado.
		System.out.println("Introduce los datos del libro 2");
		System.out.println("Introduce el t�tulo del libro 2");
		titulo=s.nextLine();
		
		System.out.println("Introduce el autor del libro");
		autor=s.nextLine();
		
		System.out.println("Introduce el n�mero de ejemplares del libro");
		ejemplares=s.nextInt();
		
		System.out.println("Introduce el n�mero de libros prestados");
		prestados=s.nextInt();
	
		libro2.setTitulo(titulo);
		libro2.setAutor(autor);
		libro2.setEjemplares(ejemplares);
		libro2.setPrestados(prestados);
		System.out.println(libro2);
		
	    // 4. Muestra por pantalla los datos del objeto libro1.
		
		System.out.println("Los datos del libro 1 son:");
		
		System.out.println(libro1);
		
		
	    //5. Realiza un pr�stamo de libro1. El m�todo devuelve true si se ha podido realizar el pr�stamo y false en caso contrario. 
		System.out.println("Vamos a prestar el libro 1. Sus datos antes de prestar son:");
		System.out.println(libro1);
		
		if(libro1.prestamoLibro()) {
			System.out.println("El libro 1 ha sido prestado con �xito");
			
			System.out.println(libro1);	
			
		}
		else
		{
			System.out.println("No se ha podido realizar el pr�stamo");
		}
		//6. Realiza una devoluci�n de libro1. El m�todo devuelve true si se ha podido realizar la devoluci�n y false en caso contrario.
		System.out.println("Vamos a delvolver el libro 1. Sus datos antes de devolver son: ");
		System.out.println(libro1);
		
		
		if(libro1.devolucionLibro()) {
			System.out.println("El libro 1 ha sido devuelto con �xito");
			
			System.out.println(libro1);	
			
		}
		else
		{
			System.out.println("No se ha podido realizar la devoluci�n");
		}
		
		
	    //7. Realiza un pr�stamo de libro1.
		
		if(libro1.prestamoLibro()) {
			System.out.println("El libro 1 ha sido prestado con �xito");
			
			System.out.println(libro1);	
			
		}
		else
		{
			System.out.println("No se ha podido realizar el pr�stamo");
		}
	    //8. Realiza otro pr�stamo de libro1. En este caso no se podr� realizar ya que 
		//solo hay un ejemplar de este libro y ya est� prestado. Se mostrar� por pantalla el mensaje 
		//�No quedan ejemplares del libro��
		
		if(libro1.prestamoLibro()) {
			System.out.println("El libro 1 ha sido prestado con �xito");
			
			System.out.println(libro1);	
			
		}
		else
		{
			System.out.println("No se ha podido realizar el pr�stamo");
		}
		
		
	    //9. Mostrar los datos del objeto libro1
		
		System.out.println("Los datos del libro 1 son:");
		System.out.println(libro1);
		
		
	    //10. Mostrar los datos del objeto libro2
		
		System.out.println("Los datos del libro 2 son:");
		System.out.println(libro2);

		s.close();
		

	}

}

