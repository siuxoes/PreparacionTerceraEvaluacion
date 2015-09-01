package Hoja5;

public class ex10 {

	public static void cargarArray(int[][] matriz){
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++)
			{
				matriz[i][j]=(int)(Math.random()*1000);
			}
		}
	}
	public static void visualizar(int[][] matriz){
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++)
			{
				System.out.println(matriz[i][j]);
			}
			System.out.println();
		}
	}
	public static void visualizarColumna(int [][] matriz){
		for(int i=0;i<10;i++){
			System.out.println(matriz[i][0]);
		}
	}
	public static void visualizarDiagonal(int [][] matriz){
		for(int i=0;i<10;i++){
			System.out.println(matriz[i][i]);
		}
	}
	public static int visualizarSuma(int [][] matriz, int nFila){
		int suma=0;
		for(int i=0;i<10;i++){
			suma+=matriz[nFila][i];
		}
		return suma;
	}
	public static int visualizar555(int [][] matriz){
		int contador=0;
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++)
			{
				if(matriz[i][j]>555)
					contador++;
			}
		}
		return contador;
	}
	public static void visualizarFilaMayor(int [][] matriz){
		int aux=0;
		int sumaFila=visualizarSuma(matriz,0);
		for(int i=0;i<10;i++){
			if(sumaFila<visualizarSuma(matriz,i))
			{sumaFila=visualizarSuma(matriz,i);
			aux=i;}
		}
		System.out.println(aux);
	}
}
