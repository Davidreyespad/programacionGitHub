Algoritmo Ejercicio9
	
	Definir primerNumero Como Entero
	Definir segundoNumero Como Entero
	Definir tercerNumero Como Entero
	
	Escribir "Dime un n�mero"
	Leer primerNumero
	Escribir "Dime otro n�mero"
	Leer segundoNumero
	Escribir "Dime otro n�mero"
	Leer tercerNumero
	
	A=primerNumero+segundoNumero
	B=primerNumero+tercerNumero
	C=segundoNumero+tercerNumero
	
	Si A = tercerNumero Entonces
		Escribir "La suma del primer n�mero con el segundo n�mero da como resultado el tercer n�mero"
	FinSi
	
	Si B = segundoNumero Entonces
		Escribir "La suma del primer n�mero con el tercer n�mero da como resultado el segundo n�mero"
	FinSi
	
	Si C = primerNumero Entonces
		Escribir "La suma del segundo n�mero con el tercer n�mero da como resultado el primer n�mero"
	FinSi
	
FinAlgoritmo
