package Resueltos;

import java.util.Scanner;

public class Armstrong {

	public static boolean armstrong(int numero) {
		int cifra1, cifra2, cifra3, resultado;
		
		cifra1 = numero / 100;
		cifra2 = (numero/10)%10;
		cifra3 = numero%10;
		resultado = (int) (Math.pow(cifra1, 3) + Math.pow(cifra2, 3) + Math.pow(cifra3, 3));
		if (resultado == numero)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Introduce número de 3 cifras");
		num=sc.nextInt();
		
		if (armstrong(num) == true)
			System.out.println("El número " + num + " es un número Armstrong");
		else 
			System.out.println("El número " + num + " no es un número Armstrong");
	}
}
