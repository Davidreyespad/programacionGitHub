Funcion CantidadDeDivisores <- divisor( x )
	Para i<- 1 hasta x Hacer
		
		si x % i = 0 Entonces
			Escribir i
		FinSi
	FinPara
FinFuncion

Algoritmo CantidadDeDivisores
	
	Definir x Como Entero
	Escribir "Por favor ingrese un número para saber sus divisores"
	Leer x
	Escribir divisor(x)
	
FinAlgoritmo


