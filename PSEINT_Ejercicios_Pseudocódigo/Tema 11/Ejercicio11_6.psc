Algoritmo Ejercicio11_6
	
	Definir frase Como Caracter
	Definir n,x,c Como Entero
	Escribir "Dime tu nombre y apellidos"
	Leer frase
	
	n = Longitud(frase)
	c = 0
	
	
	Para x = 1 Hasta n Con paso 1 Hacer
		Si x == 1 Entonces
			Escribir Mayusculas(Subcadena(frase,x,x)) sin saltar
		Sino
			si Subcadena(frase,x,x) == " " Entonces
				c = 1
			SiNo
				si c == 1 Entonces
					Escribir " ",Mayusculas(Subcadena(frase,x,x)) sin saltar 
					c = 0     
				SiNo
					Escribir Minusculas(Subcadena(frase,x,x)) sin saltar
				FinSi
			FinSi
		finsi
	Fin Para
	Escribir ""
	
	
	
	
FinAlgoritmo
