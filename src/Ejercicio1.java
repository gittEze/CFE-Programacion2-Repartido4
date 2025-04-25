import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int valores [] = new int[10];

        System.out.println("Ingrese 10 valores: ");
        for(int i = 0; i < valores.length; i++) {
            System.out.println("Valor " + (i+1) + ": ");
            valores[i] = leer.nextInt();
        }

        System.out.println("Valores ingresados: ");
        for(int i = 0; i < valores.length; i++) {
            System.out.println("Valor " + (i+1) + ": " + valores[i]);
        }

    }
}