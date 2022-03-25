Algoritmo Ejercicio9
	
	Definir primerNumero Como Entero
	Definir segundoNumero Como Entero
	Definir tercerNumero Como Entero
	
	Escribir "Dime un número"
	Leer primerNumero
	Escribir "Dime otro número"
	Leer segundoNumero
	Escribir "Dime otro número"
	Leer tercerNumero
	
	A=primerNumero+segundoNumero
	B=primerNumero+tercerNumero
	C=segundoNumero+tercerNumero
	
	Si A = tercerNumero Entonces
		Escribir "La suma del primer número con el segundo número da como resultado el tercer número"
	FinSi
	
	Si B = segundoNumero Entonces
		Escribir "La suma del primer número con el tercer número da como resultado el segundo número"
	FinSi
	
	Si C = primerNumero Entonces
		Escribir "La suma del segundo número con el tercer número da como resultado el primer número"
	FinSi
	
FinAlgoritmo
