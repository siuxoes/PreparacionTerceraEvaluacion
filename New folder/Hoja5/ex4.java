package Hoja5;
import java.util.*;
public class ex4 {

	private static Scanner teclado;

	public static void main(String args[])
	{
		double vector[] = new double[20];
		double suma=0;
		int contador=0;
		int mayores=0;
		teclado = new Scanner(System.in);
		
		System.out.println("Son "+ vector.length+" numeros");
		System.out.println();
		for(int i=0;i<vector.length;i++)
		{
			System.out.println("Introduce los numeros");
			vector[i]=Double.parseDouble(teclado.nextLine());
			suma+=vector[i];
			contador++;
		}
		for(int j=0;j<vector.length;j++)
		{
			if(vector[j]>11.34)
			{
				mayores++;
				System.out.println(vector[j]+" es mayor que 11.34");
			}
			
		}
		System.out.println("La suma es "+suma);
		System.out.println("La media es "+suma/contador);
		System.out.println("Hay "+mayores+" numeros mas grandes que 11.34");
	}
}
