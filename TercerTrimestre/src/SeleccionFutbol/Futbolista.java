package SeleccionFutbol;

public class Futbolista extends SeleccionFutbol {

	//Atributos
	private int dorsal;
	private String demarcacion;

	//Constructores
	public Futbolista() {
		super();
	}

	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	//Getters y setters
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
	
	//Metodos propios de la clase
	public void jugarPartido() {
		System.out.println("Juega un partido");
	}
	
	public void entrenar() {
		System.out.println("Entrena");
	}

	//Sobreescribo el metodo viajar para especificar mas
	@Override
	public void viajar() {
		super.viajar();
		System.out.println(" con los cascos puestos");
	}
	
	//toString
	@Override
	public String toString() {
		return "Futbolista [dorsal=" + dorsal + ", demarcacion=" + demarcacion + ", id=" + id + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

}
