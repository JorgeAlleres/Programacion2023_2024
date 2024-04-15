package ExamenT2A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

//Ingrese un texto de al menos 6 palabras e indique qué tres letras
//han aparecido en el texto más veces, indicando las mismas.

public class ejercicio4 {

	static Scanner sc = new Scanner(System.in);
	static Map<Character, Integer> letras = new HashMap();

	public static void main(String[] args) {
		System.out.println("Dime un texto");
		String texto = sc.nextLine();

		char[] textoArray = texto.toCharArray();

		for (char c : textoArray) {
			if (letras.containsKey(c)) {
				letras.replace(c, letras.get(c) + 1);
			} else {
				letras.put(c, 1);
			}
		}

		char[] letrasArray = new char[letras.size()];
		int[] contadorArray = new int[letras.size()];

		int cont = 0;
		for (Entry e : letras.entrySet()) {
			System.out.println(e.getKey().toString());
			letrasArray[cont] = (char) e.getKey();
			contadorArray[cont] = (int) e.getValue();
			cont++;
		}

		System.out.println(Arrays.toString(letrasArray));
		System.out.println(Arrays.toString(contadorArray));

		// Ordenamiento brubuja pillado de internet a palo seco y modificado con otro array
		boolean swapped = true;
		for (int i = contadorArray.length - 1; i > 0 && swapped; i--) {
			swapped = false;
			for (int j = 0; j < i; j++) {
				if (contadorArray[j] > contadorArray[j + 1]) {
					int temp = contadorArray[j];
					contadorArray[j] = contadorArray[j + 1];
					contadorArray[j + 1] = temp;
					var tempChar = letrasArray[j];
					letrasArray[j] = letrasArray[j + 1];
					letrasArray[j + 1] = tempChar;
					swapped = true;
				}
			}
		}
		// end

		for (int i = letrasArray.length - 1, cont2 = 0; i > 0 && cont2 < 3; i--) {
			if (letrasArray[i] != ' ') {
				System.out.println("Letra :" + letrasArray[i] + " veces: " + contadorArray[i]);
				cont2++;
			}

		}
	}
}
