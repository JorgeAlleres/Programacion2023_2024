package ejemplo3_2;

import java.util.Scanner;

public class LecturaFrases {
	public static final int NUM_FRASES = 4;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe " + NUM_FRASES + " frases.");
		System.out.println("Para terminar una frase, pulsa la tecla de retorno.");
		for (int i = 0; i < NUM_FRASES; i++) {// Va leyendo frases una por una.
			String frase = sc.nextLine();
			System.out.println("Frase " + i + ": Has escrito \" " + frase + "\".");
		}
	}
}