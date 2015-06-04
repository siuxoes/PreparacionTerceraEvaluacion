package FicherosBinarios;

/**
 * Created by Siuxoes on 04/06/2015.
 */
import FicherosObjeto.Persona;

import java.io.*;
import java.util.*;

public class CrearListaTfnos {

    private DataOutputStream dataOutputStream;
    private DataInputStream dataInputStream;
    private Scanner in;

    public void crearFichero(File fichero){
        in = new Scanner(System.in);
        String resp;
        try{
            dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fichero)));
            do{
                System.out.println("Introduzca el nombre");
                String nombre = in.nextLine();
                System.out.println("Introduzca el telefono: ");
                String telefono = in.nextLine();
                System.out.println("Introduzca la direccion: ");
                String direccion = in.nextLine();
                dataOutputStream.writeUTF(nombre);
                dataOutputStream.writeUTF(telefono);
                dataOutputStream.writeUTF(direccion);
                System.out.println("¿Desea seguir añadiendo? Si/No");
                resp=in.nextLine();
            }while(resp.equalsIgnoreCase("Si"));
        }catch(FileNotFoundException fnfe){

        }catch(IOException ioe){

        }finally{
            try {
                if (dataOutputStream != null)
                    dataOutputStream.close();
            }catch(IOException ioe){}
        }
    }

    public void leerFicheroBinario(File fichero){
        try{
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(fichero)));
            System.out.println("LISTADO DE TELÉFONOS");
            while(true){
                String nombre=dataInputStream.readUTF();
                String telefono =dataInputStream.readUTF();
                String direccion=dataInputStream.readUTF();
                System.out.println(nombre+"        "+telefono);
            }
        }catch(FileNotFoundException fnfe){

        }catch(EOFException eofe){

        }catch(IOException ioe){

        }finally{
            try {
                if (dataInputStream != null)
                    dataInputStream.close();
            }catch(IOException ioe){}
            }
    }

    public void buscarNombre(String nombre, File fichero){
        String ns="";
        String telefono="";
        try{
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(fichero)));
            while(true && !ns.equalsIgnoreCase(nombre)){
                ns=dataInputStream.readUTF();
                telefono=dataInputStream.readUTF();
                dataInputStream.readUTF();
            }
        }catch(FileNotFoundException fnfe){

        }catch(EOFException eofe){

        }catch(IOException ioe){

        }finally{
            if(ns.equalsIgnoreCase(nombre))
                System.out.println(telefono);
        }
    }

    public static void main(String[] args){
        CrearListaTfnos crearListaTfnos = new CrearListaTfnos();
        File fichero = new File("siuxoes.bin");
//        crearListaTfnos.crearFichero(fichero);
        crearListaTfnos.leerFicheroBinario(fichero);
        crearListaTfnos.buscarNombre("Sebastian", fichero);
    }
}
