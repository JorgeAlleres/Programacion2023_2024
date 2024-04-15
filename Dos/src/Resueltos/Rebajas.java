package Resueltos;

import java.util.Scanner;

public class Rebajas {

	/*public static double descubreOriginal(double actual, double porcentaje) {
		return (actual(1 - original));
	}*/
	
	public static double descubreActual(double original, double porcentaje) {
		return (original - (original * porcentaje / 100));
	}
	
	public static double descubrePorcentaje(double original, double actual) {
		return ((original - actual) / original) * 100;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double original, actual, porcentaje;
		
		System.out.println("Precio original: ");
		original = sc.nextDouble();
		System.out.println("Precio actual: ");
		actual = sc.nextDouble();
		
		System.out.println("El porcenaje de descuento es: " + (int)descubrePorcentaje(original, actual)
		+ "%");
		
		System.out.println("Precio original: ");
		original = sc.nextDouble();
		System.out.println("Porcentaje: ");
		porcentaje = sc.nextDouble();
		
		System.out.println("El precio actual es: " + descubreActual(original, porcentaje));
		
		System.out.println("Precio actual: ");
		actual = sc.nextDouble();
		System.out.println("Porcentaje: ");
		porcentaje = sc.nextDouble();
		
		//System.out.println("El precio actual es: " + descubreOriginal(actual, porcentaje));
	}

}
