public class Motor{
	String tipo;
	int combustible;
	int motor;
	int potencia;
	Motor(String tipo, int comb, int potencia){
		this.tipo=tipo;
		combustible=comb;
		this.potencia=potencia;
		this.motor=calcularPotencia(comb, potencia);
	}

	public int calcularPotencia(int x, int y){
		if (y==0){
			return 1;
		} else {
			return x*calcularPotencia(x,y-1);
		}
	}


	public void motor(){
		System.out.println("El motor del avion es "+motor+" y su combustible es de "+combustible+" con una potencia de " +potencia);
	}

}
