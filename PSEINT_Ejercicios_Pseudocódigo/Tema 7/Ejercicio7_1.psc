Algoritmo Ejercicio7_1
	
	Repetir
		Escribir "Dime tu clave de acceso"
		Leer clave
		Escribir "Dime tu codigo"
		Leer codigo
		Si clave <> 1234 Entonces
			Escribir "Clave incorrecta"
		Sino 
			Escribir "Clave correcta"
		FinSi
		Si codigo <> 1 Entonces
			Escribir "Codigo incorrecto"
		SiNo
			Escribir "Codigo correcto"
		FinSi
		
		Escribir ""
	Hasta Que clave=1234 y codigo=1
	Escribir "Bienvenido!"

	
FinAlgoritmo
