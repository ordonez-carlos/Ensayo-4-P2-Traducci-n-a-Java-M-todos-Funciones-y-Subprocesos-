
package Traducción;

import java.util.Scanner;


public class Ejercicio11 {
public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        boolean resultado = esPar(numero);

        if (resultado) {
            System.out.println("El numero " + numero + " es par.");
        } else {
            System.out.println("El numero " + numero + " es impar.");
        }
    }
}
