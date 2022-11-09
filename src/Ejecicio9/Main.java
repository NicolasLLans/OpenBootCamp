package Ejecicio9;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ficheroInOut();


    }

    private static void ficheroInOut() {
        try(PrintStream fichero = new PrintStream("empleados.txt")) {
            ArrayList<String> empleados = new ArrayList<>(10);
            empleados.add("Alberto");
            empleados.add("Monica");
            empleados.add("Alfredo");
            empleados.add("Ruperta");
            byte[] Array = new ArrayList<String>;  
            fichero.write(Array);
            System.out.println(Array.length);

        }catch(Exception e){
            System.out.println("error en el programa: "+ e.getMessage());
        }






        //HashMap<String, ArrayList<String>> categoria = new HashMap<>();

    }

}
