package ArrayBidimencionalDeEnteros;

public class Main {
    public static void main(String[] args) {

        int[][] arrayBi = new int[2][3];
        arrayBi[0][0]=20;
        arrayBi[0][1]=2;
        arrayBi[0][2]=25;

        arrayBi[1][0]=12;
        arrayBi[1][1]=4;
        arrayBi[1][2]=1;

        for (int i = 0; i < arrayBi.length; i++){
            System.out.println("valor de i: " + i);

            for (int j = 0; j < arrayBi[1].length; j++){
                System.out.println("Estoy en i= "+ i + ", j = "+ j);
                System.out.println(arrayBi[i][j]);
            }
        }

    }


}
