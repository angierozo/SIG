Funcion definirpar(x)
	Si x MOD 2==0 Entonces
		Imprimir "X es par"
	SiNo
		Imprimir "x es impar"
	Fin Si
Fin Funcion


Algoritmo miSegundoPrograma
	Definir x Como Entero
	Escribir  "Escriba un valor"
	Leer x
	Mientras x>0 Hacer
		definirpar(x)
		Escribir  "escriba un valor"
		Leer x
	Fin Mientras
	Imprimir "el numero ingresado fue menor o igual a 0"
FinAlgoritmo
