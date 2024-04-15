package Resueltos;

public class Piramide {
	public static void main(String[] args) {

		System.out.println("Nuestra solución");
		
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 2 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("Solución libro");
		
		int i, j, k;
		for (i = 1; i <= 3; i++) { // bucle que cuenta hasta 10
			for (k = 1; k <= 3 - i; k++) {
				System.out.print(" ");
			}
			for (j = 1; j <= 2 * (i - 1) + 1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}