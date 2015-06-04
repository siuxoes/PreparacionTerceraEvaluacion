package ComparadorPersona;

/**
 * Created by Siuxoes on 31/05/2015.
 */

import java.util.*;

public class Persona implements Comparable<Persona>{

    private String nombre;
    private String apellidos;
    private String dni;

    public Persona(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public Persona() {

    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }



    public void mostrarLista(LinkedList<Persona> temp){
        for(Persona p: temp){
            System.out.println(p.toString());
        }
    }


    public int compareTo(Persona o) {
        if(this.getApellidos().compareToIgnoreCase(o.getApellidos())==0){
            return this.getNombre().compareToIgnoreCase(o.getNombre());
        }else{
            return this.getApellidos().compareToIgnoreCase(o.getApellidos());
        }
    }
}
