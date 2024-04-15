package Boletin2;

import java.util.Scanner;

/*10. Pedir 15 números y escribir la suma total.*/

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int acumulador = 0, suma = 0;
		
		while(acumulador!=15) {
			int num;
			System.out.println("Introduce numero");
			num=sc.nextInt();
			acumulador++;
			suma+=num;
			System.out.println("----------------");
		}
		System.out.println("La suma es " + suma);
	}
}
