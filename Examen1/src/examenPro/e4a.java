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
	        texto.chars()
	        .filter(Character::isLetter)
	        .forEach(letra -> {
	            char charLetra = (char) letra;
	            if (contador.containsKey(charLetra)) {
	                contador.put(charLetra, contador.get(charLetra) + 1);
	            } else {
	                contador.put(charLetra, 1);
	            }
	        });
	        char letrasMasRepetidas[]= new char[3];
	        int toprepeticiones[]= new int[3];
	        for (Map.Entry<Character, Integer> entry : contador.entrySet()) {
	            int repeticiones = entry.getValue();
	            char letra = entry.getKey();
	            for (int i = 0; i < 3; i++) {
	                if (repeticiones > toprepeticiones[i]) {
	                    for (int j = 2; j > i; j--) {
	                        toprepeticiones[j] = toprepeticiones[j - 1];
	                        letrasMasRepetidas[j] = letrasMasRepetidas[j - 1];
	                    }
	                    toprepeticiones[i] = repeticiones;
	                    letrasMasRepetidas[i] = letra;
	                    break;
	                }
	            }
	        }
	        System.out.println("Las tres letras que han aparecido más veces en el texto son:");
	        for (int i = 0; i < 3; i++) {
	            System.out.println(letrasMasRepetidas[i] + ": " + toprepeticiones[i] + " veces");
	    }
	}
}
