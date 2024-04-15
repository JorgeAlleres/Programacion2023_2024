package Caja;

public class Caja {

	public int base;
	public int anchura;
	public int altura;
	
	public String tipo;
	
	Caja(int base, int anchura, int altura) {
		this.base = base;
		this.anchura = anchura;
		this.altura = altura;
	}
	
	Caja() {
		this.base = 0;
		this.anchura = 0;
		this.altura = 0;
	}
	
	Caja(int longitud) {
		this.base = longitud;
		this.anchura = longitud;
		this.altura = longitud;
	}
	
	Caja(Caja caja, String tipo) {
		super();
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Caja [base=" + base + ", anchura=" + anchura + ", altura=" + altura + ", tipo=" + tipo + "]";
	}
	
}
