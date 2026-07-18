
package Traducción;

import java.util.Scanner;


public class Ejercicio08 {
     public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la base del rectángulo: ");
        double base = entrada.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = entrada.nextDouble();

        double area = calcularArea(base, altura);

        System.out.println("El área del rectángulo es: " + area);
    }
}
