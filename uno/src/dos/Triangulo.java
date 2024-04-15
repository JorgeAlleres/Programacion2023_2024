package dos;

import java.util.Scanner;

public class Triangulo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double lado1, lado2, lado3;
		
		System.out.println("Dame un lado del triángulo:");
		lado1 = sc.nextDouble();
		System.out.println("Dame otro lado del triángulo:");
		lado2 = sc.nextDouble();
		System.out.println("Dame el otro lado del triángulo:");
		lado3 = sc.nextDouble();
		
		if(lado1 > lado2 && lado1 > lado3) {
			if(lado1 < (lado2 + lado3))
				System.out.println("El triángulo es posible");
			else
				System.out.println("El triángulo no es posible");
		} if (lado2 > lado1 && lado2 > lado3) {
			if(lado2 < (lado1 + lado3))
				System.out.println("El triángulo es posible");
			else
				System.out.println("El triángulo no es posible");
		} else {
			if(lado3 < (lado1 + lado2))
				System.out.println("El triángulo es posible");
			else
				System.out.println("El triángulo no es posible");
		}

	}

}
