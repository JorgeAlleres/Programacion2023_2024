package TiendaMascotas;

public class Mascota {

	public static final int PRECIO_CARNET = 50;
	
	protected String nombre;
	protected String color;
	protected int edad;
	
	Mascota(String nombre, String color, int edad) {
		this.nombre = nombre;
		this.color = color;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", color=" + color + ", edad=" + edad + "]";
	}
	
	protected void sonido() {
		
	}
	
	protected int pagoImpuesto() {
		return PRECIO_CARNET;
	}
	
}
