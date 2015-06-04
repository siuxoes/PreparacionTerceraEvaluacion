package Prácticaderepasoficherosylistas;

import java.util.*;

/**
 * Created by Siuxoes on 03/06/2015.
 */
public class Ejercicio1 {

    public List<Integer> menoresQueUnNumero(List<Integer> lista, int n){
        List<Integer> temp = new ArrayList<Integer>();
        for(Integer nI: lista){
            if(nI<=n){
                temp.add(nI);
            }
    }
        return temp;
    }

    public static void main(String[] args){
        Ejercicio1 e1 = new Ejercicio1();
        List<Integer> temp = new ArrayList<Integer>();
        temp.add(10);
        temp.add(1);
        temp.add(2);
        temp.add(3);
        temp.add(4);
        List<Integer> t2 = e1.menoresQueUnNumero(temp, 5);
        System.out.println(t2);
        Set<String> algo = new LinkedHashSet<String>();
        algo.add("3");
        algo.add("4");
        algo.add("3");
        System.out.println(algo);
    }
}
