public class Persona_1{
	String fecha_nacimiento;
	String nombre;
	Carro_1 c;
	Persona_1(String fecha, String nme){
		fecha_nacimiento=fecha;
		nombre=nme;
	}

	public void respirar(){
		System.out.println("La persona "+nombre+" nacida el dia "+fecha_nacimiento+" esta respirando");
	}

	public void comer(){
		System.out.println("La persona esta comiendo");
	}

	public void comer(String comida){
		System.out.println("La persona esta comiendo"+comida);
	}

	public void comprarCarro(int x){
		if (x==1){
			c = new Carro_1("Ferrari", 50 , 100);
		}else{
			c = new Carro_1("Chevrolet", 10, 0);
		}
	}

	public void manejar(){
		if(c!=null){
			c.acelerar();
			c.frenar();
		}else{
			System.out.println("Lo siento, le tocó en transmilenio");
		}
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public Carro_1 getCarro_1(){
		return c;
	}

	public void setCarro_1(Carro_1 carrito){
		c=carrito;
	}

}