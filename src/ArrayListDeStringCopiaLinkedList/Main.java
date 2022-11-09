package ArrayListDeStringCopiaLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList= new ArrayList<String>(4);
        arrayList.add("Elemento 1");
        arrayList.add("Elemento 2");
        arrayList.add("Elemento 3");
        arrayList.add("Elemento 4");

        LinkedList<String> listaEnlazada = new LinkedList<>();
        listaEnlazada.add(String.valueOf(arrayList));


        for (Object elementoArray : arrayList.toArray()){
            System.out.println("Elementos de ArrayList: " + elementoArray.toString());
        }
        for(Object elemento : listaEnlazada.toArray()){
            System.out.println("Elementos de LinkedList: " + elemento.toString());
        }

//////////ArrayList de tipo int////////////////////////////////////////////////////////

        ArrayList<Integer> lista = new ArrayList<Integer>(10);

        for(Integer i = 1; i <= 10; i++){
            lista.add(i);
            i+=1;
            lista.remove(i);
        }
        System.out.println("arrayList Final" + Arrays.toString(lista.toArray()));

        /**Forma larga
         * for(Integer i = 1; i <= 10; i++){
         *             lista.add(i);
         *         }
         *         System.out.println(Arrays.toString(lista.toArray()));
         *
         *         for(Integer i = 1; i <= 10; i++){
         *             i+=1;
         *             lista.remove(i);
         *         }
         *         System.out.println("arrayList Final" + Arrays.toString(lista.toArray()));
         */

    }
}
