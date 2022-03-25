import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Boletin6Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la contraseña a adivinar: ");
		String pass = sc.nextLine();
		char c[];
		// c= pass.toCharArray();
		boolean adivina = false;

		System.out.println("Pistas...");

		System.out.println("Numero de caracteres: " + pass.length());
		System.out.println("Caracter inicial: " + pass.charAt(0));// c[0]);
		System.out.println("Caracter final: " + pass.charAt(pass.length() - 1));// c[c.length-1]);

		while (!adivina) {
			System.out.println("Adivina la contraseña: ...");
			String intento = sc.nextLine();

			if (pass.equals(intento)) {
				adivina = true;
			} else {
				int r;
				r = pass.compareTo(intento);
				if (r > 0) {
					System.out.println("La contraseña es posterior alfabéticamente");
				} else {
					System.out.println("La contraseña es anterior alfabéticamente");
				}
			}

		}

	}
}