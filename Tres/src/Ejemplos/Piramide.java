package Ejemplos;

public class Piramide {

	public static void main(String[] args) {

		int i = 0;
		bucleext: while (i < 100) {
			i++;
			for (int j = 0; j < i; j++) {
				System.out.print("*");
				if (i == 5) {
					break bucleext;
				}
			}
			System.out.println("");
		}
	}
}
