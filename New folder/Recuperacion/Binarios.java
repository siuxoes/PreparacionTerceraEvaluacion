package Recuperacion;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Binarios {
	public static void crearFichero(File F) throws IOException{
		Scanner in = new Scanner(System.in);
		DataOutputStream dos=null;
		try{
			dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(F)));
			int num;
			System.out.println("Introduce numeros,-1 para salir");
			num=Integer.parseInt(in.nextLine());
			while(num!=-1){
				dos.writeInt(num);
				System.out.println("Introduce numeros,-1 para salir");
				num=Integer.parseInt(in.nextLine());
			}
		}catch(IOException e){
			System.out.println("Error: "+e.getMessage());
		}finally{
			if(dos!=null)
				dos.close();
		}
	}
	public static void leerFichero(File F)
	{
		try{
			DataInputStream dis=new DataInputStream(new BufferedInputStream(new FileInputStream(F)));
			while(true)
			{
				System.out.println(dis.readInt());
			}
		}catch(EOFException e){
			
		}catch(IOException e){
			System.out.println("Error: "+ e.getMessage());
		}
	}
	public static void main(String args[]) throws IOException{
		String nombreFichero=null;
		File fichero1=null;
		Scanner in = new Scanner(System.in);
		fichero1= new File("numero");
		crearFichero(fichero1);
		leerFichero(fichero1);
	}
}
