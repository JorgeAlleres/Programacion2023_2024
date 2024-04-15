package HerenciaLibro;

public class LibroTextoUNC extends LibroTexto{


	private String facultad;
	
	LibroTextoUNC(String titulo, String autor, float precio, String curso, String facultad) {
		super(titulo, autor, precio, curso);
		this.facultad=facultad;
	}
	
	LibroTextoUNC(String titulo, String autor, String curso, String facultad) {
		super(titulo, autor, curso);
		this.facultad=facultad;
	}

	@Override
	public String toString() {
		return "LibroTextoUNC [facultad=" + facultad + ", curso=" + curso + ", titulo=" + titulo + ", autor=" + autor
				+ ", precio=" + precio + "]";
	}
	
	
}
