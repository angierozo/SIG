import java.util.Scanner;


public class Noticia{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		Carro lam = new Carro("Lamborghini","ABC123");
		lam.accidente();
		Carro toy = new Carro("Toyota","ZVY845");
		toy.estrello();
	}
}