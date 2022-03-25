import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Boletin6Ejercicio6 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una cadena");
		String cadena = sc.nextLine();
		System.out.println(invertir(cadena));
	}

	public static String invertir(String cadena) {
		String resultado = "";
		for (int i = cadena.length() - 1; i >= 0; i--) {
			resultado += cadena.charAt(i);
		}
		return resultado;
	}
}
