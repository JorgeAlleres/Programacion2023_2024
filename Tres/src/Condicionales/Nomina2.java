package Condicionales;

import java.util.Scanner;

public class Nomina2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double nomina, nomina_final = 0;
		char productividad, encargado, infraccion;

		System.out.println("Introduce nomina");
		nomina = sc.nextDouble();

		System.out.println("¿Cometó infracción? R:(Si o No)");
		infraccion = sc.next().toUpperCase().charAt(0);
		
		System.out.println("¿Tiene plus de productividad? R:(Si o No)");
		productividad = sc.next().toUpperCase().charAt(0);

		System.out.println("¿Plus de encargado? R:(Si o No)");
		encargado = sc.next().toUpperCase().charAt(0);

		System.out.println();

		if (infraccion == 'S') {
			System.out.println("Cometió infracción");
			nomina_final = nomina;
		} else {
			System.out.println("No cometió infracción");
			if (productividad == 'S') {
				System.out.println("Plus Productividad");
				nomina_final = nomina + (nomina * 10 / 100);
				if (encargado == 'S') {
					System.out.println("Plus Encargado");
					nomina_final = nomina_final + (nomina * 20 / 100);
				} else {
					System.out.println("No tiene plus de encargado");
				}
			} else {
				System.out.println("No tiene plus de productividad");
				if (encargado == 'S') {
					System.out.println("Plus Encargado");
					nomina_final = nomina + (nomina * 20 / 100);
				} else {
					System.out.println("No tiene plus de encargado");
					nomina_final = nomina;
				}
			}
		}
		System.out.println();
		System.out.println("La nomina final es " + nomina_final);
	}

}