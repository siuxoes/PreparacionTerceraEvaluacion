package Recuperacion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Escritura {

	public static void main(String args[]){
		PrintWriter fichero=null;
		try{
			fichero = new PrintWriter(new BufferedWriter(new FileWriter("fichero.txt")));
			fichero.println("Hola mundo lol");
			fichero.println("Pufufufufu");
			fichero.print(" ha ha ha");
			
		}catch(IOException ex){}
	finally{
		fichero.close();
	}
	}
}
