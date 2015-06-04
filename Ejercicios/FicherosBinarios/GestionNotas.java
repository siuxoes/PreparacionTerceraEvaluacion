package FicherosBinarios;

import java.io.*;
import java.util.*;
/**
 * Created by Siuxoes on 04/06/2015.
        */
public class GestionNotas {

    private DataOutputStream dataOutputStream;
    private DataInputStream dataInputStream;
    private Scanner in;

    public void escribirNotasEnFicheroBinario(File fichero){
        int nota;
        String resp="";
        in=new Scanner(System.in);
        try{
            dataOutputStream =new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fichero)));
           do{
                System.out.println("Introduce la nota: ");
                nota=Integer.parseInt(in.nextLine());
               dataOutputStream.writeInt(nota);
               System.out.println("¿Desea seguir añadiendo? Si/No");
               resp=in.nextLine();
            } while(resp.equalsIgnoreCase("si"));
            if(dataOutputStream!=null){
                dataOutputStream.close();
            }
        }catch(FileNotFoundException fnef){

        }catch(IOException ioe){

        }finally{
            try{
                if(dataOutputStream!=null){
                    dataOutputStream.close();
                }
            }catch(IOException ioe){

            }
        }
    }

    public void lecturaNotasEnFicheroBinario(File fichero){
        int totales=0, aprobados=0, suspensos=0, sobresalientes=0, nota;
        try{
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(fichero)));
            while(true){
                nota=dataInputStream.readInt();
                totales++;
                if(nota>=5){
                    aprobados++;
                    if(nota>=9){
                        sobresalientes++;
                    }
                }else{
                    suspensos++;
                }
            }
        }catch(FileNotFoundException fnef){

        }catch(EOFException eof){

        }catch(IOException ioe){

        }finally{
            System.out.println("ESTADÍSTICA DE NOTAS DE ALUMNOS");
            System.out.println("Total de alumnos: "+totales);
            System.out.println("Total aprobados: "+aprobados);
            System.out.println("Total suspensos: "+suspensos);
            System.out.println("Total sobresalientes: "+sobresalientes);
        }
    }

    public void notaMaxima(File fichero){
        LinkedList<Integer> notas = new LinkedList<>();
        try{
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(fichero)));
            while(true){
                notas.add(dataInputStream.readInt());
            }
        }catch(FileNotFoundException fnfe){

        }catch(EOFException eofe){

        }catch(IOException ioe){

        }finally{
            Collections.sort(notas);
            System.out.println("Nota más alta: "+notas.getLast());
        }
    }

    public void notasDeCadaTipo(File fichero){
        int[] array = new int[11];
        try{
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(fichero)));
            while(true){
                int nota=dataInputStream.readInt();
                array[nota]=(array[nota]+1);
            }
        }catch(FileNotFoundException fnfe){

        }catch(EOFException eofe){

        }catch(IOException ioe){

        }finally{
            for(int i=0;i<array.length;i++){
                System.out.println("Nota "+i+": "+array[i]);
            }
        }
    }

    public static void main(String[] args){
        GestionNotas gestionNotas = new GestionNotas();
        File fichero = new File("alumnosNotas.bin");
//         gestionNotas.escribirNotasEnFicheroBinario(fichero);
        gestionNotas.lecturaNotasEnFicheroBinario(fichero);
        gestionNotas.notaMaxima(fichero);
        gestionNotas.notasDeCadaTipo(fichero);
    }
}
