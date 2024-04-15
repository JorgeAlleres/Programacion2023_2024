package HerenciaLibro;

import java.util.Objects;

public class Libro {

	//Atributos
	protected String titulo;
	protected String autor;
	protected float precio;
	
	//Constructor con todos los parametros
	Libro(String titulo, String autor, float precio) {
		this.titulo=titulo;
		this.autor=autor;
		this.precio=precio;
	}
	
	//Constructor con dos de los parametros
	Libro(String titulo, String autor) {
		this.titulo=titulo;
		this.autor=autor;
	}

	//Getters y Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	//Equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(titulo, other.titulo);
	}

	//ToString
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}
	
}
