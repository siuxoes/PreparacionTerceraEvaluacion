package ComparadorPersona;

/**
 * Created by Siuxoes on 31/05/2015.
 */
import java.util.*;
public class PersonaMain {

    public static void main(String[] args){
        LinkedList<Persona> temp = new LinkedList<>();
        temp.add(new Persona("Sebastian", "Leonte", "123"));
        temp.add(new Persona("Siuxoes", "Leonte", "122"));

        Persona p1 = new Persona();

        System.out.println("Orden normal \n \n \n");
        p1.mostrarLista(temp);

        Collections.sort(temp);
        System.out.println("Orden nombre \n \n \n");

        p1.mostrarLista(temp);


        Collections.sort(temp, new CompararPorDni());

        System.out.println("Orden dni \n \n \n");

        p1.mostrarLista(temp);


    }
}
