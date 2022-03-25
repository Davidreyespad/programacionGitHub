Algoritmo Ejercicio6
	
	Escribir "Dime la cantidad de preguntas"
	Leer primerNumero
	Escribir "Dime la cantidad de preguntas contestadas correctamente"
	Leer segundoNumero
	
	porcentaje=(segundoNumero/primerNumero)*100
	
	Si porcentaje >= 90 Entonces
		Escribir "Usted tiene el nivel máximo"
	FinSi
	Si porcentaje >= 75 y porcentaje < 90 Entonces
		Escribir "Usted tiene el nivel medio"
	FinSi
	Si porcentaje >= 50 y porcentaje < 75 Entonces
		Escribir "Usted tiene el nivel regular"
	FinSi
	Si porcentaje < 50 Entonces
		Escribir "Usted está fuera de nivel"
	FinSi
	
FinAlgoritmo
