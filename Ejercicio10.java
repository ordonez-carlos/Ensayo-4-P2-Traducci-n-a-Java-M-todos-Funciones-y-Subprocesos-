
package Traducción;

import java.util.Scanner;


public class Ejercicio10 {
    public static int mayor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = entrada.nextInt();

        int numeroMayor = mayor(numero1, numero2);

        System.out.println("El número mayor es: " + numeroMayor);
    }
}
