package Examen;

import java.util.Scanner;

public class Ejercicio3 {

	  static int N = 50;

	  
	  public static void main(String[] args) {
		  
		  Scanner s=new Scanner(System.in);
			  

	    //Crea el array de discos
	    Vehiculos[] concesionario = new Vehiculos[N];
	   
	    for(int i = 0; i < N; i++) {
	    	concesionario[i] = new Vehiculos();
	      }
	    
	    int opcion;
		String marcaIntroducida;
		String matriculaIntroducida;
		int nKilometrosIntroducidos;
		int actualizarKilometros;
		int diaMatriculacion;
		int mesMatriculacion;
		int añoMatriculacion;
		String descripcionIntroducida;
		double precioIntroducido;
		String nombreProIntroducido;
		String dniProIntroducido;
	    int primeraLibre;
	    int i;
	    
	    do {
	    	imprimeMenu();
	        opcion = s.nextInt();
	        
	        switch (opcion) {
	         
	        case 1:
	          System.out.println("\nNUEVO VEHÍCULO");
	          System.out.println("===========");
	          
	          // Busca la primera posición libre del array
	          primeraLibre = -1;
	          
	          System.out.println("Por favor, introduzca los datos del disco.");  
	          
	          System.out.print("Marca: ");
				s.nextLine();
				marcaIntroducida = s.nextLine();
				concesionario[primeraLibre].setMarca(marcaIntroducida);

				System.out.print("Matrícula: ");
				matriculaIntroducida = s.nextLine();
				concesionario[primeraLibre].setMatricula(matriculaIntroducida);

				System.out.print("Número de Kilómetros: ");
				nKilometrosIntroducidos = s.nextInt();
				concesionario[primeraLibre].setnKilometros(nKilometrosIntroducidos);

				System.out.print("Año de matriculación: ");
				añoMatriculacion = s.nextInt();
				concesionario[primeraLibre].setDia(añoMatriculacion);

				System.out.print("Descripcion: ");
				descripcionIntroducida = s.nextLine();
				concesionario[primeraLibre].setDescripcion(descripcionIntroducida);
				
				System.out.print("\nPrecio: ");
				precioIntroducido = s.nextInt();
				concesionario[primeraLibre].setPrecio(precioIntroducido);
				
				System.out.print("\nNombre del propietario: ");
				nombreProIntroducido = s.nextLine();
				concesionario[primeraLibre].setNombrePro(nombreProIntroducido);
				
				System.out.print("\nDni del propietario: ");
				dniProIntroducido = s.nextLine();
				concesionario[primeraLibre].setDniPro(dniProIntroducido);
	          
	          break;
	          
	        case 2:
	        	System.out.println("\nLISTADO");
		          System.out.println("=======");
		          for(i = 0; i < N; i++) {
		            if (!concesionario[i].getMarca().equals("")) {
		              System.out.println(concesionario[i]);
		            }
		          }
		          break; 
	          
	        case 3:
	        	System.out.println("\nLISTADO");
		          System.out.println("=======");
		          for(i = 0; i < N; i++) {
		            if (!concesionario[i].getMarca().equals("LIBRE")) {
		              System.out.println(concesionario[i]);
		            }
		          }
		          break; 
	          
	        case 4:
	        	System.out.println("\nMODIFICAR");
	            System.out.println("===========");
	            
	            s.nextLine();
	            System.out.print("Por favor, introduzca el DNI del propietario del coche cuyos kilometros desea modificar: ");
	            dniProIntroducido =s.nextLine();
	      
	            i = -1;
	            do {
	              i++;
	            } while (!((concesionario[i].getDniPro()).equals(dniProIntroducido)));
	            
	            System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
	      
	            System.out.println("Kilómetros: " + concesionario[i].getnKilometros());
	            System.out.print("Nuevos kilómetros: ");
	            nKilometrosIntroducidos = s.nextInt();
	            if (!concesionario.equals("")) {
	            	concesionario[i].setnKilometros(nKilometrosIntroducidos);
	            }
	            
	            System.out.println("Matrícula: " + concesionario[i].getMatricula());
	            System.out.print("Nueva matrícula: ");
	            matriculaIntroducida = s.nextLine();
	            if (!matriculaIntroducida.equals("")) {
	            	concesionario[i].setMatricula(matriculaIntroducida);
	            }
	            
	          
	          break;
	          
	        default:
	      	  System.out.println("\nHa salido de la aplicación");
	        
	        } // switch
	      } while (opcion != 5);
	      s.close();
	    }
	  
	    public static void imprimeMenu() {
	        System.out.println("===================");
	        System.out.println("1. Nuevo vehículo");
	        System.out.println("2. Listar vehículos");
	        System.out.println("3. Buscar vehículos");
	        System.out.println("4. Modificar kms de vehículo");
	        System.out.println("5. Salir");
	        System.out.print("Introduzca una opción: ");
	    
	 }
}
