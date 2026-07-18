public class Persona{
	String equipaje;
	String nombre;
	Maleta c;
	Persona(String equipaje, String nme){
		this.equipaje=equipaje;
		nombre=nme;
	}

	public void viaje(){
		System.out.println("La persona "+nombre+" tiene"+equipaje+" maletas como equipaje");
	}

	public void cantidad(int x){
		if (x==1){
			c = new Maleta(1);
		}else{
			c = new Maleta(2);
		}
	}
}