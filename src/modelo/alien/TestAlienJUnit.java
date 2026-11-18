package modelo.alien;

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
		
}
