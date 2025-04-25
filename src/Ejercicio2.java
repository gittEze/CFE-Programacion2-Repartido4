import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int array[] = {10, 4, 5, 7, 3, 5, 7, 9, 4, 2, 5, 7, -56};

        int pares = 0;
        int impares = 0;

        for(int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Cantidad de numeros pares: " + pares);
        System.out.println("Cantidad de numeros impares: " + impares);

    }
}