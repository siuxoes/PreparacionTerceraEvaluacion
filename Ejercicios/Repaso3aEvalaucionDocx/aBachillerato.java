package Repaso3aEvalaucionDocx;

import java.util.Scanner;

/**
 * Created by Siuxoes on 03/06/2015.
 */
public class aBachillerato extends Alumno {

    private String tipoBachillerato;
    private Scanner in;

    public aBachillerato(){
        super();
        in=new Scanner(System.in);
        String tipo = in.nextLine();
        this.tipoBachillerato=tipo;
    }

    public String getTipoBachillerato() {
        return tipoBachillerato;
    }

    public void setTipoBachillerato(String tipoBachillerato) {
        this.tipoBachillerato = tipoBachillerato;
    }

    public String toString(){
        return super.toString() + "\n Tipo de Bachillerato:"+this.getTipoBachillerato();
    }
}
