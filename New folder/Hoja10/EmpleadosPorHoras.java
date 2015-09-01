package Hoja10;

public class EmpleadosPorHoras extends Empleados {

	private double sueldo;
	private double horas;
	private double salarioTotalHoras;

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		if(horas>168)
		this.horas = 168;
		else if(horas<0)
			this.horas=0;
		else this.horas=horas;
	}

	public EmpleadosPorHoras(String nombre, String apellidos,
			String numeroSegSoc, double sueldoporHora, double horasTrabajadas) {
		super(nombre, apellidos, numeroSegSoc);
		this.sueldo = sueldoporHora;
		this.horas = horasTrabajadas;
	}
	public double ingresos(){
		double salarioTotalHoras;
		if(this.horas<40)
			salarioTotalHoras=this.sueldo*this.horas;
		else salarioTotalHoras=this.sueldo*1.5*this.horas;
		return salarioTotalHoras;
		
	}
	public String toString(){
		return super.toString()+"Salario total por horas "+this.salarioTotalHoras;
		
	}

}
