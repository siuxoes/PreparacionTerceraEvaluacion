package Hoja5;
import java.util.*;
public class ex5 {

	static Scanner in;
	public static void main(String args[])
	{

		in= new Scanner(System.in);
		char vector[] = new char[20];
		for(int i=0;i<vector.length;i++)
		{
			System.out.println("Introduce el caracter");
			vector[i]=in.nextLine().charAt(0);

		}
		int contadorA = 0;
		int contadorTotal = 0;
		int contadorE = 0;
		int contadorI = 0;
		int contadorO = 0;
		int contadorU = 0;
		for(int j=0;j<vector.length;j++)
		{
			switch(vector[j])
			{
			case 'a':{contadorA++;contadorTotal++;break;}
			case 'e':{contadorE++;contadorTotal++;break;}
			case 'i':{contadorI++;contadorTotal++;break;}
			case 'o':{contadorO++;contadorTotal++;break;}
			case 'u':{contadorU++;contadorTotal++;break;}
			}
		}
		System.out.println("El n�mero total de vocales es "+contadorTotal+" el n�mero total de 'a' es "+contadorA+" el n�mero total de 'e' es "+contadorE+" el n�mero total de 'i' es "+contadorI+" el n�mero total de 'o' es "+contadorO+" el n�mero total de 'u' es "+contadorU);
	}
}
