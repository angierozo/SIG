public class Carro_1{
	String marca;
	int gasolina;
	int motor;
	Motor_1 c;
	Carro_1(String marca, int gas, int motor){
		gasolina=gas;
		this.marca=marca;
		this.motor=motor;
	}

	public void acelerar(){
		System.out.println("El carro esta acelerando con "+motor+" caballos de fuerza");
	}
	public void frenar(){
		System.out.println("El carro esta frenando");
	}
	public void fuerza(int x){
		if(x==1){
			c = new Motor_1(0);
		}else{
			c = new Motor_1(300);
		}
	}

	public String getmarca(){
		return marca;
	}

}
