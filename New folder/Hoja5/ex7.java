package Hoja5;
import java.util.*;
public class ex7 
{
	static Scanner in;

	public static void cargarVector(int []vector)
	{
		in=new Scanner(System.in);
		
		for(int i=0;i<vector.length;i++)
		{
			System.out.println("Introduce los valores");
			vector[i]=Integer.parseInt(in.nextLine());
		}
	}
	
	public static int obtenerMenor(int []vector)
	{
		int aux=vector[0];
		for(int i=0;i<vector.length;i++)
		{
			if(vector[i]<aux)
				aux=vector[i];
		}
		return aux;
	}
	public static int buscayvisualizaValor(int []vector,int valoraBuscar)
	{
		int x=0;
		for(int i=0;i<vector.length;i++)
		{
			if(valoraBuscar==vector[i])
				{System.out.println("El numero "+valoraBuscar + " se encuentra en las posiciones "+i);
			x++;
				}
			
		}
		System.out.println("El numero se repite "+x+" veces");
		return x;
	}
	
	public static void main(String args[]){
		int vector[]=new int[20];
		cargarVector(vector);
		System.out.println("EL menor numero es " +obtenerMenor(vector));
		buscayvisualizaValor(vector, 255);
		
	}
}
