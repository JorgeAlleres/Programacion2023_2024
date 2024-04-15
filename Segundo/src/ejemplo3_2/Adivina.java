package ejemplo3_2;

import java.util.Scanner;

public class Adivina {
	// La palabra para adivinar es "java".
	public static final String PALABRA_SECRETA = generPalabra();

	public static String generPalabra() {
		// 5 caracteres minusculas
		String pal = "";
		for (int j = 0; j < 5; j++) {
			char ran = (char) (97 + Math.random() * 26);
			pal += ran;
		}
		return pal;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Empezamos el juego.");
		System.out.println("Adivina la palabra: ");
		int veces = 0;
		boolean correcto = false;
		while (!correcto || veces <= 10) {
			veces++;
			System.out.print("¿Qué palabra crees que es?");
			String palabra = sc.next();
			sc.nextLine();
			int comp = palabra.compareTo(PALABRA_SECRETA);
			if (comp < 0) {// La palabra del usuario es anterior a la secreta.
				System.out.println("Has fallado! La palabra va después alfabeticamente");
			} else if (comp > 0) {
				// La palabra del usuario es posterior a la secreta
				System.out.println("Has fallado! La palabra va antes alfabeticamente");
			} else {
				// Si vale 0, es que se ha acertado.
				correcto = true;
			}
		}
		System.out.println("Enhorabuena. Has acertado! en " + veces + " intentos.");
	}
}