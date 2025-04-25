import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int matriz [][] =  {{3,4,5},
                            {12,5,18},
                            {1,2,3}};

        boolean control = true;

        for (int j = 0; j < matriz[1].length; j++) {
            if (matriz[1][j] <= 10) {
                control = false;
                break;
            }
        }

        String resultado = control ? "Todos son > 10" : "Alemons 1 es < 10";
        System.out.println(resultado);

    }
}