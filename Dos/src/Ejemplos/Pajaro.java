package Ejemplos;

public class Pajaro {

	// *** atributos o propiedades ****
	private char color; // propiedad o atributo color
	private int edad; // propiedad o atributo edad
	private String nombre; // propiedad o atributo nombre
	
	//Constructor por defecto
	Pajaro(){
		
	}
	
	//Constructor con un parámetro
	Pajaro(String n) {
		this.nombre=n;
	}
	
	//Constructor con todos los parámetros
	Pajaro(char c, int e, String n) {
		this.color=c;
		this.edad=e;
		this.nombre=n;
	}
	
	// *** métodos de la clase ****
	public void setEdad(int e) {
		this.edad = e;
	}

	public void setNombre(String n) {
		this.nombre = n;
	}

	public void setColor(char c) {
		this.color = c;
	}

	public char getColor() {
		return this.color;
	}

	public int getEdad() {
		return this.edad;
	}

	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String toString() {
		return "Pajaro [color=" + color + ", edad=" + edad + ", nombre=" + nombre + "]";
	}
	
}