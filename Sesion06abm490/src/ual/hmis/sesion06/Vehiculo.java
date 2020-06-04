package ual.hmis.sesion06;

public class Vehiculo {
	private int numPasajeros, numRuedas;
	private double peso;
	
	public Vehiculo(int numPasajeros, int numRuedas, double peso) {
		this.numPasajeros = numPasajeros;
		this.numRuedas = numRuedas;
		this.peso = peso;
	}
	
	public int getNumPasajeros() {
		return numPasajeros;
	}
	public double getPeso() {
		return peso;
	}
}
