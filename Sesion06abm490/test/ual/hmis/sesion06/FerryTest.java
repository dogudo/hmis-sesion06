package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FerryTest {
	
	@Test
	void testEmbarcarVehiculo() {
		Ferry f = new Ferry(100, 10000);
		Vehiculo v = new Vehiculo(1,4,100);
		assertFalse(f.embarcarVehiculo(null));
		assertTrue(f.embarcarVehiculo(v));
		assertFalse(f.embarcarVehiculo(v));
	}
	
	@Test
	void testTotalVehiculos() {
		Ferry f = new Ferry(100, 10000);
		Vehiculo v = new Vehiculo(1,4,100);
		assertEquals(0, f.totalVehiculos());
		f.embarcarVehiculo(v);
		assertEquals(1, f.totalVehiculos());
	}
	
	@Test
	void testVacio() {
		Ferry f = new Ferry(100, 10000);
		Vehiculo v = new Vehiculo(1,4,100);
		assertTrue(f.vacio());
		f.embarcarVehiculo(v);
		assertFalse(f.vacio());
	}
	
	@Test
	void testSuperadoMaximoVehiculos() {
		Ferry f = new Ferry(1, 10000);
		assertFalse(f.superadoMaximoVehiculos());
		f.embarcarVehiculo(new Vehiculo(1,4,100));
		f.embarcarVehiculo(new Vehiculo(1,4,100));
		assertTrue(f.superadoMaximoVehiculos());
	}
	
	@Test
	void testSuperadoMaximoPeso() {
		Ferry f = new Ferry(100, 10000);
		Vehiculo v = new Vehiculo(1,4,15000);
		assertFalse(f.superadoMaximoPeso());
		f.embarcarVehiculo(v);
		assertTrue(f.superadoMaximoPeso());
	}
}
