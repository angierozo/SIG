import java.util.Scanner;


public class Avion{

	Motor motor;
	Persona d;
	Persona p;

	Avion(){
		motor = new Motor("Turbinas", 200000, 4);
		Persona d = new Persona("mano","Daniel Leal");
		Persona p = new Persona("bodega","Luisa Lopez");

	}
	
	public void fuerza(int x){
		if(x==1){
			System.out.println("El avion voló");
		}else{
			System.out.println("El avion aceleró");
		}
	}

		
}