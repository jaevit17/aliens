
package modelo.alien;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.alien.Alien;

public class TestAlienJUnitAI {

    // CASO 1: Verificar la creación de un Alien con tamaño y color válidos.
    @Test
    public void testCrearAlienValido() {

        Alien alien = new Alien(15, "Verde");

        assertEquals(15, alien.getTamanio());
        assertEquals("Verde", alien.getColor());
    }

    // CASO 2: Verificar que un tamaño menor al mínimo se reemplace por 10.
    @Test
    public void testTamanioMenorAlMinimo() {

        Alien alien = new Alien(4, "Azul");

        assertEquals(10, alien.getTamanio());
    }

    // CASO 3: Verificar que un tamaño mayor al máximo se reemplace por 10.
    @Test
    public void testTamanioMayorAlMaximo() {

        Alien alien = new Alien(31, "Rojo");

        assertEquals(10, alien.getTamanio());
    }

    // CASO 4: Verificar el tamaño mínimo permitido (5 cm).
    @Test
    public void testTamanioMinimo() {

        Alien alien = new Alien(5, "Amarillo");

        assertEquals(5, alien.getTamanio());
    }

    // CASO 5: Verificar el tamaño máximo permitido (30 cm).
    @Test
    public void testTamanioMaximo() {

        Alien alien = new Alien(30, "Morado");

        assertEquals(30, alien.getTamanio());
    }

    // CASO 6: Verificar el cálculo del precio del cuerpo (20%).
    @Test
    public void testPrecioCuerpo() {

        Alien alien = new Alien(20, "Verde");

        assertEquals(4.0, alien.getPrecioCuerpo(), 0.001);
    }

    // CASO 7: Verificar el cálculo del precio de extremidades (10%).
    @Test
    public void testPrecioExtremidad() {

        Alien alien = new Alien(20, "Verde");

        assertEquals(2.0, alien.getPrecioExtremidad(), 0.001);
    }

    // CASO 8: Verificar el cálculo del precio de los ojos (5%).
    @Test
    public void testPrecioOjo() {

        Alien alien = new Alien(20, "Verde");

        assertEquals(1.0, alien.getPrecioOjo(), 0.001);
    }

    // CASO 9: Verificar que los precios se calculen usando el tamaño corregido.
    @Test
    public void testPreciosConTamanioPorDefecto() {

        Alien alien = new Alien(40, "Negro");

        assertEquals(10, alien.getTamanio());
        assertEquals(2.0, alien.getPrecioCuerpo(), 0.001);
        assertEquals(1.0, alien.getPrecioExtremidad(), 0.001);
        assertEquals(0.5, alien.getPrecioOjo(), 0.001);
    }

    // CASO 10: Verificar que los atributos numéricos adicionales comiencen en cero.
    @Test
    public void testValoresInicialesExtremidadesYOjos() {

        Alien alien = new Alien(15, "Blanco");

        assertEquals(0, alien.getNumeroOjos());
        assertEquals(0, alien.getNumeroBrazos());
        assertEquals(0, alien.getNumeroPies());
    }

    // CASO 11: Verificar que el tamaño de 10 cm conserve correctamente sus precios.
    @Test
    public void testPreciosConTamanioDiez() {

        Alien alien = new Alien(10, "Rosa");

        assertEquals(2.0, alien.getPrecioCuerpo(), 0.001);
        assertEquals(1.0, alien.getPrecioExtremidad(), 0.001);
        assertEquals(0.5, alien.getPrecioOjo(), 0.001);
    }

    // CASO 12: Verificar que cada objeto conserve sus propios datos.
    @Test
    public void testDosAliensIndependientes() {

        Alien alien1 = new Alien(20, "Verde");
        Alien alien2 = new Alien(30, "Azul");

        assertEquals(20, alien1.getTamanio());
        assertEquals("Verde", alien1.getColor());

        assertEquals(30, alien2.getTamanio());
        assertEquals("Azul", alien2.getColor());

        assertEquals(4.0, alien1.getPrecioCuerpo(), 0.001);
        assertEquals(6.0, alien2.getPrecioCuerpo(), 0.001);
    }

}
