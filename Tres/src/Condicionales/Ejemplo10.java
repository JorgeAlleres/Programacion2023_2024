package Condicionales;

public class Ejemplo10 {

	// Mostrar todas las tablas desde al del 1 hasta la del 10 una detras de otra
	public static void main(String[] args) {

		int resultado;

		// Tablas del 1 al 10

		for (int numero = 1; numero <= 10; numero++) {
			System.out.println("Tabla del " + numero);
			for (int i = 1; i <= 10; i++) {
				resultado = numero * i;
				System.out.println(numero + " x " + i + " = " + resultado);
			}
			System.out.println();
		}
		System.out.println("Fin de codigo 1");
		
		System.out.println();

		// Tablas del 1 al 10 mostranso para la del 1 1 resultado, para la del 2 2
		// resultados...

		for (int numero = 1; numero <= 10; numero++) {
			System.out.println("Tabla del " + numero);
			for (int i = 1; i <= numero; i++) {
				resultado = numero * i;
				System.out.println(numero + " x " + i + " = " + resultado);
			}
			System.out.println();
		}
		System.out.println("Fin de codigo");
	}
}
