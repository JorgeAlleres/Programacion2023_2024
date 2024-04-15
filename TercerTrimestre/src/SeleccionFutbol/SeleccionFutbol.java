package SeleccionFutbol;

public class SeleccionFutbol {

	//Atributos
	protected int id;
	protected String nombre;
	protected String apellidos;
	protected int edad;
	
	//constructores
	public SeleccionFutbol() {
		
	}
	
	public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
		this.id=id;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
	}

	//Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//Metodos propios de la clase
	public void concentrarse() {
		System.out.println("Concentrarse");
	}
	
	public void viajar() {
		System.out.println("Viajar");
	}

	//toString
	@Override
	public String toString() {
		return "SeleccionFutbol [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}
	
	
	
}
