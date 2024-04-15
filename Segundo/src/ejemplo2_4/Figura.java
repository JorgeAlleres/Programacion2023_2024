package ejemplo2_4;

public class Figura {

	//Atributo
	String nombre;
	
	Figura() {
		this.nombre="";
	}
	
	Figura(String nombre) {
		this.nombre=nombre;
	}
	
	double calcularPerimetro() {
		return 0d;
	}
	
	double calcularArea() {
		return 0d;
	}

	@Override
	public String toString() {
		return "Figura [nombre=" + nombre + "]";
	}
	
 }
