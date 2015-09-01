package Hoja10;

import java.util.LinkedList;

public class Main {

	private LinkedList<Empleados> lista;

	public void añadirEmpleado() {
		String nombre;
		String apellidos;
		String numeroSS;
		Empleados e = null;

		lista.addLast(e);
	}

	public void añadirPosicionConcreta(int posicion) {
		lista.add(posicion, e);

	}

	public void datosNominaPorPosicion(int posicion) {
		if (posicion >= 0 && posicion < lista.size()) {
			System.out.println(lista.get(posicion).toString());
		}
	}
	
	public void datosNominaPorNombreApellido(String nombre, String apellido){
		for(Empleados e: lista){
			if(e.getNombre().equalsIgnoreCase(nombre) && e.getApellidos().equalsIgnoreCase(apellido)){
				System.out.println(e.toString());
			}
		}
		
	}
	public void eliminarPosicionConcreta(int posicion) {
		lista.remove(posicion);
	}
	
	
	public void eliminarPorNombreApellido(String nombre, String apellido){
		for(Empleados e: lista){
			if(e.getNombre().equalsIgnoreCase(nombre) && e.getApellidos().equalsIgnoreCase(apellido)){
				lista.remove(lista.indexOf(e));
			}
		}
		
	}
	
	public int empleados(){
		return lista.size();
	}
	
	
	public void todosEmpleados(){
		for(Empleados e: lista){
			System.out.println(e.toString());
		}
		
	}
	public static void main(String[] args) {

	}

}
