
package Traducción;

import java.util.Scanner;


public class Ejercicio05 {
    public static void operaciones(double a, double b) {
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));

        if (b != 0) {
            System.out.println("División: " + (a / b));
        } else {
            System.out.println("División: No se puede dividir para cero.");
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = entrada.nextDouble();

        operaciones(numero1, numero2);
    }
}
