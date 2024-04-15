package Ejercicio2B;

public class Ejercicio2B {

	public static void main(String[] args) {
		// Encontrar y mostrar números gemelos en el rango
		System.out.println("Números gemelos en el rango [" + 0 + ", " + 1000 + "]:");
		encontrarNumerosGemelos(0, 1000);
	}

	// Método para verificar si un número es primo
	private static boolean esPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Método para encontrar y mostrar números gemelos en un rango
	private static void encontrarNumerosGemelos(int minimo, int maximo) {
		for (int i = minimo; i <= maximo - 2; i++) {
			if (esPrimo(i) && esPrimo(i + 2)) {
				System.out.println("(" + i + ", " + (i + 2) + ")");
			}
		}
	}
}
