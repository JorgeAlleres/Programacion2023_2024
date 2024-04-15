package Boletin1;

import java.util.Scanner;

/*Pedir numeros hasta que se introduzca uno negativo, y calcular la media*/

public class Ejercicio7 {

	public static boolean esPositivo(int num) {
		boolean resultado;
		if (num >= 0)
			resultado=true;
		else
			resultado=false;
		return resultado;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num, media = 0, acumulador = 0;

		do {
			System.out.println("Introduce número");
			num = sc.nextInt();
			media+=num;
			acumulador++;
			System.out.println("-----------------");
		} while (esPositivo(num)==true);
		media/=acumulador;
		System.out.println("La media es " + media);
	}
}
