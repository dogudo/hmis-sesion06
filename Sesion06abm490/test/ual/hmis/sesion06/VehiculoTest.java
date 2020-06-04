package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class VehiculoTest {

	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"0, 0",
				"1, 1"})

	void testGetNumPasajeros(int numPasajeros, int expected) {
		Vehiculo v = new Vehiculo(numPasajeros, 0, 0);
		assertEquals(expected, v.getNumPasajeros());
	}
	
	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"0.0, 0.0",
				"1.2, 1.2"})

	void testGetPeso(double peso, double expected) {
		Vehiculo v = new Vehiculo(0, 0, peso);
		assertEquals(expected, v.getPeso());
	}
}