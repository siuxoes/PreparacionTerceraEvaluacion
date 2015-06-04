package Hoja12;

import java.util.*;

/**
 * Created by Siuxoes on 31/05/2015.
 */
public class FerrocarrilSoria {

    public Set<String> ciudadesCon(Set<String> ciudades, Set<String> tienenFerrocaril){
        Set<String> temp = new HashSet<String>();
        for(String ciudad: ciudades){
            if(tienenFerrocaril.contains(ciudad)){
                temp.add(ciudad);
            }
        }
        return temp;
    }

    public static void main(String[] args){

        Set<String> ciudades = new HashSet<>();

        ciudades.add("Una");
        ciudades.add("dos");
        ciudades.add("tres");

        Set<String> conFerrocaril = new HashSet<>();

        conFerrocaril.add("Una");
        conFerrocaril.add("tres");

        FerrocarrilSoria f1 = new FerrocarrilSoria();

        Set<String> res = f1.ciudadesCon(ciudades, conFerrocaril);

        System.out.println(res);

    }
}
