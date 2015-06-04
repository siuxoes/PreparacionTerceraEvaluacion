package Prácticaderepasoficherosylistas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Siuxoes on 03/06/2015.
 */
public class Ejercicio2 {
    public boolean sonIguales(List<String> lista1, List<String> lista2){
        if(lista1.size()==lista2.size()){
            for(int i=0;i< lista1.size();i++){
                if(!lista1.get(i).equalsIgnoreCase(lista2.get(i))){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Ejercicio2 e2 = new Ejercicio2();
        List<String> lista1 = new ArrayList<String>();
        lista1.add("hola");
        lista1.add("ADIOS");
        List<String> lista2 = new ArrayList<String>();
        lista2.add("holsa");
        lista2.add("ADIOS");
        System.out.println(e2.sonIguales(lista1, lista2));
    }
}
