import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int array [] = {2,6,4,5,8,9,6,4};
        int suma = 0;

        System.out.print("Ingrese 8 números: ");
        for (int i = 0; i < 8; i++) {
            array[i] = leer.nextInt();
            suma += array[i];
        }

        double promedio = (double) suma / 8;

        System.out.println("Promedio: " + promedio);

    }
}