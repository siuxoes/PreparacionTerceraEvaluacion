package Repaso3aEvalaucionDocx;
import java.util.Scanner;
/**
 * Created by Siuxoes on 03/06/2015.
 */
public class Alumno {

    private String nombre;
    int curso;
    double nota;

    private Scanner in;

    public Alumno(){
        in = new Scanner(System.in);
        System.out.println("introduzca el nombre: ");
        String n = in.nextLine();
        System.out.println("introduzca el curso: ");
        int c = Integer.parseInt(in.nextLine());
        System.out.println("introduzca la nota: ");
        double no = Double.parseDouble(in.nextLine());
        this.nombre=n;
        this.curso=c;
        this.nota=no;
    }

    public Alumno(String nombre, int curso, double nota){
        this.nombre=nombre;
        this.curso=curso;
        this.nota=nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String toString(){
        return "Datos del alumno: \n"+"\n Nombre: "+this.getNombre()+"\nCurso:"+this.getCurso()
                    +"\n Nota media:"+this.getNota();
    }

    public boolean PasaDeCurso(double media){
        if (media >= 5) return true;
        else return false;
    }

    
}
