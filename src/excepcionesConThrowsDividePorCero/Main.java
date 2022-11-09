package excepcionesConThrowsDividePorCero;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        System.out.println("resultado: " + dividePorCero(25,0));

    }

    public static int dividePorCero(int A, int B)throws ArithmeticException{
        int resultado = 0;
        try{
            resultado = A / B;
        }catch(ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de código");
        }

        return resultado;
    }


}
