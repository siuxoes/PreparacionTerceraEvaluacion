package Hoja9;

import java.util.*;

public class Main {
	static Scanner in = new Scanner(System.in);

	static String pedirPorTeclado() {
		return in.nextLine();
	}

	public Vehiculo[] introducirVehiculo() {
		String tipo;
		System.out.println("Introduce la cantidad de vehiculos que desea crear: ");
		Vehiculo[] array = new Vehiculo[Integer.parseInt(in.nextLine())];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce el tipo de vehiculo:");
			tipo = in.nextLine();
			if (tipo.equals("Turismo")) {
				array[i] = crearTurismo();
			} else if (tipo.equals("Moto")) {
				array[i] = crearMoto();
			} else if (tipo.equals("Quad")) {
				array[i] = crearQuad();
			}
		}
		return array;
	}

	public void borrarVehiculo(Vehiculo[] arrayVehiculos) {
		System.out.println("Introduce la matricula que desees borrar");
		String mat = pedirPorTeclado();
		for (int i = 0; i < arrayVehiculos.length; i++) {
			if (arrayVehiculos[i].getMatricula().equalsIgnoreCase(mat))
				arrayVehiculos[i] = null;
		}
	}

	public void listarVehiculo(int min, int max, Vehiculo[] arrayVehiculos) {
		if (contar(arrayVehiculos)>0) {
			for (int i = 0; i < arrayVehiculos.length; i++) {
				if (arrayVehiculos[i].getPrecio() <= max
						&& arrayVehiculos[i].getPrecio() >= min)
					arrayVehiculos[i].imprimir();
			}
		} else {
			System.out.println("No hay vehiculos");
		}
	}

	public void listarPorPTA(int min, int max, Vehiculo[] arrayVehiculos,
			String tipoVehiculo, int antiguedadmax) {
		if (contar(arrayVehiculos)>0) {
			for (int i = 0; i < arrayVehiculos.length; i++) {
				if (tipoVehiculo.equalsIgnoreCase("Moto")) {
					if (arrayVehiculos[i].getPrecio() <= max
							&& arrayVehiculos[i].getPrecio() >= min
							&& arrayVehiculos[i].getAntiguedad() <= antiguedadmax
							&& arrayVehiculos[i] instanceof Moto) {
						arrayVehiculos[i].imprimir();
					}
				}
				if (tipoVehiculo.equalsIgnoreCase("Turismo")) {
					if (arrayVehiculos[i].getPrecio() <= max
							&& arrayVehiculos[i].getPrecio() >= min
							&& arrayVehiculos[i].getAntiguedad() <= antiguedadmax
							&& arrayVehiculos[i] instanceof Turismo) {
						arrayVehiculos[i].imprimir();
					}
				}
				if (tipoVehiculo.equalsIgnoreCase("Quad")) {
					if (arrayVehiculos[i].getPrecio() <= max
							&& arrayVehiculos[i].getPrecio() >= min
							&& arrayVehiculos[i].getAntiguedad() <= antiguedadmax
							&& arrayVehiculos[i] instanceof Quad) {
						arrayVehiculos[i].imprimir();
					}
				}
			}
		}else{
			System.out.println("No hay vehiculos");
		}
	}
	public int contar(Vehiculo[] array){
		int contador=0;
		for(int i=0;i<array.length;i++){
			if(array[i]!=null)
				contador++;
			
		}
		return contador;
	}

	static Turismo crearTurismo() {
		Turismo t = new Turismo();
		System.out.println("Introduce la matricula");
		t.setMatricula(in.nextLine());
		System.out.println("Introduce el anio");
		t.setAnno(Integer.parseInt(in.nextLine()));
		System.out.println("Introduce la marca de tu coche");
		t.setMarca(in.nextLine());
		System.out.println("Introduce el modelo");
		t.setModelo(in.nextLine());
		System.out.println("Introduce el precio");
		t.setPrecio(Integer.parseInt(in.nextLine()));
		System.out.println("Introduce el numero de plazas");
		t.setNumPlazas(Integer.parseInt(in.nextLine()));
		return t;
	}

	static Moto crearMoto() {
		Moto m = new Moto();
		System.out.println("Introduce la matricula");
		m.setMatricula(in.nextLine());
		System.out.println("Introduce el anio");
		m.setAnno(Integer.parseInt(in.nextLine()));
		System.out.println("Introduce la marca de tu moto");
		m.setMarca(in.nextLine());
		System.out.println("Introduce el modelo");
		m.setModelo(in.nextLine());
		System.out.println("Introduce el precio");
		m.setPrecio(Integer.parseInt(in.nextLine()));
		System.out.println("Introduce la cilindrada");
		m.setCilindrada(Integer.parseInt(in.nextLine()));
		return m;
	}

	static Quad crearQuad() {
		Quad q = new Quad();
		System.out.println("Introduce la matricula");
		q.setMatricula(in.nextLine());
		System.out.println("Introduce el anio");
		q.setAnno(Integer.parseInt(in.nextLine()));
		System.out.println("Introduce la marca de tu quad");
		q.setMarca(in.nextLine());
		System.out.println("Introduce el modelo");
		q.setModelo(in.nextLine());
		System.out.println("Introduce el precio");
		q.setPrecio(Integer.parseInt(in.nextLine()));
		System.out.println("Introduce la cilindrada");
		q.setCilindrada(Integer.parseInt(in.nextLine()));
		System.out.println("Es urbano?");
		q.setEsUrbano(Boolean.parseBoolean(pedirPorTeclado()));
		return q;
	}

	public static void main(String args[]) {
		Main m = new Main();
		Vehiculo[] arrayVehiculos = new Vehiculo[0];

		int opcion;
		do {
			System.out.println("Elige la opcion: ");
			System.out.println("1. Introducir vehiculo");
			System.out.println("2. Borrar vehiculo");
			System.out.println("3. Listar vehiculo por precio");
			System.out.println("4. Listar vehiculor por precio, tipo y antiguedad");
			opcion = Integer.parseInt(in.nextLine());
			switch (opcion) {
			case 1:
				arrayVehiculos = m.introducirVehiculo();
				break;
			case 2:
				m.borrarVehiculo(arrayVehiculos);
				break;
			case 3:
				System.out.println("introduce el precio minimo");
				int min = Integer.parseInt(in.nextLine());
				System.out.println("introduce el precio maximo");
				int max = Integer.parseInt(in.nextLine());
				m.listarVehiculo(min, max, arrayVehiculos);
				break;
			case 4:
				System.out.println("introduce el precio minimo");
				min = Integer.parseInt(in.nextLine());
				System.out.println("introduce el precio maximo");
				max = Integer.parseInt(in.nextLine());
				System.out.println("introduce el tipo de vehiculo");
				String tipo = in.nextLine();
				System.out.println("introduce la antiguedad");
				int antiguedad = Integer.parseInt(in.nextLine());
				m.listarPorPTA(min, max, arrayVehiculos, tipo, antiguedad);
				break;
			case 0:
				System.exit(0);
				break;

			}
		} while (opcion != 0);

	}
}
