package ejemplo2_4;

public class TrianguloRectangulo extends Figura {

	enum TipoTriangulo {
		EQUILATERO, ESCALENO, ISOSCELES
	}

	TipoTriangulo tipo;
	int base; // Atributo que define la base de un triángulo rectángulo
	int altura; // Atributo que define la altura de un triángulo rectángulo

	public TrianguloRectangulo(String nombre, int base, int altura) {
		super(nombre);
		this.base = base;
		this.altura = altura;
		setTipoTriangulo();
	}

	double calcularArea() {
		return (base * altura / 2);
	}

	double calcularPerimetro() {
		return (base + altura + calculaHipotenusa());
	}

	public double calculaHipotenusa() {
		return Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
	}

	void setTipoTriangulo() {
		if ((base == altura) && (base == calculaHipotenusa()) && (altura == calculaHipotenusa())) {
			System.out.println("Es un triángulo equilátero");
			this.tipo = TipoTriangulo.EQUILATERO;
		} else if ((base != altura) && (base != calculaHipotenusa()) && (altura != calculaHipotenusa())) {
			System.out.println("Es un triángulo escaleno");
			this.tipo = TipoTriangulo.ESCALENO;
		} else {
			System.out.println("Es un triángulo isósceles");
			this.tipo = TipoTriangulo.ISOSCELES;
		}
	}

	public TipoTriangulo getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "TrianguloRectangulo [tipo=" + tipo + ", base=" + base + ", altura=" + altura + ", nombre=" + nombre
				+ "]";
	}

}