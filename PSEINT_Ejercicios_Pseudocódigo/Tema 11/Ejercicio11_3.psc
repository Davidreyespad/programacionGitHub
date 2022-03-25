Algoritmo Ejercicio11_3
	
	
	vocales="a,e,i,o,u"
	Escribir "Dime tu nombre"
	Leer nombre
	
	Escribir Mayusculas(nombre)
	Para i<-1 Hasta longitud(nombre) con paso 1 Hacer
		Para j<-1 Hasta longitud(vocales) con paso 1 Hacer
			Si Subcadena(nombre,i,i)=Subcadena(vocales,j,j) Entonces
				Escribir "Una vocal de tu nombre es:" Subcadena(nombre,i,i), " "
			FinSi
		FinPara
	FinPara
	
	
	
FinAlgoritmo
