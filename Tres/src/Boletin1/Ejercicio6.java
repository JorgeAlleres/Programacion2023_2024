package Boletin1;

import java.util.Scanner;

/*Pedir numeros hasta que se teclee un 0, mostrar la suma de todos los numeros introducidos.*/

public class Ejercicio6 {

	public static boolean esCero(int num) {
		boolean resultado;
		if (num == 0)
			resultado=true;
		else
			resultado=false;
		return resultado;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num, suma = 0;

		do {
			System.out.println("Introduce número");
			num = sc.nextInt();
			suma+=num;
			System.out.println("-----------------");
		} while (esCero(num)!=true);
		System.out.println("La suma es " + suma);
	}
}
