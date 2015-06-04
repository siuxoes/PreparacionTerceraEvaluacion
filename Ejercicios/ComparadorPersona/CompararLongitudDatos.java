package ComparadorPersona;

import java.util.Comparator;

/**
 * Created by Siuxoes on 31/05/2015.
 */
public class CompararLongitudDatos implements Comparator<Persona> {

    public int compare(Persona p1, Persona p2){
        return p1.toString().length()-p2.toString().length();
    }


}
