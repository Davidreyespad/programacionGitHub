Algoritmo Ejercicio9_2
	
	Dimension datos[5]
	Definir datos, suma como entero
	Definir media como real
	suma <- 0
	Definir i como entero
	
	Para i <- 1 hasta 5 con paso 1 hacer
		escribir "Escriba un n�mero: "
		leer datos[i]
	FinPara
	
	Para i <- 1 hasta 5 con paso 1 Hacer
		suma <- suma + datos[i]
	FinPara
	
	Escribir "La suma de los n�meros es: " suma
	media <- suma/5
	Escribir "El promedio es: " media
	
FinAlgoritmo


