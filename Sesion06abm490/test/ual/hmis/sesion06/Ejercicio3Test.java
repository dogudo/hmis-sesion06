package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio3Test {
	
	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"-1, número erróneo",
				"0, *****",
				"5, *****",
				"6, ******",
				"12, ************",
				"13, ************"})

	void testCadenaAsteriscos(int input, String expected) {
		Ejercicio3 c = new Ejercicio3();
		assertEquals(expected, c.cadenaAsteriscos(input));
	}

}
