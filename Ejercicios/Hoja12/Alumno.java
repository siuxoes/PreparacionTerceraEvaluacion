package Hoja12;
import java.util.*;
/**
 * Created by Siuxoes on 31/05/2015.
 */
public class Alumno {

    private int expediente;
    private String nombre;
    private String apellidos;
    private Scanner in;

    public int getExpediente() {
        return expediente;
    }

    public void setExpediente(int expediente) {
        this.expediente = expediente;
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

    public Alumno(int expediente, String nombre, String apellidos) {
        this.expediente = expediente;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Alumno() {

    }

    public void introducirAlumno(Map<Integer, Alumno> alumnos){
        in = new Scanner(System.in);
        boolean encontrado = false;
        System.out.println("Introduce el numero de matricula: ");
        int matricula = Integer.parseInt(in.nextLine());
        LinkedList<Alumno> temp = new LinkedList<Alumno>(alumnos.values());
        for(Alumno a: temp){
            if(a.getExpediente() == matricula){
                encontrado = true;
                break;
            }
        }
        if(encontrado==false){
            System.out.println("Introduce su nombre: ");
            String nombre= in.nextLine();
            System.out.println("Introduce sus apellidos: ");
            String apellido = in.nextLine();
            alumnos.put(new Integer(matricula), new Alumno(matricula, nombre, apellido));
        }else{
            System.out.println("El alumno ya existe");
        }
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "expediente=" + expediente +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }

    public void buscarAlumno( Map<Integer, Alumno> temp, int matricula){
        in = new Scanner(System.in);
        LinkedList<Integer> claves = new LinkedList<>(temp.keySet());
        if(claves.contains(matricula)){
            System.out.println(temp.get(matricula).toString());
        }else{
            System.out.println("No existe");
        }
    }

    public void eliminarAlumno( Map<Integer, Alumno> temp, int matricula){
        in = new Scanner(System.in);
        LinkedList<Integer> claves = new LinkedList<>(temp.keySet());
        if(claves.contains(matricula)){
            temp.remove(matricula);
        }else{
            System.out.println("No existe");
        }
    }
    public static void main(String[] args){
        Map<Integer, Alumno> temp = new HashMap<Integer, Alumno>();
        Alumno a1 = new Alumno();
        a1.in = new Scanner(System.in);
        String resp = "";
        do{
            a1.introducirAlumno(temp);
            System.out.println("Desea introducir otro Alumno? ");
            resp=a1.in.nextLine();
        }while(resp.equalsIgnoreCase("si"));

        a1.buscarAlumno(temp, 123);
        a1.eliminarAlumno(temp, 123);
        a1.buscarAlumno(temp, 123);

    }


}
