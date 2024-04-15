package examenPro;

public class Persona {
	
	private String pais;
	private String apellido;
	private String Dni;
	private int edad;
	
	public Persona(String pais, String apellido, String dni, int edad) {
		super();
		this.pais = pais;
		this.apellido = apellido;
		Dni = dni;
		this.edad = edad;
	}
	
	

	public String getPais() {
		return pais;
	}



	public void setPais(String pais) {
		this.pais = pais;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getDni() {
		return Dni;
	}



	public void setDni(String dni) {
		Dni = dni;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	@Override
	public String toString() {
		return "Persona [pais=" + pais + ", apellido=" + apellido + ", Dni=" + Dni + ", edad=" + edad + "]";
	}
	
	
	
	
	
	
	
	

}
