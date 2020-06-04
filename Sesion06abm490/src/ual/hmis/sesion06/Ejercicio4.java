package ual.hmis.sesion06;

public class Ejercicio4 {

	public String caracteresComun(String p1, String p2) {
		String s = "";

		for(char c : p1.toCharArray()) {
			if (p2.contains(""+c)) s += c;
		}

		return s;
	}
}