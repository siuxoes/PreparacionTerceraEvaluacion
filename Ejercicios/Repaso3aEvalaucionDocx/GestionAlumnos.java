package Repaso3aEvalaucionDocx;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Siuxoes on 03/06/2015.
 */
public class GestionAlumnos {
    private List<Alumno> listaDeAlumnos;

    public double devolverMedia(int curso, String especialidad){
        double media=0;
        int totales =0;

        for(int i=0;i<listaDeAlumnos.size();i++){
            if(((ACiclos) listaDeAlumnos.get(i)).getEspecialidad().equalsIgnoreCase(especialidad)) {
                media+=listaDeAlumnos.get(i).getNota();
                totales++;
            }
        }
        return media / totales;
    }

    public void mostrarNombre(String nombre){
        for(Alumno n: listaDeAlumnos){
            if(n.getNombre().equalsIgnoreCase(nombre)){
                System.out.println(n.toString());
                break;
            }
        }
    }

    public void alumnosQuePasan(){
        for(Alumno a: listaDeAlumnos){
            if(a.PasaDeCurso(a.getNota())){
                System.out.println(a.toString());
            }
        }
    }

    public static void main(String[] args){
        GestionAlumnos ga = new GestionAlumnos();
        ga.listaDeAlumnos = new ArrayList<Alumno>();
        ga.listaDeAlumnos.add(new ACiclos());
        ga.listaDeAlumnos.add(new aBachillerato());
/*
        System.out.println(ga.devolverMedia(1, "dos"));
*/

        ga.mostrarNombre("Sebastian");
        ga.alumnosQuePasan();
    }


}
