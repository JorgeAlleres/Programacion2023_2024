package TiendaMascotas;

public class GatoPeloCorto extends Gato {

	public static final int PRECIO_DESPARASITACION = 100;
	
	public enum razaCorto {
		azul_ruso, britanico, manx, devon_rex
	}
	
	protected razaCorto Raza;

	public razaCorto getRaza() {
		return Raza;
	}

	public void setRaza(razaCorto raza) {
		Raza = raza;
	}
	
	GatoPeloCorto(String nombre, String color, int edad, double salto, double longitud, razaCorto raza) {
		super(nombre, color, edad, salto, longitud);
		Raza = raza;
	}

	@Override
	public String toString() {
		return super.toString() + ", GatoPeloCorto [Raza=" + Raza + "]";
	}
	
	protected int pagoImpuesto() {
		return super.pagoImpuesto()+PRECIO_DESPARASITACION;
	}
	
}
