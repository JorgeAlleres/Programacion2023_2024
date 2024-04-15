package Examen2;

import java.util.Scanner;

public class Ejercicio4A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int multiplicador, multiplicando, resultado = 0;
		boolean seguir=true;
		System.out.println("Multiplicador");
		multiplicador=sc.nextInt();
		System.out.println("Multiplicando");
		multiplicando=sc.nextInt();
		
		do {
			if(multiplicador%2!=0 && multiplicador>=1) {
				resultado+=multiplicando;
				System.out.println(resultado);
				if (multiplicador==1)
					seguir=false;
			}
			multiplicador=multiplicador/2;
			multiplicando=multiplicando*2;
		} while(seguir==true);
		
		System.out.println("El resultado es " + resultado);
	}
}
