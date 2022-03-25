Algoritmo Ejercicio9_5
	
	Dimension datos[3]
	Dimension datos2[3]
	Dimension multiplicacion[3]
	
	
	Escribir "Introduce 3 números del primer vector"
	Para i <- 1 hasta 3 con paso 1 Hacer
		Leer datos[i]
	FinPara
	
	Escribir "Introduce 3 números del segundo vector"
	Para i <- 1 hasta 3 con paso 1 Hacer
		Leer datos2[i]
	FinPara
	
	Escribir "Esta es la suma de los vectores"
	Para i <- 1 hasta 3 con paso 1 Hacer
		multiplicacion[i] = datos[i] * datos2[i]
		Escribir multiplicacion[1]
	FinPara
	
	
FinAlgoritmo
