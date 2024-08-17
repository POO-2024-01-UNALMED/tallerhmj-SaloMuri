package futbol;

public class Portero extends Futbolista{
	
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, String posicion, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	@Override
	public int compareTo(Object f) {
		Portero otroPortero = (Portero) f;
		return Math.abs(this.golesRecibidos - otroPortero.golesRecibidos);
	}
	
	@Override
	public boolean jugarConLasManos() {
		return true;
	}
	
	@Override
	public String toString() {
		return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos;
	}
	
}
