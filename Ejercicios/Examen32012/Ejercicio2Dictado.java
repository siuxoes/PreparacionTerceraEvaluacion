package Examen32012;

import java.util.*;
import java.io.*;

/**
 * Created by Siuxoes on 04/06/2015.
 */
public class Ejercicio2Dictado {

    public Map<Character, Integer> llenarMap(){
        Map<Character, Integer> temp = new HashMap<>();
        for(char i='A';i<='Z';i++){
            temp.put(i, 0);
        }
        return temp;
    }

    public void leerTxt(File fichero){
        Map<Character, Integer> temp = llenarMap();
        try{
            BufferedReader  bufferedReader = new BufferedReader(new FileReader(fichero));
            String s;
            while((s=bufferedReader.readLine())!=null){
                String res = s.replaceAll(" ", "");
                res = res.toUpperCase();
                for(int i=0;i<res.length();i++){
                    temp.put(res.charAt(i), (temp.get(res.charAt(i))+1));
                }
            }
        }catch(FileNotFoundException fnfe){

        }catch(IOException ioe){

        }finally{
            for (Map.Entry<Character, Integer> entry : temp.entrySet())
            {
                System.out.println(entry.getKey() + "/" + entry.getValue());
            }
        }
    }

    public static void main(String[] args){
        Ejercicio2Dictado ejercicio2Dictado = new Ejercicio2Dictado();
        File fichero = new File("Siuxoes.txt");
        ejercicio2Dictado.leerTxt(fichero);

        LinkedList<String> lista = new LinkedList<>();

        lista.add("hola");
        lista.add("adios");

        Iterator<String> it = lista.descendingIterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
