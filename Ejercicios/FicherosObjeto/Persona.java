package FicherosObjeto;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Created by Siuxoes on 04/06/2015.
 */
public class Persona implements Serializable, Comparable<Persona> {

    private String nombre;
    private String telefono;
    private String direccion;

    public Persona(){}

    public Persona(String nombre, String telefono, String direccion){
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String toString(){
        return "Información sobre la persona:"+
                    "\n Nombre: "+this.getNombre()+
                    "\n Direccion: "+this.getDireccion()+
                    "\n Telefono: " +this.getTelefono();
    }

    @Override
    public int compareTo(Persona o2) {
     return this.getNombre().compareToIgnoreCase(o2.getNombre());

    }
}
