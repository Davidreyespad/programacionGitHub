Algoritmo Ejercicio11_2
	
	
	Escribir "Dime una palabra"
	Leer nombre
	Para j<-1 Hasta longitud(nombre) Hacer
		p<-subcadena(nombre,j,j)
		Si j%2=1  Entonces
			Escribir sin saltar Mayusculas(p)
		Sino
			Escribir sin saltar Minusculas(p)
		finsi
	Fin Para
	Escribir ""
	
	
FinAlgoritmo
