package Prácticaderepasoficherosylistas;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedList;
/**
 * Created by Siuxoes on 03/06/2015.
 */
public class Ejercicio4 {

    public  void ganadorConcurso (String[] favoritos, String[] segundos){

        Map<String, Integer> concurso = new HashMap<String, Integer>();

        for(String n: favoritos){
            if(!concurso.containsKey(n)){
                concurso.put(n, 3);
            }else{
                concurso.put(n, (concurso.get(n)+3));
            }
        }
        for(String n: segundos){
            if(!concurso.containsKey(n)){
                concurso.put(n, 2);
            }else{
                concurso.put(n, (concurso.get(n)+2));
            }
        }
        LinkedList<Integer> s1 = new LinkedList<>(concurso.values());
        int ganador = s1.pop();

        for(Map.Entry<String, Integer> c: concurso.entrySet()){
            if(c.getValue()==ganador){
                System.out.println(c.getKey());
            }
        }
    }

    public static void main(String[] args){
       Ejercicio4 e4 = new Ejercicio4();
        String[] l1 = {"Hola","siuxoes"};
        String[] l2 = {"Hola", "siuxoes", "siuxoes"};
        e4.ganadorConcurso(l1, l2);
    }
}
