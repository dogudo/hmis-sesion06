package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio4Test {
	
	@ParameterizedTest (name = "{index} => Con entrada ({0}) y ({1}) sale {2}")
	@CsvSource({"01234, 123, 123",
				"01234, 56789, ''",
				"01010, 024, 000"})

	void testCaracteresComun(String input1, String input2, String expected) {
		Ejercicio4 c = new Ejercicio4();
		assertEquals(expected, c.caracteresComun(input1, input2));
	}

}
