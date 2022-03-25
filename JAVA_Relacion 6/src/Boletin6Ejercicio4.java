import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Boletin6Ejercicio4 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca cadena");
		String cadena = sc.nextLine();
		System.out.println("El número de espacios es " + contarEspacios(cadena));
	}

	public static int contarEspacios(String cadena) {
		int cuenta = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == ' ') {
				cuenta++;
			}
		}
		return cuenta;
	}

}