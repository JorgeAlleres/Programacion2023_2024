package SeleccionFutbolAbstracta;

public class Entrenador extends SeleccionFutbol {

	// Atributos
	private String licencia;

	// Constructores
	public Entrenador() {
		super();
	}

	public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
		super(id, nombre, apellidos, edad);
		this.licencia = idFederacion;
	}

	// Getters y Setters
	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	@Override
	public void entrenar() {
		System.out.println("Dirige un entrenamiento (CLASE ENTRENADOR)");
	}

	@Override
	public void jugarPartido() {
		System.out.println("Dirige un partido  (CLASE ENTRENADOR)");
	}

	// Metodo nuevo
	public void planificarEntrenamiento() {
		super.viajar();
		System.out.println("Planifica un entrenamiento");
	}

	// toString
	@Override
	public String toString() {
		return "Entrenador [licencia=" + licencia + ", id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", edad=" + edad + "]";
	}

}
