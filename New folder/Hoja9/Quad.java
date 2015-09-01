package Hoja9;

public class Quad extends Moto {

	boolean esUrbano;

	public boolean getEsUrbano() {
		return esUrbano;
	}

	public void setEsUrbano(boolean esUrbano) {
		this.esUrbano = esUrbano;
	}

	public void imprimir() {

		super.imprimir();
		System.out.println("Es urbano: " + this.getEsUrbano());
	}
}
