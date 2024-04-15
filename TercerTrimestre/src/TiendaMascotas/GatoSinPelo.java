package TiendaMascotas;

public class GatoSinPelo extends Gato {

	public static final int PRECIO_DESPARASITACION = 50;
	
	public enum razaSinPelo {
		esfinge, elfo, donskoy
	}
	
	protected razaSinPelo Raza;

	public razaSinPelo getRaza() {
		return Raza;
	}

	public void setRaza(razaSinPelo raza) {
		Raza = raza;
	}

	GatoSinPelo(String nombre, String color, int edad, double salto, double longitud, razaSinPelo raza) {
		super(nombre, color, edad, salto, longitud);
		Raza = raza;
	}

	@Override
	public String toString() {
		return super.toString() + ", GatoSinPelo [Raza=" + Raza + "]";
	}
	
	protected int pagoImpuesto() {
		return super.pagoImpuesto()+PRECIO_DESPARASITACION;
	}
	
}
