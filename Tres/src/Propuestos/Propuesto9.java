package Propuestos;

import java.util.Scanner;

/*9. (Ejercicio de dificultad alta) Realiza una clase minumero con un método esOmirp que diga si un número es Omirp
o no. Un número es Omirp si es un número primo y, además, al invertir sus dígitos da otro número primo. Por
ejemplo: 7951 y 1597.*/

public class Propuesto9 {

	public static int darVuelta(int numero) {
		int numeroInvertido = 0;
		int digito;
		while (numero != 0) {
			digito = numero % 10;
			numeroInvertido = numeroInvertido * 10 + digito;
			numero /= 10;
		}
		return numeroInvertido;
	}

	public static boolean esPrimo(int numero) {
		boolean primo = true;
		for (int i = 2; i < numero; i++) {
			if (numero%i==0)
				primo = false;
		}
		return primo;
	}

	public static void esOmirp(int numero) {
		if (esPrimo(numero) == true && esPrimo(darVuelta(numero)))
			System.out.println("El número " + numero + " es Omirp.");
		else
			System.out.println("El número " + numero + " no es Omirp.");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Introduce numero");
		numero = sc.nextInt();

		esOmirp(numero);
	}
}
