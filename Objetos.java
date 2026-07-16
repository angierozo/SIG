import java.util.Scanner;


public class Objetos{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		Persona daniel = new Persona("18/07/1998","Daniel Leal");
		daniel.comer();
		Persona luisa = new Persona("15/01/2000","Luisa Lopez");
		luisa.respirar();
	}
}