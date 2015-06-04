package Examen32012;

/**
 * Created by Siuxoes on 04/06/2015.
 */
public class Coche extends Vehiculo{

    private int numPlazas;

    public Coche(int potencia, int numPlazas){
        super(potencia);
        this.numPlazas=numPlazas;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }
}
