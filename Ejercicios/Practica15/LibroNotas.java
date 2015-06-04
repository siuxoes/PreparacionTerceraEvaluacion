package Practica15;

import java.util.*;

public class LibroNotas

{

	private ArrayList<String> notas;

	public void almacenarNota(String nota)

	{

		notas.add(nota);

	}
	
	public void borrarNota(String nota) {
		int n;
		if(notas.contains(nota)){
			n=notas.indexOf(nota);
			notas.remove(n);
		}else{
			System.out.println("Nota no encontrada");
		}
	}

	public int numeroDenotas() {
		return notas.size();
	}

	// Muestra en pantalla la nota correspondiente a numeroNota.Comprueba que el
	// número de

	// nota esté comprendido entre 0..notas.size(), en caso contrario muestra un
	// mensaje de nota

	// no válida.

	public void mostrarNota(int numeroNota) {
		if(numeroNota < 0 || numeroNota > numeroDenotas()){
			System.out.println("Numero de nota invalido");
		}else{
			System.out.println(notas.get(numeroNota));
		}
	}

	public void borrarNotas(){
		while(notas.size()>0){
			notas.remove(0);
		}
	}
	
	public void borrarNotasIterador(){
		Iterator<String> it = notas.iterator();
		
		while(it.hasNext()){
			it.next();
			it.remove();
		}
	}
	public void listarNotas()

	{

		// bucle for-each : para cada valor de la colección hacer

		// se suele utilizar cuando queremos recorrer la colección completa

		for (String nota : notas) {

			System.out.println(nota);

		}

	}
	
	public void añadirALista(int indice, String msg){
		notas.add(indice, msg);
	}
	
	public void listarNotasConIterador()

	{

		// crea un objeto iterador

		Iterator<String> it = notas.iterator();

		// mientras haya elementos en la lista

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

	public void borrarDesdeHasta(int desde, int hasta){
		if(desde > hasta){
			System.out.println("Desde es mayor que hasta");
		}else if(hasta == desde){
			notas.remove(hasta);
		}else{
			for(int i=desde; i<=hasta;i++){
				notas.remove(i);
			}
		}
	}
	
	public static void main(String[] args)

	{

		LibroNotas l = new LibroNotas();

		l.notas = new ArrayList<String>();

		l.almacenarNota("9:05 Desayuno de Trabajo");

		l.almacenarNota("9:45 Reunión Departamento");

		l.almacenarNota("10:30 Revisión de Proyectos");

		l.almacenarNota("14:30 Valoración y entrega de Proyectos");

		l.almacenarNota("15:00 Comida con Ana");
		l.listarNotas();
		
		System.out.println("\n \n \n");

		l.añadirALista(3, "holi");
		l.borrarDesdeHasta(0, 2);
		l.listarNotas();
		
	}

}