package Bingo;

import java.util.Scanner;

public class Bingo {
	
	public static void main(String[] args) { 
		
		int bola, acumulador1 = 0, acumulador2 = 0, numero1 = 0, numero2 = 0, cont1 = 1, cont2 = 1, premio1 = 0, premio2 = 0;
		boolean linea = false;
		boolean bingo = false;

        System.out.println("---------------------------");
        System.out.println("BINGO IES MARTÍNEZ MONTAÑÉZ");
        System.out.println("---------------------------");
        System.out.println("PREMIOS");
        System.out.println("LÍNEA:100$");
        System.out.println("BINGO:500$");
		System.out.println("\nPresione enter para sacar bola.");

		for (int i = 0; i < 19; i++) {
			System.out.print("-");
		}
		System.out.println();

		Scanner teclado = new Scanner(System.in); 
		try {
			String siguiente = teclado.nextLine();
		} catch (Exception e) {
		}

		int[][] primercarton = new int[3][5]; 
		int[][] segundocarton = new int[3][5];

		for (int j = 0; j < 5; j++) { 
			for (int i = 0; i < 3; i++) {
				numero1 = (int) (Math.random() * 9 + cont1);
				primercarton[i][j] = numero1;
			}
			cont1 = cont1 + 10;
		}

		System.out.println("\n	Jugador 1"); 
		for (int i = 0; i < 19; i++) {
			System.out.print("-");
		}
		System.out.println();

		for (int i = 0; i < 3; i++) { 
			for (int j = 0; j < 5; j++) {
				System.out.print(primercarton[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println();

		for (int j = 0; j < 5; j++) { 
			for (int i = 0; i < 3; i++) {
				numero2 = (int) (Math.random() * 9 + cont2);
				segundocarton[i][j] = numero2;
			}
			cont2 = cont2 + 10;
		}

		System.out.println("\n	Jugador 2"); 
		for (int i = 0; i < 19; i++) {
			System.out.print("-");
		}
		System.out.println();

		for (int i = 0; i < 3; i++) { 
			for (int j = 0; j < 5; j++) {
				System.out.print(segundocarton[i][j] + " | ");
			}
			System.out.println();
		}
		do {
			System.out.println("\nPulse enter para sacar bola."); 
			try {
				String siguiente;
				siguiente = teclado.nextLine();
			} catch (Exception e) {
			}

			bola = (int) (Math.random() * 49 + 1);
			System.out.println("El número que ha salido es el " + bola+"."); 

			System.out.println("\n	Jugador 1"); 
			for (int i = 0; i < 19; i++) {
				System.out.print("-");
			}
			System.out.println();

			for (int i = 0; i < 3; i++) { 
				for (int j = 0; j < 5; j++) {
					if (primercarton[i][j] == bola) {
						primercarton[i][j] = 0;
					}
					if (primercarton[i][j] == 0) {
						System.out.print("X | ");
					} else {
						System.out.print(primercarton[i][j] + " | ");
					}
				}
				System.out.println();
			}
			System.out.println();

			System.out.println("\n	Jugador 2"); 
			for (int i = 0; i < 19; i++) {
				System.out.print("-");
			}
			System.out.println();

			for (int i = 0; i < 3; i++) { 
				for (int j = 0; j < 5; j++) {
					if (segundocarton[i][j] == bola) {
						segundocarton[i][j] = 0;
					}
					if (segundocarton[i][j] == 0) {
						System.out.print("X | ");
					} else {
						System.out.print(segundocarton[i][j] + " | ");
					}
				}
				System.out.println();
			}
			for (int i = 0; i < 3; i++) {
				acumulador1 = 0;
				for (int j = 0; j < 5; j++) {
					acumulador1 = acumulador1 + primercarton[i][j];
				}
				if (acumulador1==0) {
					premio1 = premio1 + 100;
					System.out.println("\nEl jugador 1 ha cantado LINEA");
					System.out.println("Dinero acumulado");
					System.out.println("----------------");
					System.out.println("Dinero acumulado jugador 1: "+premio1+"$");
					System.out.println("Dinero acumulado jugador 2: "+premio2+"$");
					linea=true;
				}
					
			}
			for (int i = 0; i < 3; i++) {
				acumulador2 = 0;
				for (int j = 0; j < 5; j++) {
					acumulador2 = acumulador2 + segundocarton[i][j];
				}
				if (acumulador2==0) {
					premio2 = premio2 + 100;
					System.out.println("\nEl jugador 2 ha cantado LINEA");
					System.out.println("Dinero acumulado");
					System.out.println("----------------");
					System.out.println("Dinero acumulado jugador 1: "+premio1+"$");
					System.out.println("Dinero acumulado jugador 2: "+premio2+"$");
					linea=true;
				}
					
			}
		} while (!linea);

		do {
			acumulador1=0;
			acumulador2=0;
			System.out.println("\nPulse enter para sacar bola."); 
			try {
				String seguir;
				seguir = teclado.nextLine();
			} catch (Exception e) {
			}

			bola = (int) (Math.random() * 49 + 1);
			System.out.println("El número que ha salido es el " + bola+"."); 

			System.out.println("\n	Jugador 1"); 
			for (int i = 0; i < 19; i++) {
				System.out.print("-");
			}
			System.out.println();

			for (int i = 0; i < 3; i++) { 
				for (int j = 0; j < 5; j++) {
					if (primercarton[i][j] == bola) {
						primercarton[i][j] = 0;
					}
					if (primercarton[i][j] == 0) {
						System.out.print("X | ");
					} else {
						System.out.print(primercarton[i][j] + " | ");
					}
				}
				System.out.println();
			}
			System.out.println();

			System.out.println("\n	Jugador 2"); 
			for (int i = 0; i < 19; i++) {
				System.out.print("-");
			}
			System.out.println();

			for (int i = 0; i < 3; i++) { 
				for (int j = 0; j < 5; j++) {
					if (segundocarton[i][j] == bola) {
						segundocarton[i][j] = 0;
					}
					if (segundocarton[i][j] == 0) {
						System.out.print("X | ");
					} else {
						System.out.print(segundocarton[i][j] + " | ");
					}
				}
				System.out.println();
			}
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 5; j++) {
					acumulador1 = acumulador1 + primercarton[i][j];
				}
			}
			
			if (acumulador1==0) {
				premio1 = premio1 + 500;
				System.out.println("\nEl jugador 1 ha cantado BINGO");
				System.out.println("Dinero acumulado");
				System.out.println("----------------");
				System.out.println("Dinero acumulado jugador 1: "+premio1+"$");
				System.out.println("Dinero acumulado jugador 2: "+premio2+"$");
				bingo=true;
			}
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 5; j++) {
					acumulador2 = acumulador2 + segundocarton[i][j];
				}
			}
			
			if (acumulador2==0) {
				premio2 = premio2 + 500;
				System.out.println("\nEl jugador 2 ha cantado BINGO");
				System.out.println("Dinero acumulado");
				System.out.println("----------------");
				System.out.println("Dinero acumulado jugador 1: "+premio1+"$");
				System.out.println("Dinero acumulado jugador 2: "+premio2+"$");
				bingo=true;
			}
			
		} while (!bingo);
		teclado.close();
	}
	}

