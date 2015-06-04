package Practica15;

import java.util.*;

public class SalaDeEspera

{

	private LinkedList<String> colaMedica;

	public void apuntarseACola(String dni)

	{
		this.colaMedica.addLast(dni);
	}

	public void llamarAConsulta()
	{
		this.colaMedica.pop();
	}

	public int nroPacientesEnCola()

	{
		return this.colaMedica.size();
	}

	public void siguienteEnLLamar()

	{
		if(nroPacientesEnCola()==0){
			System.out.println("Cola vacia");
		}else{
			System.out.println(this.colaMedica.getFirst());
		}
	}

	public void pacientesEnCola()
	{
		if(nroPacientesEnCola()==0){
			System.out.println("Cola vacia");
		}else if(nroPacientesEnCola()==1){
			System.out.println(this.colaMedica.getFirst());
		}else{
			for(String paciente: this.colaMedica){
				System.out.println(paciente);
			}
		}

	}

	public static void main(String[] args)

	{

		SalaDeEspera s = new SalaDeEspera();

		s.colaMedica = new LinkedList<String>();

		s.colaMedica.add("hola");
		s.siguienteEnLLamar();
		s.siguienteEnLLamar();
		// menú de opciones.

	}

}