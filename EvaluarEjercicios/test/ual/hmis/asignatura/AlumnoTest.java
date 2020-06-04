package ual.hmis.asignatura;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AlumnoTest {

	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"2, 5",
				"3, -1",
				"1, 0"})

	void testCalcularNotaActividad(String nombreActividad, double expected) {
		Alumno c = new Alumno();
		assertEquals(-1, c.calcularNotaActividad(""));
		ArrayList<Actividad> actividadesAsignadas = new ArrayList<Actividad>();
		Actividad act1 = new Actividad();
		act1.setNombre("1");
		actividadesAsignadas.add(act1);
		Actividad act2 = new Actividad();
		act2.setNombre("2");
		act2.setPuntuacionTotal(5);
		actividadesAsignadas.add(act2);
		c.setActividadesAsignadas(actividadesAsignadas);
		assertEquals(expected, c.calcularNotaActividad(nombreActividad));
	}
	
	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"-1, Error en la nota",
				"0, Suspenso",
				"4, Suspenso",
				"5, Aprobado",
				"6, Aprobado",
				"7, Notable",
				"8, Notable",
				"9, Sobresaliente",
				"10, Matr�cula",
				"11, Error en la nota"})

	void testCalificacion(double nota, String expected) {
		Alumno c = new Alumno();
		assertEquals(expected, c.calificacion(nota));
	}
	
	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"2018, Error en el a�o",
				"2017, 1� Educaci�n Infantil",
				"2016, 2� Educaci�n Infantil",
				"2015, 3� Educaci�n Infantil",
				"2014, 1� Educaci�n Primaria",
				"2013, 2� Educaci�n Primaria",
				"2012, 3� Educaci�n Primaria",
				"2011, 4� Educaci�n Primaria",
				"2010, 5� Educaci�n Primaria",
				"2009, 6� Educaci�n Primaria",
				"2008, 1� Educaci�n Secundaria",
				"2007, 2� Educaci�n Secundaria",
				"2006, 3� Educaci�n Secundaria",
				"2005, 4� Educaci�n Secundaria",
				"2004, Error en el a�o"})

	void testCursoSegunEdad(int anyoNacimiento, String expected) {
		Alumno c = new Alumno();
		assertEquals(expected, c.cursoSegunEdad(anyoNacimiento));
	}

}
