package Hoja5;

public class ex3 {

	public static void main(String args[])
	{
		int vector[]={52,0,21,22,0,520,543,0,213,543,66,32,6,111,0};
		System.out.println("Son "+ vector.length+" numeros");
		System.out.println();
		for(int i=0;i<vector.length;i++)
		{
			if(vector[i]==0)
				System.out.println("En la posicion "+i+" existe un cero");
			else
				System.out.println("No hay ceros");
		}
		
	}
}
