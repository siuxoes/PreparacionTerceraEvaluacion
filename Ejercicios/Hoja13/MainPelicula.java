package Hoja13;

import java.util.*;

public class MainPelicula {

	public static void main(String[] args) {
		List<Pelicula> lista = new LinkedList<Pelicula>();
		/**
		 * Sort por año de producion: Adios, Hola
		 */
		lista.add(new Pelicula("Hola", 2015, 120));
		lista.add(new Pelicula("Adios", 2014, 120));
		Collections.sort(lista);
		/**
		 * Sort por duracion de pelicula: Hola, Adios
		 */
		List<Pelicula> lista2 = new ArrayList<Pelicula>();
		lista2.add(new Pelicula("Hola", 2015, 127));
		lista2.add(new Pelicula("Adios", 2015, 137));
		Collections.sort(lista2, new CompararPeliculasPorDuracion());

		for (Pelicula c : lista) {
			System.out.println(c.toString());
		}
		System.out.println("------Separacion--------");

		for (Pelicula c : lista2) {
			System.out.println(c.toString());
		}
	}

}
