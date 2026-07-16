public class Carro{
	String mar;
	String pla;
	Carro(String marca, String placa){
		mar=marca;
		pla=placa;
	}

	public void accidente(){
		System.out.println("La marca de carro que sufrió el accidente fue "+marca+"y tenia la placa "+placa);
	}
	public void estrello(){
		System.out.println("El carro que ocasionó el accidente tenia la placa "+placa+" y era de marca "+marca);
	}
}