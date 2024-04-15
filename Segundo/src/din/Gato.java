package din;

import java.util.Objects;

public class Gato implements Comparable<Gato> {

	private String nombre;
	private String color;
	private String raza;

	public Gato(String nombre, String color, String raza) {
		this.nombre = nombre;
		this.color = color;
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public String getRaza() {
		return raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", color=" + color + ", raza=" + raza + "]";
	}

	public int compareTo(Gato g) {
		return (this.nombre).compareTo(g.getNombre());
	}

	public boolean equals(Gato g) {
		return (this.nombre).equals(g.getNombre());
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, nombre, raza);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(color, other.color) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(raza, other.raza);
	}
	
}
