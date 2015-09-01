package Hoja5;
import java.util.*;
public class ex8 {

	static Scanner in;
	public static void cargarVector(int []vector)
	{
		in=new Scanner(System.in);
		for(int i=0;i<vector.length;i++)
		{
			System.out.println("Introduce la edad");
			vector[i]=Integer.parseInt(in.nextLine());
		}
	}
	public static boolean esMayorDeEdad(int edad)
	{
		boolean mayor=false;
		if(edad>=18)
			mayor=true;
		return mayor;
	}
	public static double mediaDeEdades(int []vector)
	{
		double media=0;
		double suma=0;
		int x=0;
		for(int i=0;i<vector.length;i++)
		{
			suma+=vector[i];
			x++;
		}
		media=suma/x;
		return media;
	}
	public static void main(String args[])
	{
		int mayores=0;
		int vectorash[] = new int [30];
		cargarVector(vectorash);
		for(int i=0;i<vectorash.length;i++)
		{
			if(esMayorDeEdad(vectorash[i]))
				mayores++;
				
			
		}
		System.out.println("La media es "+mediaDeEdades(vectorash));
		System.out.println("Hay "+mayores +" mayores");
	}
}
