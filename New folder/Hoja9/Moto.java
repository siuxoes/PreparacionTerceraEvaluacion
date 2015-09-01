package Hoja9;

public class Moto extends Vehiculo {

	int cilindrada;

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public void imprimir() {
		System.out.println("La marca es " + this.getMarca());
		System.out.println("El modelo es " + this.getModelo());
		System.out.println("El año es " + this.getAnno());
		System.out.println("El precio es de " + this.getPrecio());
		System.out.println("Tiene la matricula " + this.getMatricula());
		System.out.println("La cilindrada es de " + this.getCilindrada()
				+ " m3");
	}
}
