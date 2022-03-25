Algoritmo Ejercicio11_1
	
    Escribir "Dime tu nombre"
    Leer nombre
	
    Escribir "Tu nombre al reves quedaría:"
    Para x <- Longitud(nombre) Hasta 1 Hacer
        Escribir Sin Saltar Subcadena(nombre, x, x)
    FinPara
    Escribir ""
	
FinAlgoritmo

