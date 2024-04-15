package Resueltos;

import java.util.Scanner;

public class Piramide2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce numero de estrellas máximas");
		int estrellas=sc.nextInt();
		
		int i, j, k;
		for (i=0; i <= estrellas; i++) {
			for (k = 1; k <= estrellas - i; k++) {
				System.out.print(" ");
			}
			for (j = 1; j <= 2 * (i - 1) + 1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
