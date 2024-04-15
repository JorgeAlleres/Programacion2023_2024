package TiendaMascotas;

public class Perro extends Mascota {

	public static final int PRECIO_CHIP = 100;
	
	protected double peso;
	protected boolean muerde;
	
	Perro(String nombre, String color, int edad, double peso, boolean muerde) {
		super(nombre, color, edad);
		this.peso = peso;
		this.muerde = muerde;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isMuerde() {
		return muerde;
	}

	public void setMuerde(boolean muerde) {
		this.muerde = muerde;
	}

	@Override
	public String toString() {
		return super.toString() + ", Perro [peso=" + peso + ", muerde=" + muerde + "]";
	}

	@Override
	protected void sonido() {
		System.out.println("Estoy haciendo sonido de perro");
	}

	public void ladrar() {
		System.out.println("Guau guau");
	}
	
	protected int pagoImpuesto() {
		return super.pagoImpuesto()+PRECIO_CHIP;
	}
}
