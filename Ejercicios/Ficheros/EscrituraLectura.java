package Ficheros;

import java.io.*;
import java.util.*;
public class EscrituraLectura {

    private Scanner in;
    public void escribirArchivoTexto(String nombre) {
        String resp;
        in=new Scanner(System.in);
        PrintWriter ficheroSalida = null;
        try {
            ficheroSalida = new PrintWriter(new BufferedWriter(new FileWriter(nombre, true)));
            resp=in.nextLine();
            do{
               ficheroSalida.println(resp);
                resp=in.nextLine();
            }while(!resp.equalsIgnoreCase("out"));
        }catch(IOException io){
            System.out.println("Ocurrieron errores");
        }finally{
            ficheroSalida.close();
        }
    }

    public void lecturaArchivoTexto(String nombre){
        String s;
        String texto="";
        BufferedReader archivoSalida = null;
        try {
          archivoSalida =new BufferedReader(new FileReader(nombre));
            while((s=archivoSalida.readLine())!=null) {
                texto += s+"\n";
            }
        } catch(FileNotFoundException fnfe){}
        catch(java.io.IOException io){
            System.out.println("Ocurrieron errores");
        } finally{
            System.out.println(texto);
        }
    }

    public void escrirBinario(File f) throws IOException {
        DataOutputStream dataOutputStream = null;

        try{
            dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
            dataOutputStream.writeInt(2);
            dataOutputStream.writeUTF("Hola");
        }catch(IOException io){

        }finally{
            dataOutputStream.close();
        }
    }

    public void lecturaBinario(File f) throws IOException{
        DataInputStream dataInputStream = null;

        try{
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(f)));
            while(true){
                System.out.println(dataInputStream.readInt());
                System.out.println(dataInputStream.readUTF());
            }
        }catch(EOFException eofe){

        }catch(FileNotFoundException fnfe){

        }catch(IOException ioe){

        }
    }

    public static void main(String[] args){
        EscrituraLectura e1 = new EscrituraLectura();
        e1.escribirArchivoTexto("hola.txt");
        e1.lecturaArchivoTexto("hola.txt");

        File f = new File("s.bin");
        try{
        e1.escrirBinario(f);
            e1.lecturaBinario(f);
        }catch (IOException io) {

        }
    }

}
