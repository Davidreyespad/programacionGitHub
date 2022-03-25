Algoritmo Ejercicio9_4
	
	Dimension datos[3]
	Dimension datos2[3]
	Dimension suma[3]
	
	
	Escribir "Introduce 3 números del primer vector"
	Para i <- 1 hasta 3 con paso 1 Hacer
		leer datos[i]
	FinPara
	
	Escribir "Introduce 3 números del segundo vector"
	Para i <- 1 hasta 3 con paso 1 Hacer
		leer datos2[i]
	FinPara
	
	Escribir "Esta es la suma de los vectores"
	Para i <- 1 hasta 3 con paso 1 Hacer
		suma[i] = datos[i] + datos2[i]
		escribir suma[1]
	FinPara
	
	
	
FinAlgoritmo
