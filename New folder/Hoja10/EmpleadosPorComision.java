package Hoja10;

public class EmpleadosPorComision extends Empleados {

	private double ventasTotales;
	private double tasaComision;

	public double getVentasTotales() {
		return ventasTotales;
	}

	public void setVentasTotales(double ventasTotales) {
		this.ventasTotales = ventasTotales;
	}

	public double getTasaComision() {
		return tasaComision;
	}

	public void setTasaComision(double tasaComision) {
		if (this.tasaComision >= 0 && this.tasaComision <= 1)
			this.tasaComision = tasaComision;
		else
			System.out.println("Tasa de comision mal introducida");

	}

	public EmpleadosPorComision(String nombre, String apellidos,
			String numeroSegSoc, double ventasTotalesSemana, double porcentaje) {
		super(nombre, apellidos, numeroSegSoc);
		this.ventasTotales = ventasTotalesSemana;
		this.tasaComision = porcentaje;
	}

	public double ingresos() {
		return this.ventasTotales * this.tasaComision;
	}

	public String toString() {
		return super.toString() + "Salario total por comision "
				+ this.ventasTotales * this.tasaComision;
	}
}
