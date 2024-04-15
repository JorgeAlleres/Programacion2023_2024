package Boletin2;

import java.util.Scanner;

/*8. Pedir un número N, y mostrar todos los números del 1 al N.*/

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduce numero");
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			System.out.print(i + ", ");
		}
	}
}
