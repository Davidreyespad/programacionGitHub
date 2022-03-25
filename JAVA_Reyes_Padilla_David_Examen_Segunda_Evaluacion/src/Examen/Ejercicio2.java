package Examen;

import java.util.Scanner;


public class Ejercicio2 {

	static int N = 3;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		Vehiculos[] concesionario = new Vehiculos[N];

		for (int i = 0; i < N; i++) {
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
		int i = 0;

		do {
			imprimeMenu();
			opcion = s.nextInt();

			switch (opcion) {

			case 1:
				System.out.println("\nNuevo Vehículo");
				System.out.println("===========");
				
				primeraLibre = 1;
				
				
				System.out.println("Por favor, introduzca los datos del vehículo.");

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
				System.out.println("\nMATRÍCULA");
				System.out.println(" " + concesionario[i].getMatricula());
				
				break;
				
			case 3:
				System.out.println("\nNúmero de Kilómetros");
				System.out.println(" " + concesionario[i].getnKilometros());
				
				break;

			case 4:
				System.out.println("\nActualizar Kilómetros");
				System.out.println(" " + concesionario[i].getnKilometros());
				
				break;
				
			case 5:
				System.out.println("\nVer años de antigüedad");
				System.out.println(" " + concesionario[i].getAño());
				
				break;
				
			case 6:
				System.out.println("\nMostrar propietario");
				System.out.println(" " + concesionario[i].getNombrePro());
				
				break;
				
				
			case 7:
				System.out.println("\nMostrar descripcion");
				System.out.println(" " + concesionario[i].getDescripcion());
				
				break;
				
			case 8:
				System.out.println("\nMostrar precio");
				System.out.println(" " + concesionario[i].getPrecio());
				
				break;
				
				


			default:
				System.out.println("\nHa salido de la aplicación");

			} // switch
		} while (opcion != 9);
		s.close();
	}

	public static void imprimeMenu() {
		System.out.println("===================");
		System.out.println("1. Nuevo Vehículo");
		System.out.println("2. Ver Matrícula");
		System.out.println("3. Ver número de Kilómetros");
		System.out.println("4. Actualizar Kilómetros");
		System.out.println("5. Ver años de antigüedad");
		System.out.println("6. Mostrar propietario");
		System.out.println("7. Mostrar descripción");
		System.out.println("8. Mostrar precio");
		System.out.println("9. Salir");
		System.out.print("Introduzca una opción: ");
	}
}
