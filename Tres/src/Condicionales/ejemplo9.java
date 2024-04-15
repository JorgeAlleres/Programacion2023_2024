package Condicionales;

import java.util.Scanner;

public class ejemplo9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero, resultado;
		
		System.out.println("Introduce número");
		numero=sc.nextInt();
		
		System.out.println("Tabla del " + numero);
		for(int i=0;i<=10;i++) {
			resultado=numero*i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}

		System.out.println("Fin de codigo");
	}

}
