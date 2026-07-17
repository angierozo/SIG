import java.util.Scanner;


public class HolaMundo_1{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		Persona_1 d = new Persona_1("18/07/1998","Daniel Leal");
		d.respirar();
		Persona_1 p = new Persona_1("15/01/2000","Luisa Lopez");
		p.respirar();
		d.manejar();
		d.comprarCarro(1);
		p.setCarro_1(new Carro_1("Ferrari", 50 , 100));
		System.out.println(d.getCarro_1().getmarca());
		d.manejar();
		p.manejar();
	}
}