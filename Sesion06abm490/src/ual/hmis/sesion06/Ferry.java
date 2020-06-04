package ual.hmis.sesion06;

import java.util.ArrayList;

public class Ferry {
	private int numPasajeros, numVehiculos, maxVehiculos, maxPesoVehiculos;
	private double pesoTotal;
	private ArrayList<Vehiculo> vehiculos;
	
	public Ferry(int maxVehiculos, int maxPesoVehiculos) {
		this.maxVehiculos = maxVehiculos;
		this.maxPesoVehiculos = maxPesoVehiculos;
	
		numPasajeros = 0;
		numVehiculos = 0;
		pesoTotal = 0;
	
		vehiculos = new ArrayList<Vehiculo>();
	}
	
	public boolean embarcarVehiculo(Vehiculo v) {
	// Embarca un vehículo añadiéndolo a la lista
		if ((v == null) || (vehiculos.contains(v))) return false;
		vehiculos.add(v);
		numPasajeros += v.getNumPasajeros();
		numVehiculos++;
		pesoTotal += v.getPeso();
		return true;
		
	}
	public int totalVehiculos() {
	// devuelve el número total de vehículos embarcados
		return numVehiculos;
	}
	
	public boolean vacio() {
	// verdadero si no hay ningún vehículo
		return vehiculos.isEmpty();
	}
	
	public boolean superadoMaximoVehiculos() {
	  // verdadero si el número total de los vehículos supera el máximo
		return numVehiculos > maxVehiculos;
	}
	
	public boolean superadoMaximoPeso() {
	  // verdadero si el peso total de los vehículos supera el máximo
		return pesoTotal > maxPesoVehiculos;
	}
}
