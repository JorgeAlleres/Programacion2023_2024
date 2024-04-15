package examenPro;

import java.util.Scanner;

public class Ejercicio3A {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Introduce la primera cadena:");
	        String cadena1 = scanner.nextLine();

	        System.out.println("Introduce la segunda cadena:");
	        String cadena2 = scanner.nextLine();

	        String[] palabrasCadena1 = cadena1.split(" ");
	        String[] palabrasCadena2 = cadena2.split(" ");

	        StringBuilder cadenaInterpolada = new StringBuilder();
	        int maxLength = Math.max(palabrasCadena1.length, palabrasCadena2.length);

	        for (int i = 0; i < maxLength; i++) {
	            if (i < palabrasCadena1.length) {
	                cadenaInterpolada.append(palabrasCadena1[i]).append(" ");
	            }
	            if (i < palabrasCadena2.length) {
	                cadenaInterpolada.append(palabrasCadena2[i]).append(" ");
	            }
	        }

	        System.out.println("Cadena intercalada:");
	        System.out.println(cadenaInterpolada.toString().trim());
	    }

}
