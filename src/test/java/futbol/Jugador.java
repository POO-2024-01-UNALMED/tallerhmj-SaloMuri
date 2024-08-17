package futbol;

import java.lang.Math;

public class Jugador extends Futbolista {
	
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	
	@Override
	public int compareTo(Object f) {
		Jugador otroJugador = (Jugador) f;
		return Math.abs(this.getEdad() - otroJugador.getEdad());
	}
	
	@Override
	public boolean jugarConLasManos() {
		return false;
	}
	
	@Override
	public String toString() {
		return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados;
	}
}
