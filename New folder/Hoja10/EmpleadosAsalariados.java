package Hoja10;

public class EmpleadosAsalariados extends Empleados {

	private double salarioSemanal;

	public EmpleadosAsalariados(String nombre, String apellidos,
			String numeroSegSoc, double salario) {
		super(nombre, apellidos, numeroSegSoc);
		this.setSalarioSemanal(salario);
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salario) {
		this.salarioSemanal = salario;
	}

	@Override
	public double ingresos() {

		return salarioSemanal;
	}

	public String toString() {
		return super.toString() + "Salario Semanal: "
				+ this.getSalarioSemanal();
	}
}
