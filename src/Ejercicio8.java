import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int matriz[][]= new int[4][2];

        System.out.println("Ingresa los valores para la matriz 4x2:");
        for (int i = 0; i < matriz.length; i += 1) {
            for (int j = 0; j < matriz[i].length; j += 1) {
                matriz[i][j] = leer.nextInt();
            }
        }

        int sumaTotal = 0;
        int sumaCol1 = 0;
        int sumaCol2 = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; i < matriz[i].length; i++) {
                sumaTotal += matriz[i][j];
            }

            sumaCol1 += matriz[i][0];
            sumaCol2 += matriz[i][1];

        }


    }
}