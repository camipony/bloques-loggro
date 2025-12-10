package co.loggro.bloques;

/**
 * Autor: Camila Rodríguez
 * Fecha: 10/02/2025
 * Propósito: Pruebas unitarias para la clase BlocksGame.
 * Verifica que la lógica de validación de la palabra funcione correctamente
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PruebaBloquesTest {

    private final PruebaBloques game = new PruebaBloques();

    @Test
    void shouldReturnTrueForSingleLetterA() {
        assertTrue(game.puedo_obtener_palabra("A"));
    }

    @Test
    void shouldReturnTrueForLibro() {
        assertTrue(game.puedo_obtener_palabra("LIBRO"));
    }

    @Test
    void shouldReturnFalseForBozo() {
        assertFalse(game.puedo_obtener_palabra("BOZO"));
    }

    @Test
    void shouldReturnTrueForTraje() {
        assertTrue(game.puedo_obtener_palabra("TRAJE"));
    }

    @Test
    void shouldReturnTrueForComun() {
        assertTrue(game.puedo_obtener_palabra("COMUN"));
    }

    @Test
    void shouldReturnFalseForCampana() {
        assertFalse(game.puedo_obtener_palabra("CAMPANA"));
    }

    @Test
    void shouldReturnTrueForDorito() {
        assertTrue(game.puedo_obtener_palabra("DORITO"));
    }

    @Test
    void shouldReturnTrueForArlequin() {
        assertTrue(game.puedo_obtener_palabra("ARLEQUIN"));
    }

    @Test
    void shouldBeCaseInsensitive() {
        assertTrue(game.puedo_obtener_palabra("libro"));
    }

    @Test
    void shouldThrowExceptionWhenWordIsNullOrBlank() {
        assertThrows(IllegalArgumentException.class, () -> game.puedo_obtener_palabra(null));
        assertThrows(IllegalArgumentException.class, () -> game.puedo_obtener_palabra("   "));
    }
}
