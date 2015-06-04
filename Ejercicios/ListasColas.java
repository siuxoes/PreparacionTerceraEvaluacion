import java.util.*;

/**
 * Created by Siuxoes on 31/05/2015.
 */
public class ListasColas {

    private Stack<String> lista;
    public Stack<String> crearListaVacia(){
        return new Stack<String>();
    }

    public void añadir(String n){
        this.lista.push(n);
    }

    public void desapilar(){
        this.lista.pop();
    }

    public void revertir(){
        Collections.reverse(lista);
    }

    public boolean sonIguales(Stack<String> lista2){
        if(this.lista.size() != lista2.size()){
            return false;
        }else{
            for(int i=0;i<this.lista.size();i++){
                if(!this.lista.get(i).equalsIgnoreCase(lista2.get(i))){
                    return false;
                }
            }
        }
        return true;
    }

    public static LinkedList<String> eliminarDePila(LinkedList<String> l, Stack<Integer> s){
        LinkedList<String> temp = new LinkedList<>();
        if(s.size() <= l.size()){
            int n=s.pop();
                l.remove(n);
        }else{
            System.out.println("Se han querido eliminar más posiciones de las que tengo");
        }
        return temp=l;
    }

    public void destruyePila(){
        while(this.lista.size()>0){
            this.lista.pop();
        }
    }

    public Map<String, String> repartirRegalos(LinkedList<String> Clientes, LinkedList<String> Regalos){
        Map<String, String> temp = new HashMap<String, String>();
        while(!Regalos.isEmpty()){
            for(String cliente: Clientes){
                if(!temp.containsKey(cliente)){
                    temp.put(cliente, Regalos.pop());
                }
            }
        }
        return temp;
    }

    public void calcularTiempo(LinkedList<String> lista){
        Map<String, Double> dic = new HashMap<>();
        dic.put("RETIRO", 4.0);
        dic.put("DEPOSITO", 2.0);
        dic.put("CONSULTA", 3.5);
        dic.put("ACTUALIZACION", 5.0);
        dic.put("PAGOS", 2.0);
        String nombre = lista.pop();
        double tiempo = 0;
        while(lista.size()>0){
            tiempo+=dic.get(lista.pop());
        }
        System.out.println(nombre +" tardará "+tiempo+" minutos");
    }
    public static void main(String[] args){
        ListasColas l1 = new ListasColas();

        l1.lista=l1.crearListaVacia();

        l1.añadir("Hola");
        l1.añadir("Adios");

        for(String n: l1.lista){
            System.out.println(n);
        }

        Stack<String> l2 = l1.crearListaVacia();

        l2.add("hola");
        System.out.println(l1.sonIguales(l2));

        l1.destruyePila();
        for(String n: l1.lista){
            System.out.println(n);
        }
        LinkedList<String> lista3 = new LinkedList<>();
        lista3.add("Sebastian");
        lista3.add("ACTUALIZACION");
        lista3.add("PAGOS".toUpperCase());
        System.out.println(lista3.size());
        Stack<Integer> sf = new Stack<>();
        sf.add(2);




        LinkedList<String> lista4 = eliminarDePila(lista3, sf);
        for(String n: lista4){
            System.out.println(n);
        }

        LinkedList<String> clientes = new LinkedList<String>();
        clientes.add("paco");
        clientes.add("sebastian");
        clientes.add("s");

        LinkedList<String> regalos = new LinkedList<String>();
        regalos.add("TV");
        regalos.add("Android");
        regalos.add("Android");
        Map<String, String> temp = l1.repartirRegalos(clientes, regalos);

        for (Map.Entry<String, String> entry : temp.entrySet())
        {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
    }
}
