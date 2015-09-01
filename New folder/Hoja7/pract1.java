package Hoja7;
import java.util.*;


class Persona {

	String Dni;

	String Nombre;

	String Apellidos;

	int Edad; 

}
public class pract1

{


	public static double ObtenerEdadPersona(String dniP, Persona[] arrayP)

	{

		boolean encontrado=false;

		int edad=0;
		for(int i=0; i<arrayP.length && !encontrado; i++)

		{

			if (arrayP[i].Dni.equals(dniP))

			{

				encontrado=true;

				edad=arrayP[i].Edad;

			}

		} 

		return edad;

	}

	public static void main(String args[])

	{

		System.out.print("\n");

		/* ARRAYS DE OBJETOS */

		System.out.println("Array de objetos de la clase Persona");

		Persona[] misAmigos=new Persona[5];

		System.out.println("Introduce los datos de 5 amigos: ");

		Scanner in=new Scanner(System.in); 

		for(int i=0; i<misAmigos.length;i++) //cargamos el array con los datos de 5 personas

		{

			misAmigos[i]= new Persona(); //Creamos un objeto Persona.

			System.out.println("Dni: ");

			misAmigos[i].Dni=in.nextLine();

			System.out.println("Nombre: ");

			misAmigos[i].Nombre=in.nextLine();

			System.out.println("Apellidos: ");

			misAmigos[i].Apellidos=in.nextLine();

			System.out.println("Edad: ");

			misAmigos[i].Edad=Integer.parseInt(in.nextLine());

		} 

		System.out.println("\n\nListado de amigos\n");

		for(int i=0; i<misAmigos.length;i++) //Visualizamos los datos contenidos en el array

		{

			System.out.println("Amigo no: " + i +"\n");

			System.out.println("Dni : " + misAmigos[i].Dni);

			System.out.println("Nombre : " + misAmigos[i].Nombre);

			System.out.println("Apellidos : " + misAmigos[i].Apellidos);

			System.out.println("Edad : " + misAmigos[i].Edad);

		}

		System.out.println("\n\nLa edad del amigo con dni '222' es: "+ 

ObtenerEdadPersona("stf",misAmigos));

	} 

}