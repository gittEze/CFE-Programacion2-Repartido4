import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int matriz [][] =  {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};

        System.out.println("Numeros que estan en diagonal:");
        for (int i = 0; i < matriz.length; i += 1) {
            System.out.println(matriz[i][i]);
        }
    }
}