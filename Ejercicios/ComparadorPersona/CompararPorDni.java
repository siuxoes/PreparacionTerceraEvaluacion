package ComparadorPersona;

import java.util.Comparator;

/**
 * Created by Siuxoes on 31/05/2015.
 */
public class CompararPorDni implements Comparator<Persona>{

    public int compare(Persona o1, Persona o2) {
        return o1.getDni().compareToIgnoreCase(o2.getDni());
    }

}
