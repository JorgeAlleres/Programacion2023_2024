package ejemplo3_2;

import java.util.Scanner;

public class Reto7 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();
        
        String[] palabras = frase.split(" ");
        StringBuilder acronimo = new StringBuilder();

        for (String palabra : palabras) {
            acronimo.append(palabra.charAt(0));
        }

        System.out.println("Acrónimo: " + acronimo);
    }
}
