Algoritmo Ejercicio5
	
	Escribir "Dime tu sueldo"
	Leer primerNumero
	Escribir "Dime tus a�os de antig�edad"
	Leer segundoNumero
	
	Si primerNumero < 500 y segundoNumero >= 10 Entonces
		Escribir "Se le otorga un aumento del 20% del sueldo (" [(primerNumero*20)/100] " euros), as� que su sueldo pasara a ser de " [(primerNumero*20)/100] + primerNumero " euros."
	FinSi
	Si primerNumero < 500 y segundoNumero < 10 Entonces
		Escribir "Se le otorga un aumento del 5% del sueldo (" [(primerNumero*5)/100] " euros), as� que su sueldo pasara a ser de " [(primerNumero*5)/100] + primerNumero " euros."
	FinSi
	Si primerNumero >= 500 Entonces
		Escribir "Su sueldo seguira siendo de " primerNumero " euros."
	FinSi
	
	
FinAlgoritmo
