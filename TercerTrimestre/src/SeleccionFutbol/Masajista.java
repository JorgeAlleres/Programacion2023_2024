package SeleccionFutbol;

public class Masajista extends SeleccionFutbol {

	//Atributos
	private String titulacion;
	private int aniosExperiencia;

	// Constructor
	public Masajista() {
		super();
	}

	public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
		super(id, nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}

	//Getters y Setters
	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	//Metodos propios de la clase
	public void darMasaje() {
		System.out.println("Da un Masaje");
	}

	//toString
	@Override
	public String toString() {
		return "Masajista [titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + ", id=" + id
				+ ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}
	
}
