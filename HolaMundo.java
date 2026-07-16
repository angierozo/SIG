public class HolaMundo{

	public static int factorial(int x){
		if(x==1){
			return 1;
		}
		return x*factorial(x-1);
	}

	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un numero");
		int valor = entrada.nextInt();
		System.out.println(factorial(valor));

	}

}