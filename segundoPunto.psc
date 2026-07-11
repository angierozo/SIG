Funcion definirpar(x)
	Si x MOD 2==0 Entonces
		Imprimir "el numero es par"
	SiNo
		Imprimir "el numero es impar"
		conteo=conteo+1
	FinSi
Fin Funcion

Algoritmo segundoPunto
	Definir x Como Entero
	Imprimir "ingrese un numero"
	Leer x
	Imprimir "ingrese otro numero"
	Leer z
	Si x>z Entonces
		definirpar(x)
		Imprimir "el conteo de numeros impares es" ,conteo
	SiNo
		Leer x
		Mientras x<x Hacer
			Leer x
			definirpar(x)
		Fin Mientras
	Fin Si
	Imprimir "la cantidad de numeros impares registrados fueron", conteo
	
FinAlgoritmo
