package TiendaMascotas;

public class PerroPequeño extends Perro {

	public static final int PRECIO_VACUNA = 100;
	
	public enum razaPequeño {
		caniche, yorkshire, terrier, schnauzer, chihuahua
	}
	
	protected razaPequeño Raza;

	public razaPequeño getRaza() {
		return Raza;
	}

	public void setRaza(razaPequeño raza) {
		Raza = raza;
	}

	PerroPequeño(String nombre, String color, int edad, double peso, boolean muerde, razaPequeño raza) {
		super(nombre, color, edad, peso, muerde);
		Raza = raza;
	}

	@Override
	public String toString() {
		return super.toString() + ", PeroPequeño [Raza=" + Raza + "]";
	}
	
	protected int pagoImpuesto() {
		return super.pagoImpuesto()+PRECIO_VACUNA;
	}
}
