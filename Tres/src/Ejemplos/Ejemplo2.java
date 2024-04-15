package Ejemplos;

import java.util.Scanner;

public class Ejemplo2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int matematicas, lengua;
		
		System.out.println("Nota matematicas");
		matematicas = sc.nextInt();
		System.out.println("Nota lengua");
		lengua = sc.nextInt();
		
		if (matematicas >= 5) {
			if (lengua >= 5) {
				System.out.println("Las 2 aprobadas");
			} else {
				System.out.println("Mates aprobada y lengua no");
			}
		} else {
			if (lengua >= 5) {
				System.out.println("Lengua aprobada y mates no");
			} else {
				System.out.println("No has aprobado niguna de las asignaturas");
			}
		}
		
		if (matematicas >= 5 && lengua >= 5) {
			System.out.println("Las 2 aprobadas");
		} else if (matematicas >= 5 && lengua < 5){
			System.out.println("Mates aprobada y lengua no");
		} else if (lengua >= 5 && matematicas < 5) {
			System.out.println("Lengua aprobada y mates no");
		} else {
			System.out.println("No has aprobado niguna de las asignaturas");
		}
	}
}
