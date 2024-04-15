package TiendaMascotas;

public class Gato extends Mascota {

	public static final int PRECIO_CHIP = 75;
	
	protected double salto;
	protected double longitud;
	
	Gato(String nombre, String color, int edad, double salto, double longitud) {
		super(nombre, color, edad);
		this.salto=salto;
		this.longitud=this.salto=salto;;
	}
	
	public double getSalto() {
		return salto;
	}

	public void setSalto(double salto) {
		this.salto = salto;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return super.toString() + ", Gato [salto=" + salto + ", longitud=" + longitud + "]";
	}

	@Override
	protected void sonido() {
		System.out.println("Estoy haciendo sonido de gato");
	}
	
	public void maullar() {
		System.out.println("Miau Miau");
	}
	
	protected int pagoImpuesto() {
		return super.pagoImpuesto()+PRECIO_CHIP;
	}
}
