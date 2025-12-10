package co.loggro.bloques;

import java.util.Scanner;

/**
 * Autor: Camila Rodríguez
 * Fecha: 10/02/2025
 * Propósito: Maneja la interacción por consola con el usuario.
 */

public class ConsolaBloques {

    private final PruebaBloques prueba;
    private final Scanner scanner = new Scanner(System.in);

    public ConsolaBloques(PruebaBloques juego) {
        this.prueba = juego;
    }

    public void ejecutar() {
        System.out.println("Bienvenido a la Prueba de Bloques.");
        System.out.println("Escribe una palabra para validar si se puede formar con los siguientes bloques:");
        bloquesDisponibles();
        System.out.println("Si deseas salir, escribe '1'.\n");

        while (true) {
            System.out.print("Palabra: ");
            String palabra = scanner.nextLine();

            if (palabra == null) continue;

            palabra = palabra.trim();

            if (palabra.equalsIgnoreCase("1")) {
                System.out.println("El usuario ha salido del sistema.");
                break;
            }

            if (palabra.isEmpty()) {
                System.out.println("Por favor escribe una palabra válida.\n");
                continue;
            }

            try {
                boolean resultado = prueba.puedo_obtener_palabra(palabra);
                System.out.println(resultado + "\n");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }

    private void bloquesDisponibles() {
        for (String bloque : prueba.obtenerBloques()) {
            System.out.print("(" + bloque.charAt(0) + " " + bloque.charAt(1) + ") ");
        }
        System.out.println("\n");
    }
}
