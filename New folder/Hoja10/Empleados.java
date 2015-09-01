package Hoja10;

public abstract class Empleados {

	private String nombre;
	private String apellidos;
	private String numeroSS;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNumeroSS() {
		return numeroSS;
	}

	public void setNumeroSS(String numeroSS) {
		this.numeroSS = numeroSS;
	}

	public Empleados(String nombre, String apellidos, String nss) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.numeroSS = nss;
	}

	public String toString() {
		return "Nombre: " + this.getNombre() + "\n" + "Apellido: "
				+ this.getApellidos() + "\n" + "Numero Seguridad Social: "
				+ this.getNumeroSS();

	}
	public abstract double ingresos();

}
