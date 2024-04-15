package SeleccionFutbol;

public class Entrenador extends SeleccionFutbol {

	//Atributos
	private String licencia;

	//Constructores
	public Entrenador() {
		super();
	}

	public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
		super(id, nombre, apellidos, edad);
		this.licencia = idFederacion;
	}

	//Getters y Setters
	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	//Metodos propios de la clase
	public void dirigirPartido() {
		System.out.println("Dirige un partido");
	}

	public void dirigirEntrenamiento() {
		System.out.println("Dirige un entrenamiento");
	}

	//Sobreescribo el metodo viajar para especificar mas
	@Override
	public void viajar() {
		super.viajar();
		System.out.println(" con un guiskito");
	}
	
	//toString
	@Override
	public String toString() {
		return "Entrenador [licencia=" + licencia + ", id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", edad=" + edad + "]";
	}

}
