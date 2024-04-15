package Propuestos;

import java.util.Scanner;

public class Siete {

	public static final double MILIA = 1852;
	
	public static double millasaMetros(double m) {
		return m*MILIA;
	}
	
	public static double millasaKilometros(double m) {
		return millasaMetros(m)/1000;
	}
	
	public static double kilometrosaMillas(double km) {
		return 1000*km/MILIA;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double dato;
		
		System.out.println("Introduce millas: ");
		dato=sc.nextDouble();
		
		System.out.println("Conversión a metros:" + millasaMetros(dato));
		System.out.println("Conversión a kilometros:" + millasaKilometros(dato));
		
		double dato2;
		
		System.out.println("Introduce kilometros: ");
		dato2=sc.nextDouble();
		
		System.out.println("Conversión a millas:" + kilometrosaMillas(dato2));
	}
	
}
