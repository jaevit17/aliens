
package modelo.alien;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestAlienJUnit {

    // APLICACION CORRECTA DE ATRIBUTOS

    @Test
    public void validarAtributosAlien() {

        Alien a1 = new Alien(5, "Rojo");

        assertEquals(5, a1.getTamanio());
        assertEquals("Rojo", a1.getColor());
    }

    // APLICACION DE RESTRICCIONES DE TAMANIO

    @Test
    public void validarRestriccionesTamanio() {

        Alien a2 = new Alien(0, "Negro");
        assertEquals(10, a2.getTamanio());

        Alien a3 = new Alien(20, "Negro");
        assertEquals(20, a3.getTamanio());
    }

    // APLICACION DE CALCULOS DE PRECIOS

    @Test
    public void validarCalculoPrecios() {

        Alien a4 = new Alien(5, "Azul");

        assertEquals(1.0, a4.getPrecioCuerpo(), 0.0001);
        assertEquals(0.5, a4.getPrecioExtremidad(), 0.0001);
        assertEquals(0.25, a4.getPrecioOjo(), 0.0001);
    }

    // TEST AGREGAR BRAZOS

    @Test
    public void agregarBrazosTrue() {

        Alien a5 = new Alien(5, "Azul");

        boolean resultado = a5.agregarBrazos(3);
        assertEquals(3, a5.getNumeroBrazos());
        assertTrue(resultado);
    }

    // TEST AGREGAR BRAZOS SUPERANDO LIMITE

    @Test
    public void agregarBrazosFalse() {

        Alien a6 = new Alien(5, "Azul");

        a6.agregarBrazos(9);
        boolean resultado = a6.agregarBrazos(2);
        assertEquals(9, a6.getNumeroBrazos());
        assertFalse(resultado);
    }

    // TEST AGREGAR PIERNAS

    @Test
    public void agregarPiernasTrue() {

        Alien a7 = new Alien(5, "Azul");

        boolean resultado = a7.agregarPiernas(5);
        assertEquals(5, a7.getNumeroPies());
        assertTrue(resultado);
    }

    // TEST AGREGAR PIERNAS SUPERANDO LIMITE

    @Test
    public void agregarPiernasFalse() {

        Alien a8 = new Alien(5, "Azul");

        a8.agregarPiernas(9);
        boolean resultado = a8.agregarPiernas(2);
        assertEquals(9, a8.getNumeroPies());
        assertFalse(resultado);
    }

    // TEST AGREGAR BRAZOS Y PIERNAS

    @Test
    public void agregarBrazosPiernas() {

        Alien a9 = new Alien(6, "Celeste");

        boolean resultado = a9.agregarPiernas(5);
        resultado = a9.agregarBrazos(5);
        assertEquals(5, a9.getNumeroPies());
        assertEquals(5, a9.getNumeroBrazos());
        assertTrue(resultado);
    }

    // TEST AGREGAR BRAZOS Y PIERNAS SUPERANDO LIMITE

    @Test
    public void agregarBrazosPiernasFalse() {

        Alien a10 = new Alien(6, "Celeste");

        a10.agregarPiernas(5);
        boolean resultado = a10.agregarBrazos(6);
        assertEquals(5, a10.getNumeroPies());
        assertEquals(0, a10.getNumeroBrazos());
        assertFalse(resultado);
    }

    // PARTE 10: PRUEBAS FINALES

    // CASO 1: COMPROBAR PRECIO TOTAL AL AGREGAR ELEMENTOS

    @Test
    public void validarPrecioTotal() {

        Alien a11 = new Alien(10, "Verde");

        assertEquals(0.0, a11.getPrecioTotal(), 0.0001);
        a11.agregarBrazos(2);
        assertEquals(4.0, a11.getPrecioTotal(), 0.0001);
        a11.agregarPiernas(2);
        assertEquals(6.0, a11.getPrecioTotal(), 0.0001);
        a11.agregarOjos(3);
        assertEquals(7.5, a11.getPrecioTotal(), 0.0001);
    }

    // CASO 2: COMPROBAR QUE NO AGREGA EXTREMIDADES SI SUPERA EL LIMITE

    @Test
    public void validarRestriccionExtremidades() {

        Alien a12 = new Alien(10, "Rojo");

        a12.agregarBrazos(6);
        double precioAnterior = a12.getPrecioTotal();
        boolean resultado = a12.agregarPiernas(5);
        assertEquals(6, a12.getNumeroBrazos());
        assertEquals(0, a12.getNumeroPies());
        assertEquals(precioAnterior, a12.getPrecioTotal(), 0.0001);
        assertFalse(resultado);
    }

    // CASO 3: COMPROBAR QUE NO AGREGA OJOS SI SUPERA EL LIMITE

    @Test
    public void validarRestriccionOjos() {

        Alien a13 = new Alien(5, "Azul");
        a13.agregarOjos(3);
        double precioAnterior = a13.getPrecioTotal();
        boolean resultado = a13.agregarOjos(1);
        assertEquals(3, a13.getNumeroOjos());
        assertEquals(precioAnterior, a13.getPrecioTotal(), 0.0001);
        assertFalse(resultado);
    }

}
