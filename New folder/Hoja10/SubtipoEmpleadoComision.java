package Hoja10;

public class SubtipoEmpleadoComision extends EmpleadosPorComision {
	private double salarioBase;

	public SubtipoEmpleadoComision(String nombre,String apellidos,String numeroSegSoc,double cantidadVentasTotales,double tasa,double cantidadSalarioBase){
		super(nombre,apellidos,numeroSegSoc,cantidadVentasTotales,tasa);
		this.salarioBase=cantidadSalarioBase;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double ingresos(){
		return this.salarioBase+super.ingresos();
	}
	public String toString(){
		return super.toString()+"Salario total base mas comision "+this.salarioBase+super.ingresos();
	}
}
