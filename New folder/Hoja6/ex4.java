package Hoja6;
import java.util.*;
public class ex4 {
	static Scanner in;
	public static boolean esValido(String tel){
		boolean valido=false;
		int contador=0;
		for(int i=0;i<tel.length();i++)
		{		
			if(tel.charAt(i)!='0'&&
					tel.charAt(i)!='1'&&
					tel.charAt(i)!='2'&&
					tel.charAt(i)!='3'&&
					tel.charAt(i)!='4'&&
					tel.charAt(i)!='5'&&
					tel.charAt(i)!='6'&&
					tel.charAt(i)!='7'&&
					tel.charAt(i)!='8'&&
					tel.charAt(i)!='9'&&
					tel.charAt(i)!=' ')
				valido=false;
			else 
				{
				if(tel.charAt(i)!=' ')
					contador++;
				
					if(contador > 9)
						valido = false;
					if(contador==9)
						valido=true;
				}
		}
		return valido;

	}
	public static void main(String args[])
	{
		in = new Scanner(System.in);
		String valor;
		System.out.println("Introduce el telefono");
		valor=in.nextLine();
		if(esValido(valor))
			System.out.println("Es valido;");
			else
				System.out.print("No es valido;");
	}

}
