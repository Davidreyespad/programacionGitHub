Algoritmo Ejercicio9_6
	
	
	Definir datos Como Entero
	Dimension datos[7]
	
	Escribir "Introduce 7 números enteros "  
	Para contador = 1 hasta 7 con paso 1 hacer			
        Leer datos[contador]				
    FinPara
	
	Para f <- 1 hasta 7 con paso 1 hacer			
        Para fx <- f hasta 7 con paso 1 hacer			
            Si datos[f] > datos[fx] Entonces
                A <- datos[f];
                datos[f] <- datos[fx];
                datos[fx] <- A;					
            FinSi
        FinPara	
    FinPara
	
	Escribir "Estos son tus números ordenados:"
	Para contador = 1 hasta 7 con paso 1 hacer			
        Escribir sin saltar datos[contador], " ";
    FinPara
	Escribir ""
	
FinAlgoritmo
