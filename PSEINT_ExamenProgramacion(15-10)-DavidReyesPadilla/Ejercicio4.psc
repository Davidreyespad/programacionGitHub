Algoritmo Ejercicio4
	
	Definir primerNumero Como Entero
	Definir segundoNumero Como Entero
	
	Escribir "Dime una cordenada (distinta de cero)"
	Leer primerNumero
	Escribir "Dime otra cordenada (distinta de cero)"
	Leer segundoNumero
	
	Si primerNumero > 0 y segundoNumero > 0 Entonces
		Escribir "Se encuentra en el primer cuadrante"
	FinSi
	Si primerNumero < 0 y segundoNumero > 0 Entonces
		Escribir "Se encuentra en el segundo cuadrante"
	FinSi
	Si primerNumero < 0 y segundoNumero < 0 Entonces
		Escribir "Se encuentra en el tercer cuadrante"
	FinSi
	Si primerNumero > 0 y segundoNumero < 0 Entonces
		Escribir "Se encuentra en el cuarto cuadrante"
	FinSi
	
FinAlgoritmo
