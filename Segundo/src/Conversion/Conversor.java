package Conversion;

import java.util.Scanner;

public class Conversor {

	public class ConversorMetros {
		double metros;
		final static int FACTOR_METROS_CM = 100; // Factor de conversión de metros a centímetros
		final static int FACTOR_METROS_MILIM = 1000; // Factor de conversión de metros a milímetros
		final static double FACTOR_METROS_PULGADAS = 39.37; // Factor de conversión de metros a pulgadas
		final static double FACTOR_METROS_PIES = 3.28; // Factor de conversión de metros a pies
		final static double FACTOR_METROS_YARDAS = 1.09361; // Factor de conversión de metros a yardas

		public static double metrosACentimetros(int metros) {
			return metros * FACTOR_METROS_CM;
		}

		public static double metrosAMilimetros(int metros) {
			return metros * FACTOR_METROS_MILIM;
		}

		public static double metrosAPulgadas(int metros) {
			return metros * FACTOR_METROS_PULGADAS;
		}

		public static double metrosAYardas(int metros) {
			return metros * FACTOR_METROS_YARDAS;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int metros;
			System.out.println("Introduce metros para convertir");
			metros = sc.nextInt();

			System.out.println("Metros a centimetros: " + metrosACentimetros(metros));
			System.out.println("Metros a milímetros: " + metrosAMilimetros(metros));
			System.out.println("Metros a pulgadas: " + metrosAPulgadas(metros));
			System.out.println("Metros a yardas: " + metrosAYardas(metros));
		}
	}
}
