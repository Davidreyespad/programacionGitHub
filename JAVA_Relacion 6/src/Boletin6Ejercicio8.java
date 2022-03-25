import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Boletin6Ejercicio8 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una frase");
		String frase = sc.nextLine();
		if (esPalindroma(frase)) {
			System.out.println("La frase es palíndroma");
		} else {
			System.out.println("La frase no es palíndroma");
		}
	}

	public static boolean esPalindroma(String cadena) {
		String sinEspacios = "";
		for (int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			if (!Character.isWhitespace(c)) {
				sinEspacios += c;
			}
		}
		sinEspacios = sinEspacios.toLowerCase();
		String invertida = invertir(sinEspacios);
		return sinEspacios.equals(invertida);
	}

	public static String invertir(String cadena) {
		String resultado = "";
		for (int i = cadena.length() - 1; i >= 0; i--) {
			resultado += cadena.charAt(i);
		}
		return resultado;
	}

}