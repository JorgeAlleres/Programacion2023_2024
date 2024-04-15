package examenPro;

import java.util.Scanner;

public class Ejercicio3B {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una palabra:");
        String palabra = scanner.nextLine();

        String palabraEspejo = obtenerPalabraEspejo(palabra);

        System.out.println("Palabra con efecto espejo: " + palabraEspejo);
    }

    public static String obtenerPalabraEspejo(String palabra) {
        StringBuilder palabraEspejo = new StringBuilder(palabra);
        for (int i = palabra.length() - 2; i >= 0; i--) {
            palabraEspejo.append(palabra.charAt(i));
        }
        return palabraEspejo.toString();
    }

}
