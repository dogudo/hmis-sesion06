package ual.hmis.asignatura;

import java.util.ArrayList;

public class Alumno {

	private String nombre;
	private ArrayList<Actividad> actividadesAsignadas;


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Actividad> getActividadesAsignadas() {
		return actividadesAsignadas;
	}

	public void setActividadesAsignadas(ArrayList<Actividad> actividadesAsignadas) {
		this.actividadesAsignadas = actividadesAsignadas;
	}

	public double calcularNotaActividad(String nombreActividad) {
		if (actividadesAsignadas == null) return -1;
		for (Actividad act : actividadesAsignadas) {
			if (act.getNombre().equals(nombreActividad)) {
				return act.getPuntuacionTotal();
			}
		}
		return -1;
	}
	
	public String calificacion(double nota) {
		if (nota >= 0 && nota < 5) {
			return "Suspenso";
		} else if (nota >= 5 && nota < 7) {
			return "Aprobado";
		} else if (nota >= 7 && nota < 9) {
			return "Notable";
		} else if (nota >= 9 && nota < 10) {
			return "Sobresaliente";
		} else if (nota == 10) {
			return "Matr�cula";
		}
		return "Error en la nota";
	}
	
	public String cursoSegunEdad(int anyoNacimiento) {
		switch (anyoNacimiento) {
			case 2017: return "1º Educación Infantil";
			case 2016: return "2º Educación Infantil";
			case 2015: return "3º Educación Infantil";
			case 2014: return "1º Educación Primaria";
			case 2013: return "2º Educación Primaria";
			case 2012: return "3º Educación Primaria";
			case 2011: return "4º Educación Primaria";
			case 2010: return "5º Educación Primaria";
			case 2009: return "6º Educación Primaria";
			case 2008: return "1º Educación Secundaria";
			case 2007: return "2º Educación Secundaria";
			case 2006: return "3º Educación Secundaria";
			case 2005: return "4º Educación Secundaria";
			default: return "Error en el año";
		}
	}

}
