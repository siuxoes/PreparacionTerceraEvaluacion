package Repaso3aEvalaucionDocx;

import java.util.Scanner;

/**
 * Created by Siuxoes on 03/06/2015.
 */
public class ACiclos extends Alumno {
    private String especialidad;
    private Scanner in;



    public ACiclos(){
        super();
        in = new Scanner(System.in);
        System.out.println("introduzca el Especialidad: ");
        String n = in.nextLine();
        this.especialidad=n;
    }

    public static void main(String[] args){
       ACiclos a = new ACiclos();
        System.out.println(a.toString());
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String toString(){
        return super.toString() + "\n Especialidad:"+this.getEspecialidad();
    }
}
