Algoritmo Ejercicio9_3
	
	Dimension datos[5]
	Definir datos, suma como entero
	Definir media como real
	suma <- 0
	Definir i como entero
	
	Para i <- 1 hasta 5 con paso 1 hacer
		escribir "Escriba un número: "
		leer datos[i]
	FinPara
	
	Para i <- 1 hasta 5 con paso 1 Hacer
		suma <- suma + datos[i]
	FinPara
	
	Escribir "La suma de los números es: " suma
	media <- suma/5
	Escribir "La media es: " media
	Escribir "Valores mayores que la media" 
	
	Para i <- 1 hasta 5 con paso 1 hacer
		Si datos[i] > media Entonces
			Escribir datos[i] 
		FinSi
		
	FinPara
	

FinAlgoritmo
