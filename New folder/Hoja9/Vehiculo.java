package Hoja9;

import java.util.Scanner;

abstract class Vehiculo {

	String marca;
	String modelo;
	int anno;
	int precio;
	String matricula;

	static Scanner in = new Scanner(System.in);

	public int getAnno() {
		return this.anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public int getAntiguedad() {
		return 2015 - this.getAnno();
	}

	public String toString() {
		return "La marca es " + this.getMarca() + "\n" + "El modelo es "
				+ this.getModelo() + "\n" + "El año es " + this.getAnno()
				+ "\n" + "El precio es de " + this.getPrecio() + "\n"
				+ "Tiene la matricula " + this.getMatricula();

	}

	abstract void imprimir();

}
