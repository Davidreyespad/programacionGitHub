Algoritmo Ejercicio4_6
	
	Definir primerNumero Como Entero
	Definir segundoNumero Como Entero
	Definir tercerNumero Como Entero
	
	Escribir "Dime un numero"
    Leer primerNumero
    Escribir "Dime otro numero"
    Leer segundoNumero
	Escribir "Dime otro numero mas"
	Leer tercerNumero
	
	Si primerNumero > segundoNumero Entonces
	
		si primerNumero > tercerNumero Entonces
			Escribir "El primer numero es el mayor"
		FinSi
	Finsi
	
	Si segundoNumero > primerNumero Entonces
		
		si segundoNumero > tercerNumero Entonces
			Escribir "El segundo numero es el mayor"
		FinSi
	Finsi
	
	Si tercerNumero > primerNumero Entonces
		
		si tercerNumero > segundoNumero Entonces
			Escribir "El tercer numero es el mayor"
		FinSi
	Finsi
	
FinAlgoritmo
