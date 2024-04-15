package Propuestos;

import java.util.Scanner;

public class LuckyNumber {

	private static int sumaDigitos(int n) {
		int n1, n2, n3, n4, total;
		
		n1 = n / 1000;
		n2 = n / 100 % 10;
		n3 = n / 10 % 10;
		n4 = n / 1 % 10;
		total = n1 + n2 + n3 + n4;
		
		return total;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame dia:");
		int dia = sc.nextInt();
		System.out.println("Dame mes:");
		int mes = sc.nextInt();
		System.out.println("Dame año:");
		int año = sc.nextInt();
		
		int suma = dia + mes + año;
		
		int lucky=sumaDigitos(suma);
		
		while(lucky>9) {
			lucky=sumaDigitos(lucky);
		}
	}
}
