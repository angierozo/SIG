Funcion determinarminymax (x)
	si x>max Entonces
		max=x	
	FinSi
	si x<min Entonces
		min=x
FinFuncion

Algoritmo miTercerPrograma
	DEFINIR x,max,min,suma,conteo Como Entero
	Imprimir "ingrese numeros"
	Leer x
	conteo=0
	suma=0
	Si x>0 Entonces
		max=x
		min=x
	Fin Si
	Mientras x>0 Hacer
		determinarminymax(x)
		FinSi
		conteo=conteo+1
		suma=suma+x
		Leer x
	FinMientras
	Escribir "el mayor numero ingresado:", max," y el menor numero ingreso:", min," y el promedio: ",suma/conteo
FinAlgoritmo
