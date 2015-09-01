package Hoja9;

public class Turismo extends Vehiculo {

	int numPlazas;

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	public void imprimir() {
		System.out.println("La marca es " + this.getMarca());
		System.out.println("El modelo es " + this.getModelo());
		System.out.println("El año es " + this.getAnno());
		System.out.println("El precio es de " + this.getPrecio());
		System.out.println("Tiene la matricula " + this.getMatricula());
		System.out.println("El numero de plazas es de " + this.getNumPlazas());
	}
}
