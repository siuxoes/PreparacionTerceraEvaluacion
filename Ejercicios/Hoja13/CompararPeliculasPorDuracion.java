package Hoja13;

import java.util.Comparator;

/**
 * Created by Siuxoes on 30/05/2015.
 */
public class CompararPeliculasPorDuracion implements Comparator<Pelicula> {

    public int compare(Pelicula p1, Pelicula p2){
        if(p1.getMinutos()!=p2.getMinutos()){
        return p1.getMinutos() - p2.getMinutos();}
        else{
            return p1.getTitulo().toLowerCase().compareTo(p2.getTitulo().toLowerCase());
        }
    }

}
