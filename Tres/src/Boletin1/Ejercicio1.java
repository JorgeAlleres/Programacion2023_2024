package Boletin1;

import java.util.Scanner;

/*Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo*/

public class Ejercicio1 {

	public static int calcularCuadrado(int num) {
		return (int) Math.pow(num, 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num, resultado;

		do {
			System.out.println("Introduce número");
			num = sc.nextInt();
			resultado = calcularCuadrado(num);
			System.out.println(resultado);
		} while (num >= 0);
	}
}
