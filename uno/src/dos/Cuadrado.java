package dos;

import java.util.Scanner;

public class Cuadrado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double lado;

		System.out.println("Dame el lado:");
		lado = sc.nextDouble();
		
		//algoritmos
		double diagonal, perimetro, area;
		diagonal = Math.sqrt(Math.pow(lado, 2) + Math.pow(lado, 2));
		perimetro = 4 * lado;
		area = Math.pow(lado, 2)/2;

		System.out.println("La diagonal es: " + diagonal);
		System.out.println("El perímetro es: " + perimetro);
		System.out.println("El área es: " + area);

	}

}
