package TiendaMascotas;

public class GatoPeloLargo extends Gato {

	public static final int PRECIO_DESPARASITACION = 200;
	
	public enum razaLargo {
		angora, himalayo, balines, somali
	}
	
	protected razaLargo Raza;

	public razaLargo getRaza() {
		return Raza;
	}

	public void setRaza(razaLargo raza) {
		Raza = raza;
	}

	GatoPeloLargo(String nombre, String color, int edad, double salto, double longitud, razaLargo raza) {
		super(nombre, color, edad, salto, longitud);
		Raza = raza;
	}

	@Override
	public String toString() {
		return super.toString() + ", GatoPeloLargo [Raza=" + Raza + "]";
	}
	
	protected int pagoImpuesto() {
		return super.pagoImpuesto()+PRECIO_DESPARASITACION;
	}
	
}
