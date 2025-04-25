import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String array [] = {"Ana", "Luis", "Marta", "Pedro", "Juan"};

        System.out.print("Buscar nombre: ");
        String nombre = leer.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(nombre)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El nombre " + nombre + " se encuentra en el arreglo.");
        } else {
            System.out.println("El nombre " + nombre + " no se encuentra en el arreglo.");
        }

    }
}
