package Ejemplos;

public class libroRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo(5, 7, "");
		Rectangulo r2 = r1.clone();
		r2.incrementarAncho();
		r2.incrementarAlto();
		r1.setNombre("Chiquito");
		r2.setNombre("Grande");
		System.out.println("Alto " + r1.getAlto());
		System.out.println("Alto " + r2.getAlto());
		System.out.println("Ancho "  + r1.getAncho());
		System.out.println("Ancho "  + r2.getAncho());
		System.out.println("Nombre "  + r1.getNombre());
		System.out.println("Nombre " + r2.getNombre());
	}
}
