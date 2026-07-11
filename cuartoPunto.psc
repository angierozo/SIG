Funcion MCD <- calculoMCD ( Argumentos )
	
Fin Funcion



Algoritmo cuartoPunto
	definir x, MCD, a, b, z, Como Entero
	Imprimir "ingrese un valor"
	Leer x
	Si x<0 Entonces
		Imprimir "el numero ingresado es menor a 0"
	SiNo
		Mientras x>=0 Hacer
			a=MCD
			b=x
			Mientras b>=0 Hacer
				z=b
				z=a MOD b
				a=z
			Fin Mientras
			MCD=a
		Fin Mientras
	Fin Si

	
FinAlgoritmo
