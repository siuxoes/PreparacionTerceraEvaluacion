package Hoja5;
import java.util.*;
public class ex6 {

	static Scanner in;

	public static void main(String args[])
	{
		in = new Scanner(System.in);
		int vector[]=new int[15];
		int contadorPlus=0;
		int contadorMinus=0;
		int contadorCero=0;

		for(int i=0;i<vector.length;i++)
		{
			System.out.println("Introduce los numeros");
			vector[i]=Integer.parseInt(in.nextLine());
		}
		for(int j=0;j<vector.length;j++)
		{		
			if(vector[j]>0) contadorPlus++;
			else if(vector[j]==0) contadorCero++;
			else contadorMinus++;
		}
		System.out.println("Hay "+contadorPlus+" positivos");
		System.out.println("Hay "+contadorMinus+" negativos");
		System.out.println("Hay "+contadorCero+" ceros");
	}

}

