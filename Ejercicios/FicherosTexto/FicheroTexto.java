package FicherosTexto;

import java.io.*;
import java.util.*;

/**
 * Created by Siuxoes on 04/06/2015.
 */
public class FicheroTexto {

    private PrintWriter printWriter;
    private BufferedReader bufferedReader;
    private Scanner in;

    public void escribirArchivoTexto(File fichero){
        String resp;
        in=new Scanner(System.in);
        try{
            printWriter = new PrintWriter(new BufferedWriter(new FileWriter(fichero)));
            do{
                System.out.println("Añade nueva linea: ");
                printWriter.println(in.nextLine());
                System.out.println("¿Desea seguir si/no?");
                resp=in.nextLine();
            }while(resp.equalsIgnoreCase("si"));
        }catch(FileNotFoundException fnfe){

        }catch(IOException ioe){

        }finally{
            if(printWriter!=null){
                printWriter.close();
            }
        }
    }

    public void lecturaArchivoTexto(File fichero){
        String resultado="";
        try{
            String actual;
            bufferedReader = new BufferedReader(new FileReader(fichero));
            while((actual=bufferedReader.readLine())!=null){
                resultado+=actual;
                resultado+="\n";
            }
            bufferedReader.close();
        }catch(FileNotFoundException fnfe){

        }catch(IOException ioe){

        }finally{
            System.out.println(resultado);
        }
    }

    public void contarLineasPalabrasCaracteres(File fichero){
        int palabras=0, lineas=0, caracteres=0;
        try{
            String s;
            bufferedReader = new BufferedReader(new FileReader(fichero));
            while((s=bufferedReader.readLine())!=null){
                palabras+=s.split(" ").length;
                caracteres+=(s.replaceAll(" ", "")).length();
                lineas++;
            }
        }catch(FileNotFoundException fnfe){

        }catch(IOException ioe){

        }finally{
           lecturaArchivoTexto(fichero);
            System.out.println("Tiene: ");
            System.out.println("Lineas: "+lineas);
            System.out.println("Palabras: "+palabras);
            System.out.println("Caracteres: "+caracteres);
        }
    }

    public void lecturaFicheroHastaUnaLinea(File fichero, int linea){
        int lineasLeidas=0;
        String resultado="";
        try{
            String s;
            bufferedReader = new BufferedReader(new FileReader(fichero));
            while(((s=bufferedReader.readLine()) != null) && lineasLeidas < linea){
                resultado+=s;
                resultado+="\n";
                lineasLeidas++;
            }
        }catch(FileNotFoundException fnfe){

        }catch(IOException ioe){

        }finally{
            System.out.println(resultado);
        }
    }

    public void copiarDeHasta(File fichero1, File fichero2){
        try{
            String s;
            bufferedReader = new BufferedReader(new FileReader(fichero1));
            printWriter = new PrintWriter(new BufferedWriter(new FileWriter(fichero2)));
            while(((s=bufferedReader.readLine()) != null)){
                printWriter.println(s);
            }
        }catch(FileNotFoundException fnfe){

        }catch(IOException ioe){

        }finally{
            printWriter.close();
        }
    }

    public void escribirNumerosDe1Al100(File fichero){
        try{
            printWriter = new PrintWriter(new BufferedWriter(new FileWriter(fichero)));

            for(int i=1;i<=100;i++){
               printWriter.print(i+" ");
                if(i%10==0){
                    printWriter.println();
                }
            }
            printWriter.close();
        }catch(IOException ioe){

        }finally{
            lecturaArchivoTexto(fichero);
        }
    }

    public static void main(String[] args){
        FicheroTexto ficheroTexto = new FicheroTexto();
//        File fichero = new File("Siuxoes.txt");
//         ficheroTexto.escribirArchivoTexto(fichero);
//       ficheroTexto.lecturaArchivoTexto(fichero);
//        ficheroTexto.contarLineasPalabrasCaracteres(fichero);
//        ficheroTexto.lecturaFicheroHastaUnaLinea(fichero, 2);
//        File fichero2 = new File("Siuxoes2.txt");
//        ficheroTexto.copiarDeHasta(fichero, fichero2);
         File fichero3 = new File("Siuxoes3.txt");
        ficheroTexto.escribirNumerosDe1Al100(fichero3);
    }
}
