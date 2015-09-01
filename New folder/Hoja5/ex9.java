package Hoja5;
import java.util.*;
public class ex9 {

	static int cont1=0,cont2=0,cont3=0,cont4=0,cont5=0,cont6=0;
	static Scanner in;
	private static int iguales;
	public static void cargarVector(double []vector)
	{
		in=new Scanner(System.in);
		for(int i=0;i<vector.length;i++)
		{
			System.out.println("Introduce la nota");
			vector[i]=Double.parseDouble(in.nextLine());
		}
	}
	public static int totalAprobados(double[] vector)
	{
		int aprobados=0;
		for(int i=0;i<vector.length;i++)
		{
			if(vector[i]>=5)
				aprobados++;
		}
		return aprobados;
	}
	public static String NotaEnLetras(double nota)
	{

		String notaenletras="";
		if(nota>=0&&nota<=2.99)
		{notaenletras="MUY DEFICIENTE";
		cont1++;}
		else if(nota<=4.99)
		{notaenletras="INSUFICIENTE";
		cont2++;}
		else if(nota<=5.99)
		{notaenletras="SUFICIENTE";
		cont3++;}
		else if(nota<=6.99)
		{notaenletras="BIEN";
		cont4++;}
		else if(nota<=8.99)
		{notaenletras="NOTABLE";
		cont5++;}
		else if(nota==9&&nota<=10)
		{notaenletras="SOBRESALIENTE";
		cont6++;}
		return notaenletras;
	}
	public static int notasIguales(double[] vector, String nLetras)
	{
		int contador=0;
		for(int i=0;i<vector.length;i++)
		{
			if(nLetras==(NotaEnLetras(vector[i])))
				contador++;

		}
		return contador;
	}
	public static void main(String args[])
	{
		in = new Scanner(System.in);
		double vec[]=new double[5];
		cargarVector(vec);		
		System.out.println("EL numero total de aprobados es "+totalAprobados(vec));

		iguales = 0;
		for(int i=0;i<vec.length;i++)
		{

			System.out.println("Las notas siguentes "+vec[i]+" son "+NotaEnLetras(vec[i]));

		}
		if(cont1<=1){
		}
		else{
			System.out.println("Hay "+cont1 +" notas de MUY DEFICIENTE");
		}
		if(cont2<=1){
		}
		else{
			System.out.println("Hay "+cont2 +" notas de INSUFICIENTE");
		}
		if(cont3<=1){
		}
		else{
			System.out.println("Hay "+cont3 +" notas de SUFICIENTE");
		}
		if(cont4<=1){
		}
		else{
			System.out.println("Hay "+cont4 +" notas de BIEN");
		}
		if(cont5<=1){
		}
		else{
			System.out.println("Hay "+cont5 +" notas de NOTABLE");
		}
		if(cont6<=1){
		}
		else{
			System.out.println("Hay "+cont6 +" notas de SOBRESALIENTE");
		}
	}
}
