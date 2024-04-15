package Ejercicio5B;

import java.util.Scanner;

/*Ingresar una cadena y determinar cuántas palabras se encuentran en
la cadena. Cada palabra se separa por medio de un espacio en
blanco.
Mostrar la misma cadena pera con las palabras en sentido inverso*/
public class Ejercicio5B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena;
		int contarPalabras = 1;
		
		System.out.println("Introduce la frase para contar las palabras");
		cadena = sc.nextLine();
		if(cadena=="")
			System.out.println("No has introducido nunguna palabra");
		else {
			for (int j = 0; j < cadena.length(); j++) {
				if(cadena.charAt(j)==' ') {
					contarPalabras++;
				}
			}
			System.out.println("Nº de palabras contadas:");
			System.out.println(contarPalabras);
		}
		
		char[] caracteres = cadena.toCharArray();
		String vuelta = "";

		for (int i = caracteres.length-1; i >= 0; i--)
			vuelta += caracteres[i];
		
		System.out.println("Cadena dada la vuelta:");
		System.out.println(vuelta);
	}
}
