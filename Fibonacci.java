import java.util.Scanner;


public class Fibonacci{

	public static double fibo(int x){
		
		if(x==0){
			return 0;
		}
		if(x==1||x==2){
			return 1;
		}
		return fibo(x-1)+fibo(x-2);
	}

	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un numero");
		int valor = entrada.nextInt();
		System.out.println(fibo(valor));

	}

}