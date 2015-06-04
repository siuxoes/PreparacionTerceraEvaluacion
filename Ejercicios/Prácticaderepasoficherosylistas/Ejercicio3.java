package Prácticaderepasoficherosylistas;

import java.io.*;
import java.util.*;

/**
 * Created by Siuxoes on 03/06/2015.
 */
public class Ejercicio3 {

    public void escribeListaEnHexadecimal(List<Integer> lista, String nombreFichero) throws IllegalArgumentException{
        File fichero = new File(nombreFichero);
        PrintWriter ficheroSalida=null;
        try{
            ficheroSalida =  new PrintWriter (new BufferedWriter (new FileWriter(fichero,true)));
            for(Integer l: lista){
                if(l>=0) {
                    ficheroSalida.format("El numero: " + l + " es en hexadecimal %xn", l);
                    ficheroSalida.println();
                }else{
                    ficheroSalida.close();
                    throw new IllegalArgumentException();
                }
            }
        }catch(IOException ioe){

        }finally{
            ficheroSalida.close();
        }
    }

    public static void main(String[] args){
        Ejercicio3 e3 = new Ejercicio3();
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(10);
        lista.add(15);
        e3.escribeListaEnHexadecimal(lista, "hola2.txt");
    }
}
