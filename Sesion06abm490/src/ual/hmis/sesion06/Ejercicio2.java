package ual.hmis.sesion06;

public class Ejercicio2 {
	public boolean login (String username, String password){
	    // comprobar que sean distintos de vacio
	    // comprobar que la longitud sea < 30
	    // llamar al m�todo de la bbdd
	    return compruebaLoginEnBD(username, password);
	}
	   
	public boolean compruebaLoginEnBD (String username, String password){
	    // m�todo mock (simulado)
	    if (username.equals("user") && password.equals("pass"))
	    	return true;  
	    else  
	    	return false;
	}
}
