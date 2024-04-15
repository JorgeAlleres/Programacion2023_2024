package Boletin2;

import java.util.Scanner;

/*12. Pedir un número y calcular su factorial.*/

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num, factorial=1;
		
		System.out.println("Intoduce numero");
		num=sc.nextInt();
		
		for(int i=1; i<=num;i++) {
			factorial=factorial*i;
		}
		System.out.println("El factorial es " + factorial);
	}
}
