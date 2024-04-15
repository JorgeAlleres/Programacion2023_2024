package Ejemplos;

public class testRectangulo {

	public static void main(String[] args) {
		
		Rectangulo uno = new Rectangulo(3, 5, "");
		
		System.out.println("ancho: " + uno.getAncho());
		System.out.println("alto: " + uno.getAlto());
		System.out.println(uno.toString());
		uno.incrementarAlto();
		uno.incrementarAlto();
		uno.incrementarAlto();
		uno.incrementarAlto();
		uno.incrementarAncho(); 
		System.out.println("ancho: " + uno.getAncho());
		System.out.println("alto: " + uno.getAlto());
	}
}
