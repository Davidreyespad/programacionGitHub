Algoritmo Ejercicio_2
	
	Escribir "MENU PRINCIPAL"
	Escribir "-------------"
	Escribir "1. Operaciones b�sicas"
	Escribir "2. Operaciones variadas"
	Escribir "0. SALIR"
	
	Escribir "Introduce una opcion: "
	Leer opciones

	
	Segun opciones hacer
		
		1:
			Repetir 
			Escribir "MENU DE OPERACIONES B�SICAS"
			Escribir "---------------------------"
			Escribir "1. Sumar"
			Escribir "2. Restar"
			Escribir "3. Multriplicar"
			Escribir "4. Dividir"
			Escribir "0. REGRESAR"
			
			Escribir "Introduce una opcion: "
			Leer opciones
			
				Segun opciones hacer
					
					1:
						Escribir "Introduce el primer n�mero: "
						Leer n1
						Escribir "Introduce el segundo n�mero: "
						Leer n2 
						Escribir sin saltar "Resultado: "
						Escribir n1+n2
						
					2:
						Escribir "Introduce el primer n�mero: "
						Leer n1
						Escribir "Introduce el segundo n�mero: "
						Leer n2 
						Escribir sin saltar "Resultado: "
						Escribir n1-n2
						
					3:
						Escribir "Introduce el primer n�mero: "
						Leer n1
						Escribir "Introduce el segundo n�mero: "
						Leer n2 
						Escribir sin saltar "Resultado: "
						Escribir n1*n2
						
					4:
						Escribir "Introduce el primer n�mero: "
						Leer n1
						Escribir "Introduce el segundo n�mero: "
						Leer n2 
						Escribir sin saltar "Resultado: "
						Escribir n1/n2
						
					0:	
						
						
						
				FinSegun
			Hasta que opciones=0
			
		2:
			
			Escribir "MENU DE OPERACIONES VARIADAS"
			Escribir "---------------------------"
			Escribir "1. Numero y d�a"
			Escribir "2. Suma de los primeros n n�meros naturales"
			Escribir "3. N�mero primo"
			Escribir "4. Invertir un n�mero de 4 cifras"
			Escribir "0. REGRESAR"
			
			Escribir "Introduce una opcion: "
			Leer opciones
			
			Segun opciones hacer
				
				1:
					Definir n Como Entero
					Escribir "CONVIERTE N�MERO A D�A"
					Escribir " Introduzca el n�mero de d�a: "
					Leer n
					Si n=1 Entonces
						Escribir "Lunes"
					Fin Si
					Si n=2 Entonces
						Escribir "Martes"
					Fin Si
					Si n=3 Entonces
						Escribir "Mi�rcoles"
					Fin Si
					Si n=4 Entonces
						Escribir "Jueves"
					Fin Si
					Si n=5 Entonces
						Escribir "Viernes"
					Fin Si
					Si n=6 Entonces
						Escribir "S�bado"
					Fin Si
					Si n=7 Entonces
						Escribir "Domingo"
					Fin Si
					Si n<1 o n>7 Entonces
						Escribir "El n�mero introducido no es ning�n d�a de la semana"
					Fin Si
					
				2:
					Escribir "SUMA DE LOS PRIMEROS N NUMEROS"
					Definir suma,i como numerico
					
					Dimension datos[5]
					
					Escribir "Introduce numero n: "
					
					para i <- 1 hasta 1 hacer
						
						Leer datos[i] 
						
					FinPara
					
					suma <- 0
					
					para i <- 1 hasta 5 hacer
						suma <- suma + datos[i]
					FinPara
					
					Escribir suma
					
					
				3:
					
					Escribir "NUMERO PRIMO"
					Escribir " Introduce el n�mero"
					Leer primo
					Si primo/3<> 1 Entonces
						Si primo/5<> 1 Entonces
							Si primo/7<> 1 Entonces
								Escribir "No es un n�mero primo"
							SiNo
								Escribir "Es un n�mero primo"
							FinSi
						FinSi
					FinSi

					
					
				4:
					Escribir "INVERTIR UN NUMERO DE 4 CIFRAS"
					Escribir "Introduce el n�mero de 4 cifras: "
					Leer cifra
					
					Para i=Longitud(cifra) hasta 1 Hacer
						Escribir Sin saltar Subcadena(cifra,i,i)
					FinPara
					Escribir""
					
				0:
					
					
					
			FinSegun

	FinSegun

	

	
	
FinAlgoritmo
