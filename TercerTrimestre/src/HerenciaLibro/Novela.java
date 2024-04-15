package HerenciaLibro;

public class Novela extends Libro{

	enum Genero {
		HISTORICA,ROMANTICA,POLICIACA,REALISTA,CIENCIA_FICCION,AVENTURAS
	}

	Genero genero;
	
	Novela(String titulo, String autor, float precio, Genero genero) {
		super(titulo, autor, precio);
		this.genero=genero;
	}

	Novela(String titulo, String autor, Genero genero) {
		super(titulo, autor);
		this.genero=genero;
	}

	@Override
	public String toString() {
		return "Novela [genero=" + genero + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}
	
	
}
