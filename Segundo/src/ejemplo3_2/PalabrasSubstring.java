package ejemplo3_2;

import java.util.Scanner;

public class PalabrasSubstring {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una frase de texto y pulsa retorno:");
		String texto = sc.nextLine();

		// Busca el primer y el último espacio en blanco.
		int inicioSubcadena = texto.indexOf(' ');
		int finSubcadena = texto.lastIndexOf(' ');
		System.out.println("El texto sin la primera y la última palabra 	es:");
		if (inicioSubcadena == finSubcadena) {
			// O bien no hay espacios (los dos método evalúan a -1).
			// O bien sólo hay dos palabras (los dos métodos evalúan la misma posición).
			// No se muestra nada.
			System.out.println("(No hay nada que escribir ...)");
		} else {
			// Se muestra la cadena intermedia.
			// La segunda palabra empieza una posición tras el primer espacio en blanco.
			// La última palabra comienza una posición después del último espacio en blanco.
			String textoFinal = texto.substring(inicioSubcadena + 1, finSubcadena);
			System.out.println(textoFinal);
		}
	}
}
