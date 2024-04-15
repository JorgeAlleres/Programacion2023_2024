package Condicionales;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		
		int numero, resultado;
		Scanner sc = new Scanner(System.in);

		System.out.println("Número a multiplicar");
		numero=sc.nextInt();
		
		for(int i=0;i<=10;i++) {
			resultado=i*numero;
			System.out.println(numero + " x " + i + " = " + resultado);
		}

	}

}
