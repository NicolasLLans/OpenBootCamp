import java.util.Scanner;

public class CadenaInvertida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribí una cadena de texto: ");
        String texto = scanner.nextLine();

        if (texto.equals("")) {
            System.out.println("Por favor escribe un texto y presiona enter");
            String texto1 = scanner.nextLine();
            System.out.println("Tu texto invertido es: " + reverse(texto1));
        }
    }

    public static String reverse(String texto) {
        String textoInvertido = "";

        for (int i = texto.length() - 1; i >= 0; i--)
            textoInvertido = textoInvertido + texto.charAt(i);
        return textoInvertido;

    }

}