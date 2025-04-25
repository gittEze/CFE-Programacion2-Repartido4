import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        // i = filas
        // j = columnas

        int matriz [][] =  {{1,2,3},
                            {4,5,6},
                            {17,8,9}};

        for (int j = 0 ; j < matriz.length; j++) {
            for (int i = 2; i >= 0; i--){

                matriz[j][2-1] = matriz[i][j];
            }
        }

    }
}