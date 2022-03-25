import java.util.Scanner;

public class David_Reyes_Padilla {
	
	public static void main(String[] args) {

	     
		Scanner s= new Scanner(System.in);
		int n;
		System.out.println("¡BIENVENIDO A LA CARRERA DEL SIGLO!");
		System.out.println("¿Cuál es el número mínimo del dado?");
	    int minDado = s.nextInt();
		System.out.println("¿Cuál es el número máximo del dado?");
	    int maxDado = s.nextInt();
		System.out.println("¿Cuál es el nombre del jugador 1?");
		int nombre1 = s.nextInt();
		System.out.println("¿Cuál es el nombre del jugador 2?");
		int nombre2 = s.nextInt();
		
	
		
	}
		
		
		public static boolean sumaDeNumerosEsprimo	(int[] x) {	
		
		int n = Integer.parseInt(System.console().readLine());
	
		int minimoDado = 0;
		int maximoDado = 0;
		int n1 = minimoDado + maximoDado;
		boolean esPrimo = true;
		for (int i = 2; i < n1; i++) {
			
			if ((n1 % 1) == 0) {
			
				esPrimo = false;
			}
		}
		return esPrimo;
		
		}
		
	}



