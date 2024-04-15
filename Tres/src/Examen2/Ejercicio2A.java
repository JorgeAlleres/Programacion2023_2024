package Examen2;

import java.util.Scanner;

public class Ejercicio2A {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int juegosA, juegosB;
		
		System.out.println("Juegos del jugador A");
		juegosA=sc.nextInt();
		System.out.println("Juegos del jugador B");
		juegosB=sc.nextInt();
		
		if(juegosA>juegosB) {
			if(juegosA==6) {
				System.out.println("Jugador 1 ganó");
			} else if(juegosA==7 && (juegosB==5 || juegosB==6)) {
				System.out.println("Jugador 1 ganó");
			}
		}
		if (juegosB>juegosA) {
			if(juegosB==6) {
				System.out.println("Jugador 2 ganó");
			} else if(juegosB==7 && (juegosA==5 || juegosA==6)) {
				System.out.println("Jugador 2 ganó");
			}
		}
		
		if(juegosB<6 || juegosA<6)
			System.out.println("El set todavía está en juego");
		else
			System.out.println("Resultado no válido");
		
	}
}
