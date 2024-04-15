package TiendaMascotas;


public class PerroMediano extends Perro {

	public static final int PRECIO_VACUNA = 125;
	
	public enum razaMediano {
		collie, dálmata, bulldog, galgo, sabueso
	}
	
	protected razaMediano Raza;

	public razaMediano getRaza() {
		return Raza;
	}

	public void setRaza(razaMediano raza) {
		Raza = raza;
	}

	PerroMediano(String nombre, String color, int edad, double peso, boolean muerde, razaMediano raza) {
		super(nombre, color, edad, peso, muerde);
		Raza = raza;
	}

	@Override
	public String toString() {
		return super.toString() + ", PerroMediano [Raza=" + Raza + "]";
	}
	
	protected int pagoImpuesto() {
		return super.pagoImpuesto()+PRECIO_VACUNA;
	}
}
