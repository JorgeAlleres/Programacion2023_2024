package Propuestos;

import java.util.Scanner;

public class Digitos {

	private static int sumaDigitos(int n) {
		int n1, n2, n3, n4, total;

		n1 = n / 1000;
		n2 = n / 100 % 10;
		n3 = n / 10 % 10;
		n4 = n / 1 % 10;
		total = n1 + n2 + n3 + n4;

		return total;
	}

	private static int sumaDigitos2(int n) {
		if (n < 10) {
	        return n;
	    } else {
	        int ultimoDigito = n % 10;
	        int resto = n / 10;
	        return ultimoDigito + sumaDigitos2(resto);
	    }
	}
	
	public static int cuentaDigitos(int n) {
		int numeroDigitos = 0;
		if (n == 0)
			numeroDigitos++;
		else {
			while (n != 0) {
				n /= 10;
				numeroDigitos++;
			}
		}
		return numeroDigitos;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dame numero:");
		int numero = sc.nextInt();

		int suma = sumaDigitos2(numero);
		System.out.println(suma);
	}
}
