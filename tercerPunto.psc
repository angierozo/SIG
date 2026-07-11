Funcion operacion <- primo ( x )
	Si x mod 2 ==0 Entonces
		Imprimir "Numero primo"
	SiNo
		acciones_por_falso
	Fin Si
	
	

		SiNo
			EsPrimo<-Nu<>1 
			Nu<-RC(Nu)
			Divisor<-3
			Mientras Divisor<=Raiz(Nu) & EsPrimo Hacer
				Si N mod Divisor = 0 Entonces 
					EsPrimo<-Falso
				Sino
					Divisor<-Divisor+2
				FinSi
			FinMientras
			Escribir 'Numero primo:',EsPrimo
			Si N>1 & ~ EsPrimo Entonces 
				Escribir N,'=',Divisor,'x',N/Divisor
			FinSi
		FinSi
	FinSi
FinFuncion

Algoritmo tercerPunto
	definir x Como Entero
	Imprimir "ingrese un numero"
	Leer x
	
FinAlgoritmo
