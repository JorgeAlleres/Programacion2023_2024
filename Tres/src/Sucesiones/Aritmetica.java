package Sucesiones;

import java.util.Scanner;

public class Aritmetica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inicial, razon, terminos;
		
		System.out.println("Término inicial");
		inicial=sc.nextInt();
		
		System.out.println("Razón");
		razon=sc.nextInt();
		
		System.out.println("Nº Terminos");
		terminos=sc.nextInt();
		
		for(int i=inicial;i<=terminos;i=i+razon) {
			System.out.print(i + ", ");
		}
	}
}
