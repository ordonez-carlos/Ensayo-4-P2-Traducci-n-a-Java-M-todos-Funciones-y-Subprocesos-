
package Traducción;

import java.util.Scanner;


public class Ejercicio03 {
     public static void saludar(String nombre) {
        System.out.println("Bienvenido " + nombre + ".");
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        saludar(nombre);
    }
}
