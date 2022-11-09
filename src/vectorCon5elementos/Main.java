package vectorCon5elementos;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(20,15);
        vector.add("hola");
        vector.add("mundo");
        vector.add("soy");
        vector.add("Nico");
        vector.add("Hola");

        System.out.println(vector);

        vector.remove(1);
        vector.remove(2);
        System.out.println(vector);

        /**
         *         4. Indica cuál es el problema de utilizar un Vector
         *         con la capacidad por defecto si tuviésemos 1000 elementos
         *         para ser añadidos al mismo:
         *
         *         Demandaría muchos recursos del pc. Ya que por defecto la capacidad del
         *         Vector va a ser de 10 y va a incrementar varias veces para cubrir los 1000 elementos.
         */
    }
}
