package FicherosObjeto;

/**
 * Created by Siuxoes on 04/06/2015.
 */
import java.io.*;
import java.util.*;

public class GestionListaTlfnos {

    private Scanner in;
    private ObjectInputStream objectInputStream;
    private  ObjectOutputStream objectOutputStream;

    public void crearListaTelefonos(File fichero){
        in = new Scanner(System.in);
        String seguir;
        try{
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(fichero));
            do{
                System.out.println("Introduzca el nombre");
                String nombre = in.nextLine();
                System.out.println("Introduzca el telefono: ");
                String telefono = in.nextLine();
                System.out.println("Introduzca la direccion: ");
                String direccion = in.nextLine();
                objectOutputStream.writeObject(new Persona(nombre, telefono, direccion));
                System.out.println("¿Desea seguir añadiendo? Si/No");
                seguir = in.nextLine();
            }while(seguir.equalsIgnoreCase("Si"));
            if(objectOutputStream!=null)
                objectOutputStream.close();
        }catch(FileNotFoundException fnfe){

        }catch(IOException io){

        }
        finally{
            System.out.println("Se escribió con éxito");
        }

    }

    public void leerFicheroObjetos(File fichero){
        try{
            objectInputStream = new ObjectInputStream(new FileInputStream(fichero));
            Persona persona = null;
            while(true){
                persona = (Persona)objectInputStream.readObject();
                System.out.println(persona.toString());
            }
        }catch(FileNotFoundException fnfn){

        }catch(EOFException eofe){
            System.out.println("Se terminó el listado");
        }catch(ClassNotFoundException cntfe){

        }catch(IOException ioe){

        }finally {
            try {
                if (objectInputStream != null)
                    objectInputStream.close();
            }catch(IOException ioe){

            }
        }
    }

    public LinkedList<Persona> crearListaDesdeFicheroObjetos(File fichero){
        LinkedList<Persona> temp = new LinkedList<>();
        Persona persona;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(fichero));
            while(true){
                persona = (Persona)objectInputStream.readObject();
                temp.add(persona);
            }
        }catch(FileNotFoundException fnfe){

        }catch(EOFException eof){
            System.out.println("Terminada la lista");
        }catch(ClassNotFoundException cnfe){

        }catch(IOException ioe){

        }finally{
            try {
                if (objectInputStream != null)
                    objectInputStream.close();
            }catch(IOException ioe){

            }
        }
        return temp;
    }

    public LinkedList<Persona> ordenadarLista(LinkedList<Persona> lista){
        Collections.sort(lista);
        return lista;
    }

    public void crearFicheroDesdeLista(File fichero, LinkedList<Persona> lista){
        try{
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(fichero));
            while(!lista.isEmpty()){
                objectOutputStream.writeObject(lista.pop());
            }
            if(objectOutputStream!=null)
                objectOutputStream.close();
        }catch(IOException ioe){

        }finally{
            System.out.println("Se escribio el fichero desde la lista");
        }
    }

    public static void main(String[] args){
        GestionListaTlfnos gestionListaTlfnos = new GestionListaTlfnos();

        File fichero = new File("jav2a.obs");

//       gestionListaTlfnos.crearListaTelefonos(fichero);
//       gestionListaTlfnos.leerFicheroObjetos(fichero);
        LinkedList<Persona> temp = gestionListaTlfnos.crearListaDesdeFicheroObjetos(fichero);
//        gestionListaTlfnos.ordenadarLista(temp);
//        System.out.println(temp.pop().toString());
//        System.out.println(temp.pop().toString());
//        System.out.println(temp.pop().toString());
        File fichero2 = new File("java3.obs");
        gestionListaTlfnos.crearFicheroDesdeLista(fichero2, temp);
        gestionListaTlfnos.leerFicheroObjetos(fichero2);



    }

}
