package examenPro;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio4A {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un texto de al menos 6 palabras:");
        String texto = scanner.nextLine();

        Map<Character, Integer> frecuenciaLetras = new HashMap<>();

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (Character.isLetter(letra)) {
                frecuenciaLetras.put(letra, frecuenciaLetras.getOrDefault(letra, 0) + 1);
            }
        }

        char letraMasRecurrente1 = ' ';
        char letraMasRecurrente2 = ' ';
        char letraMasRecurrente3 = ' ';
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;

        for (Map.Entry<Character, Integer> entry : frecuenciaLetras.entrySet()) {
            int frecuencia = entry.getValue();
            if (frecuencia > max1) {
                max3 = max2;
                letraMasRecurrente3 = letraMasRecurrente2;
                max2 = max1;
                letraMasRecurrente2 = letraMasRecurrente1;
                max1 = frecuencia;
                letraMasRecurrente1 = entry.getKey();
            } else if (frecuencia > max2) {
                max3 = max2;
                letraMasRecurrente3 = letraMasRecurrente2;
                max2 = frecuencia;
                letraMasRecurrente2 = entry.getKey();
            } else if (frecuencia > max3) {
                max3 = frecuencia;
                letraMasRecurrente3 = entry.getKey();
            }
        }

        System.out.println("Las tres letras más recurrentes son:");
        System.out.println("1: " + letraMasRecurrente1 + " aparece " + max1 + " veces.");
        System.out.println("2: " + letraMasRecurrente2 + " aparece " + max2 + " veces.");
        System.out.println("3: " + letraMasRecurrente3 + " aparece " + max3 + " veces.");
    }

}
