Algoritmo Ejercicio8
	
	
	
	Escribir "Dime cuanto vale la base del triángulo"
	Leer primerNumero
	Escribir "Dime cuanto vale la altura del triángulo"
	Leer segundoNumero
	Escribir "Dime cuanto vale el radio del círculo"
	Leer tercerNumero
	
	A1=(primerNumero*segundoNumero)/2
	A2=(PI*tercerNumero)^2
	
	Si A1 > A2 Entonces
		Escribir "El área del triángulo es más grande que el área del círculo"
	FinSi
	
	Si A1 < A2 Entonces
		Escribir "El área del círculo es más grande que el área del triángulo"
	FinSi

	
FinAlgoritmo
