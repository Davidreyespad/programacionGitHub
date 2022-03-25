Algoritmo Juego_del_tesoro
	

	Dimension datos[4,5]
	
	minay<-azar(5)+1
	tesoroy<-azar(5)+1
	
	
	Repetir 
		minax<-azar(4)+1
		tesorox<-azar(4)+1
		
	Hasta Que 	minax <> tesorox
	
	Escribir "-------------------"
	Escribir "¡BUSCA EL TESORO!"
	Escribir "-------------------"
	
	para i <- 1 hasta 4 hacer
		para j <- 1 hasta 5 hacer
			 datos[i,j] = ""
		FinPara
	FinPara

	datos[minax,minay] = "*"
	datos[tesorox,tesoroy] = "$"
	
	para i <- 4 hasta 1 Hacer
		escribir sin saltar i "| "
		para j <- 1  hasta 5 Hacer
			Escribir Sin Saltar datos[i,j], " "
			Escribir sin saltar ""
		FinPara
		Escribir ""
	FinPara
	
	
FinAlgoritmo
