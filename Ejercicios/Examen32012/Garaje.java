package Examen32012;

/**
 * Created by Siuxoes on 04/06/2015.
 */
public class Garaje {

    private Vehiculo[] plazas;

    public Garaje(int mPlazas) {
        this.plazas=new Vehiculo[mPlazas];
    }

    public boolean quedaSitio(Vehiculo[] array){
        for(int i = 0;i < array.length; i++){
            if(array[i] == null){
                return true;
            }
        }
        return false;
    }

    public void añadirArray(Vehiculo[] plazas, Vehiculo v){
        if(quedaSitio(plazas)){
            for(int i=0;i<plazas.length;i++){
                if(plazas[i]==null){
                    plazas[i]=v;
                }
            }
        }else{
            System.out.println("Está lleno");
        }
    }

    public double cuota(Vehiculo v){
        if(v instanceof Coche){
            return v.getPotencia() * ((Coche) v).getNumPlazas();
        }else{
            return v.getPotencia() * 2;
        }
    }

    public static void main(String[] args){
        Garaje garaje = new Garaje(10);
        System.out.println(garaje.quedaSitio(garaje.plazas));
        garaje.añadirArray(garaje.plazas, new Coche(150, 4));
        System.out.println(garaje.cuota(garaje.plazas[0]));
    }
}
