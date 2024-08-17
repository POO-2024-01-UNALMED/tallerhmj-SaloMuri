package futbol;

import java.lang.Comparable;

public abstract class Futbolista implements Comparable<Object> {
	
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
		
	}
	
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	
	public abstract boolean jugarConLasManos();
	
	public boolean equals(Futbolista f) {
		boolean portero = false;
		if (f != null) {
			if (f == this) {
			portero = true;
			}
		}
		return portero;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getPosicion() {
		return posicion;
	}
	
	@Override
	public String toString() {
		return "El futbolista " + getNombre() + " tiene " + ", y juega de " + getPosicion();
	}
}