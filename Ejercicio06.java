
package Traducción;

import java.util.Random;


public class Ejercicio06 {
    public static int obtenerNumero() {
        Random aleatorio = new Random();
        return aleatorio.nextInt(100) + 1;
    }

    public static void main(String[] args) {

        int numero = obtenerNumero();

        System.out.println("Número aleatorio: " + numero);
    }
}
