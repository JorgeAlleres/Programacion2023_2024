package Condicionales;

import java.util.Scanner;

public class Nomina {

	private static char productividad;
	private static char encargado;
	private static char infraccion;

	public static double esProductivo(double nomina) {
		
		double nomina_final = nomina;
		
		switch (productividad) {
		case 'S':
			System.out.println("Plus Productividad");
			nomina_final = nomina + (nomina * 10 / 100);
			break;
		case 'N':
			System.out.println("No tiene plus de productividad");
			break;
		default:
			System.out.println("Respuesta no válida");
			break;

		}
		return nomina_final;
	}
	
	public static double esEncargado(double nomina) {
		
		double nomina_final = nomina;
		
		switch (encargado) {
		case 'S':
			System.out.println("Plus Encargado");
			nomina_final = nomina_final + (nomina * 20 / 100);
			break;
		case 'N':
			System.out.println("No tiene plus de encargado");
			break;
		default:
			System.out.println("Respuesta no válida");
			break;
		}
		return nomina_final;
	}
	
	public static double esInfracion(double nomina) {
		
		double nomina_final = nomina;
		
		switch (infraccion) {
		case 'S':
			System.out.println("Cometió infracción");
			nomina_final = nomina_final - (nomina * 15 / 100);
			break;
		case 'N':
			System.out.println("No cometió infracción");
			break;
		default:
			System.out.println("Respuesta no válida");
			break;
		}
		return nomina_final;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double nomina, nomina_final = 0;

		System.out.println("Introduce nomina");
		nomina = sc.nextDouble();

		System.out.println("¿Tiene plus de productividad? R:(Si o No)");
		productividad = sc.next().toUpperCase().charAt(0);

		System.out.println("¿Plus de encargado? R:(Si o No)");
		encargado = sc.next().toUpperCase().charAt(0);

		System.out.println("¿Cometó infracción? R:(Si o No)");
		infraccion = sc.next().toUpperCase().charAt(0);

		System.out.println();

		nomina_final = esProductivo(nomina);
		nomina_final = esEncargado(nomina_final);
		nomina_final = esInfracion(nomina_final);
		
		
		System.out.println("La nomina final es " + nomina_final);
	}

}