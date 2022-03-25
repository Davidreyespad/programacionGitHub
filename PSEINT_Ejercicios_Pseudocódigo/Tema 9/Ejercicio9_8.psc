Algoritmo Ejercicio9_8
	
	
	Definir datos Como Entero
	Dimension datos[10]
	Dimension datos2[10]
	
	Escribir "Introduce 10 números enteros "  
	Para contador = 1 hasta 10 con paso 1 hacer			
        Leer datos[contador]				
    FinPara
	
	Escribir "Introduce 10 números enteros "  
	Para contador = 1 hasta 10 con paso 1 hacer			
        Leer datos2[contador]				
    FinPara
	
	Para f <- 1 hasta 10 con paso 1 hacer			
        Para fx <- f hasta 10 con paso 1 hacer			
            Si datos[f] > datos[fx] Entonces
                A <- datos[f];
                datos[f] <- datos[fx];
                datos[fx] <- A;					
            FinSi
        FinPara	
    FinPara
	
	Para f <- 1 hasta 10 con paso 1 hacer			
        Para fx <- f hasta 10 con paso 1 hacer			
            Si datos2[f] > datos2[fx] Entonces
                A <- datos2[f];
                datos2[f] <- datos2[fx];
                datos2[fx] <- A;					
            FinSi
        FinPara	
    FinPara
	
	Escribir "Estos son tus números ordenados:"
	Para contador = 1 hasta 10 con paso 1 hacer			
        Escribir sin saltar datos[contador], " ";
    FinPara
	Escribir ""
	
FinAlgoritmo
