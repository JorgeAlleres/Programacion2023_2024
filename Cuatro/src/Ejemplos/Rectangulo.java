package Ejemplos;

public class Rectangulo implements Cloneable{

	private int ancho = 0;
	private int alto = 0;
	private String nombre;
	
	Rectangulo(Rectangulo r) {
		this.alto=r.alto;
		this.ancho=r.ancho;
		this.nombre=r.nombre;
	}
	
	public Rectangulo clone() {
		Object objeto = null;
		try {
			objeto = super.clone();
		} catch (CloneNotSupportedException ex) {
			System.out.println("Error al duplicar");
		}
		return (Rectangulo) objeto;
	}
	
	Rectangulo(int an, int al, String nombre) {
		this.ancho = an;
		this.alto = al;
		this.nombre=nombre;
	}

	public int getAncho() {
		return this.ancho;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public int getAlto() {
		return this.alto;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public Rectangulo incrementarAncho() {
		this.ancho++;
		return this;
	}

	public Rectangulo incrementarAlto() {
		this.alto++;
		return this;
	}

	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + ", nombre=" + nombre + "]";
	}

	
	
	
	
}
