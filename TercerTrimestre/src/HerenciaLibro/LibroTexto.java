package HerenciaLibro;

public class LibroTexto extends Libro{
	
	protected String curso;
	
	LibroTexto(String titulo, String autor, float precio, String curso) {
		super(titulo, autor, precio);
		this.curso=curso;
	}
	
	LibroTexto(String titulo, String autor, String curso) {
		super(titulo, autor);
		this.curso=curso;
	}

	@Override
	public String toString() {
		return "LibroTexto [curso=" + curso + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}
	
	
	
}
