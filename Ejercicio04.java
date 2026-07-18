
package Traducción;

import java.util.Scanner;


public class Ejercicio04 {
    public static void mostrarDatos(String nombre, int edad) {
        System.out.println("\n--- DATOS DE LA PERSONA ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();

        mostrarDatos(nombre, edad);
    }
}
