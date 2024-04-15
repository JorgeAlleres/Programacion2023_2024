package SeleccionFutbolAbstracta;

public class Futbolista extends SeleccionFutbol {

	// Atributos
	private int dorsal;
	private String demarcacion;

	// Constructores
	public Futbolista() {
		super();
	}

	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	// Getters y setters
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	@Override
	public void entrenar() {
		System.out.println("Realiza un entrenamiento (CLASE FUTBOLISTA)");
	}
	
	@Override
	public void jugarPartido() {
		System.out.println("Juega un partido (CLASE FUTBOLISTA)");
	}

	// Porpio nuevo
	public void entrevista() {
		System.out.println("Da una entrevista");
	}

	// toString
	@Override
	public String toString() {
		return "Futbolista [dorsal=" + dorsal + ", demarcacion=" + demarcacion + ", id=" + id + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

}
