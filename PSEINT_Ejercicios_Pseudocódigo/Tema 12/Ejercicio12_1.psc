Proceso EscribirCentrado
	lafrase(80,"Texto centrado")
FinProceso
Subproceso lafrase (p,texto)
	Para r<-1 Hasta p  Hacer
		Escribir " "
	Fin Para
	Para x<-1 Hasta p  Hacer
		Escribir Sin Saltar " "
	finpara
	escribir texto
	Para s<-1 Hasta p  Hacer
		Escribir " "
	FinPara
FinSubProceso
