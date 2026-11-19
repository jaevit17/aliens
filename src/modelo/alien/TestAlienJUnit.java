package modelo.alien;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestAlienJUnit {
	//APLICACION CORRECTA DE ATRIBUTOS
	@Test
	public void validarAtributosAlien() {
	Alien a1=new Alien(5,"Rojo");
	assertEquals(5,a1.getTamanio());
	assertEquals("Rojo",a1.getColor());
	}
	//APLICACION DE RESTRICCIONES DE TAMANIO
	@Test
	public void validarRestriccionesTamanio() {
	Alien a2=new Alien(0,"Negro");
	assertEquals(10,a2.getTamanio());
	Alien a3=new Alien(20,"Negro");
	assertEquals(20,a3.getTamanio());
	}
	//APLICACION DE CALCULOS DE PRECIOS
	@Test
	public void validarCalculoPrecios() {
	Alien a4=new Alien(5,"Azul");
	assertEquals(1.0,a4.getPrecioCuerpo(),0.0001);
	assertEquals(0.5,a4.getPrecioExtremidad(),0.0001);
	assertEquals(0.25,a4.getPrecioOjo(),0.0001);
	}
	//TEST AGREGAR BRAZOS
	@Test
	public void agregarBrazosTrue() {
		Alien a5=new Alien(5,"Azul");
		boolean resultado=a5.agregarBrazos(3);
		assertEquals(3,a5.getNumeroBrazos());
		assertTrue(resultado);
	}
	//TEST AGREGAR BRAZOS SUPERANDO LIMITE
	@Test
	public void agregarBrazosFalse() {
		Alien a6=new Alien(5,"Azul");
		boolean resultado=a6.agregarBrazos(9);
		resultado=a6.agregarBrazos(2);
		assertEquals(11,a6.getNumeroBrazos());
		assertTrue(resultado);
	}
	//TEST AGREGAR PIERNAS
	@Test
	public void agregarPiernasTrue() {
		Alien a7=new Alien(5,"Azul");
		boolean resultado=a7.agregarPiernas(5);
		assertEquals(5,a7.getNumeroPies());
		assertTrue(resultado);
	}
	//TEST AGREGAR BRAZOS SUPERANDO LIMITE
	@Test
	public void agregarPiernasFalse() {
		Alien a8=new Alien(5,"Azul");
		boolean resultado=a8.agregarPiernas(9);
		resultado=a8.agregarPiernas(2);
		assertEquals(11,a8.getNumeroPies());
		assertTrue(resultado);
	}
	//TEST AGREGAR BRAZOS Y PIERNAS
	@Test
	public void agregarBrazosPiernas() {
		Alien a9=new Alien(6,"celeste");
		boolean resultado=a9.agregarPiernas(5);
		resultado=a9.agregarBrazos(5);
		assertEquals(5,a9.getNumeroPies());
		assertEquals(5,a9.getNumeroBrazos());
		assertTrue(resultado);
	}
	//TEST AGREGAR BRAZOS Y PIERNAS SUPERANDO LIMITE
	@Test
	public void agregarBrazosPiernasFalse() {
		Alien a9=new Alien(6,"celeste");
		boolean resultado=a9.agregarPiernas(5);
		resultado=a9.agregarBrazos(6);
		assertEquals(5,a9.getNumeroPies());
		assertEquals(6,a9.getNumeroBrazos());
		assertTrue(resultado);
	}
		
		
}
