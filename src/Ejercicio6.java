import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int matriz [][] =  {{2,5,7},
                            {9,1,4},
                            {5,8,1}};

        for (int i = 0; i < matriz.length; i += 1) {
            for (int j = 0; j < matriz[i].length; j += 1) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matriz.length; i += 1) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j += 1) {
                sumaFila += matriz[i][j];
            }
            System.out.println("La suma de la fila " + (i + 1) + " es: " + sumaFila);
        }
    }
}