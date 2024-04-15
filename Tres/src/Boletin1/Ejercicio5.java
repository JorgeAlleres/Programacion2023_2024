package Boletin1;

import java.util.Scanner;

/*Realizar un juego para  adivinar un número. Para ello pedir un número N, y luego ir pidiendo números indicando "mayor" o "menor"
 según sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta. */

public class Ejercicio5 {

	public static void esMayoroMenor(int num, int random) {
		if (random > num)
			System.out.println("Mayor");
		if (random < num)
			System.out.println("Menor");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num, random;
		
		random=(int) (Math.random()*100);
		
		do {
			System.out.println("Introduce número");
			num = sc.nextInt();
			esMayoroMenor(num, random);
			System.out.println("-----------------");
		} while (random!=num);
	}
}
