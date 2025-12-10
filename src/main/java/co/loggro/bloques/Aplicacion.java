package co.loggro.bloques;

/**
 * Autor: Camila Rodríguez
 * Fecha: 10/02/2025
 * Propósito: Entrada de la aplicación, ejecuta la lógica de la prueba de bloques de
 * manera interactiva.
 */

public class Aplicacion {

    public static void main(String[] args) {
        PruebaBloques reto = new PruebaBloques();
        ConsolaBloques consola = new ConsolaBloques(reto);
        consola.ejecutar();
    }
}
