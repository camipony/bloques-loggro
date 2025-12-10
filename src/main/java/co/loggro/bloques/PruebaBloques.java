package co.loggro.bloques;

/**
 * Autor: Camila Rodríguez
 * Fecha: 10/02/2025
 * Propósito: Contiene la lógica principal de la prueba de bloques.
 * Permite validar si una palabra puede formarse usando una colección fija
 * de bloques de dos letras, asegurando que ningún bloque sea reutilizado y
 * sin distinguir de minusculas y mayusculas.
 */

import java.util.Locale;

public class PruebaBloques {

    private static final String[] BLOQUES = {
            "BO", "XK", "DQ", "CP", "NA",
            "GT", "RE", "TG", "QD", "FS",
            "HU", "VI", "AT", "OB", "ER",
            "FS", "LY", "PC", "ZM", "JW"
    };

    public boolean puedo_obtener_palabra(String palabra) {
        if (palabra == null || palabra.isBlank()) {
            throw new IllegalArgumentException("La palabra no es válida.");
        }

        String normalizada = palabra.toUpperCase(Locale.ROOT).trim();
        boolean[] utilizado = new boolean[BLOQUES.length];

        return puedo_obtener_palabra_recur(normalizada, 0, utilizado);
    }

    private boolean puedo_obtener_palabra_recur(String palabra, int index, boolean[] bloqueusado) {
        if (index == palabra.length()) {
            return true;
        }

        char letra = palabra.charAt(index);

        for (int i = 0; i < BLOQUES.length; i++) {
            if (bloqueusado[i]) {
                continue;
            }

            String bloque = BLOQUES[i];
            char a = bloque.charAt(0);
            char b = bloque.charAt(1);

            if (letra == a || letra == b) {
                bloqueusado[i] = true;
                if (puedo_obtener_palabra_recur(palabra, index + 1, bloqueusado)) {
                    return true;
                }
                bloqueusado[i] = false;
            }
        }
        return false;
    }

    public String[] obtenerBloques() {
        return BLOQUES;
    }
}
