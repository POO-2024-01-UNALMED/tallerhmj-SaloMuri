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
		if (f instanceof Portero) {
			Portero otroPortero = (Portero) f;
			return Integer.compare(this.golesRecibidos, otroPortero.golesRecibidos);
		}else {
			return this.getEdad();
		}
	}
	
	@Override
	public boolean jugarConLasManos() {
		return true;
	}
	
	@Override
	public String toString() {
		return "El futbolista " + super.getNombre() + " tiene " + super.getEdad() + ", y juega de " + super.getPosicion() + " con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos;
	}
	
}
