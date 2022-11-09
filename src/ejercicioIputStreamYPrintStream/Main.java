package ejercicioIputStreamYPrintStream;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        implementacionDelaFuncion();

    }

    private static void ficheroInOut(String fileIn, String fileOut) {
        try {
            InputStream fichero = new FileInputStream(fileIn);
            byte[] datos = fichero.readAllBytes();

            PrintStream info = new PrintStream(fileOut);
            info.write(datos);
        }catch(Exception e){
            System.out.println("error en el programa: "+ e.getMessage());
        }
    }
    private static void implementacionDelaFuncion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribí el archivo origen: ");
        String filein = scanner.nextLine();
        System.out.println("Escribí el archivo destino: ");
        String fileOut = scanner.nextLine();
        ficheroInOut(filein,fileOut);
        System.out.println("Completado");
    }

}
