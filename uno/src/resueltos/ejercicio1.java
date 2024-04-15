package resueltos;

import java.util.Scanner;

public class ejercicio1 {

	public static char getLetras() {
		return (char)('a' + Math.random()*26);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char letra;
		int contador = 0;
		
		System.out.println("Introduce un caracter");
		letra = sc.nextLine().charAt(0);
		
		System.out.println("Su letra a buscar es: " + letra);
		
		for(int i=1; i<=100; i++)	{
			System.out.println(getLetras());
			if(letra == getLetras()) {
				contador++;
			}
		}
		System.out.println("La letra " + letra + " sale: " + contador + " veces");
	}
}