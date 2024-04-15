package TiendaMascotas;

public class PerroGrande extends Perro {

	public static final int PRECIO_VACUNA = 150;
	
	public enum razaGrande {
		pastor_aleman, doberman, rotweiller
	}
	
	protected razaGrande Raza;

	public razaGrande getRaza() {
		return Raza;
	}

	public void setRaza(razaGrande raza) {
		Raza = raza;
	}

	PerroGrande(String nombre, String color, int edad, double peso, boolean muerde, razaGrande raza) {
		super(nombre, color, edad, peso, muerde);
		Raza = raza;
	}

	@Override
	public String toString() {
		return super.toString() + ", PerroGrande [Raza=" + Raza + "]";
	}
	
	protected int pagoImpuesto() {
		return super.pagoImpuesto()+PRECIO_VACUNA;
	}
	
}
