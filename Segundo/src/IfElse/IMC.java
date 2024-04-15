package IfElse;

import java.util.Scanner;

public class IMC {

	public static int calcularIMC(double masa, double altura) {
		int imc;
		imc = (int) (masa / (Math.pow(altura, 2)));
		return imc;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double masa, altura, IMC;

		System.out.println("Introduce masa");
		masa = sc.nextDouble();
		System.out.println("Introduce altura");
		altura = sc.nextDouble();

		IMC = calcularIMC(masa, altura);

		if (IMC < 16) {
			System.out.println("La persona tiene delgadez severa.");
		} else if (IMC < 17) {
			System.out.println("La persona tiene delgadez moderada.");
		} else if (IMC < 18.5) {
			System.out.println("La persona tiene delgadez leve.");
		} else if (IMC < 25) {
			System.out.println("La persona tiene peso normal.");
		} else if (IMC < 30) {
			System.out.println("La persona tiene sobrepeso.");
		} else if (IMC < 35) {
			System.out.println("La persona tiene obesidad leve.");
		} else if (IMC < 40) {
			System.out.println("La persona tiene obesidad media.");
		} else {
			System.out.println("La persona tiene obesidad mórbida.");
		}
	}
}
