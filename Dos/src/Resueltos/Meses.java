package Resueltos;

import java.util.Scanner;

public class Meses {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int mes;

		System.out.println("Introduce número de mes");
		mes = sc.nextInt();

		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("Tiene 31 días");
			break;
		case 2:
			System.out.println("Tiene 28/29 días");
			break;
		case 4, 6, 9, 11:
			System.out.println("Tiene 30 días");
			break;
		default:
			System.out.println("Valor no válido");
		}

	}
}
