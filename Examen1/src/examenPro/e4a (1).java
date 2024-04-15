package A;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Ingrese un texto de al menos 6 palabras e indique qué tres letras
han aparecido en el texto más veces, indicando las mismas.*/

public class e4a {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese un texto de al menos 6 palabras:");
	        String texto = scanner.nextLine().toLowerCase();
	        
	        if (texto.split("\\s+").length < 6) {
	            System.out.println("El texto debe contener al menos 6 palabras.");
	            return;
	        }

	        Map<Character, Integer> contador = new HashMap<>();

	        // Contar la aparición de cada letra en el texto
	        for (char letra : texto.toCharArray()) {
	            if (Character.isLetter(letra)) {
	                contador.put(letra, contador.getOrDefault(letra, 0) + 1);
	            }
	        }

	        // Encontrar las tres letras que aparecen más veces
	        char[] letrasMasComunes = new char[3];
	        int[] frecuencias = new int[3];
	        
	        for (Map.Entry<Character, Integer> entry : contador.entrySet()) {
	            int frecuencia = entry.getValue();
	            char letra = entry.getKey();
	            
	            for (int i = 0; i < 3; i++) {
	                if (frecuencia > frecuencias[i]) {
	                    for (int j = 2; j > i; j--) {
	                        frecuencias[j] = frecuencias[j - 1];
	                        letrasMasComunes[j] = letrasMasComunes[j - 1];
	                    }
	                    frecuencias[i] = frecuencia;
	                    letrasMasComunes[i] = letra;
	                    break;
	                }
	            }
	        }

	        // Mostrar las tres letras más comunes
	        System.out.println("Las tres letras que han aparecido más veces en el texto son:");
	        for (int i = 0; i < 3; i++) {
	            System.out.println(letrasMasComunes[i] + ": " + frecuencias[i] + " veces");
	    }
	}
}
