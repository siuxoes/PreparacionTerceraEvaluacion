package Hoja13;

/**
 * Created by Siuxoes on 30/05/2015.
 */
public class Pelicula implements Comparable<Pelicula> {

    private String titulo;
    private int añoProduccion;
    private int minutos;

    public Pelicula(String titulo, int añoProduccion, int minutos) {
        this.titulo = titulo;
        this.añoProduccion = añoProduccion;
        this.minutos = minutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñoProduccion() {
        return añoProduccion;
    }

    public void setAñoProduccion(int añoProduccion) {
        this.añoProduccion = añoProduccion;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public String toString() {
        return "Hoja13.Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", añoProduccion=" + añoProduccion +
                ", minutos=" + minutos +
                '}';
    }

    public int compareTo(Pelicula o) {
        if(this.getAñoProduccion() != o.getAñoProduccion()){
            return this.getAñoProduccion() - o.getAñoProduccion();
        }else{
            return this.getTitulo().toLowerCase().compareTo(o.getTitulo().toLowerCase());
        }
    }
}
