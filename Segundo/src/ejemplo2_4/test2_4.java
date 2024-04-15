package ejemplo2_4;

public class test2_4 {

	public static void main(String[] args) {
		Circulo figura1 = new Circulo("circulin", 2);
		Rectangulo figura2 = new Rectangulo("rectangulin", 1, 2);
		Cuadrado figura3 = new Cuadrado("cuadradin", 3);
		TrianguloRectangulo figura4 = new TrianguloRectangulo("triangulin", 3, 5);
		
		System.out.println();
		
		System.out.println(figura1.toString());
		System.out.println("Area: " + figura1.calcularArea());
		System.out.println("Perimetro: " + figura1.calcularPerimetro());
		
		System.out.println();
		
		System.out.println(figura2.toString());
		System.out.println("Area: " + figura2.calcularArea());
		System.out.println("Perimetro: " + figura2.calcularPerimetro());
		
		System.out.println();
		
		System.out.println(figura3.toString());
		System.out.println("Area: " + figura3.calcularArea());
		System.out.println("Perimetro: " + figura3.calcularPerimetro());
		
		System.out.println();
		
		System.out.println(figura4.toString());
		System.out.println("Area: " + figura4.calcularArea());
		System.out.println("Perimetro: " + figura4.calcularPerimetro());
		figura4.setTipoTriangulo();
	}
}
