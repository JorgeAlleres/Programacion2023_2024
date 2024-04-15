package Condicionales;

public class Ejemplo11 {

	public static void main(String[] args) {

		int resultado;

		// Tablas del 1 al 10

		int numero = 1;

		while (numero <= 10) {
			System.out.println("Tabla del " + numero);
			int i = 1;
			while (i <= 10) {
				resultado = numero * i;
				System.out.println(numero + " x " + i + " = " + resultado);
				i++;
			}
			numero++;
			System.out.println();
		}
		System.out.println("Fin de codigo");

	}
}