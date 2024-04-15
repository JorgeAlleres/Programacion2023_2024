package dos;

import java.util.Scanner;

public class Rectangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double lado1;
		double lado2;

		System.out.println("Dame el primer lado:");
		lado1 = sc.nextDouble();
		
		System.out.println("Dame el segundo lado:");
		lado2 = sc.nextDouble();
		
		//algoritmos
		double diagonal, perimetro, area;
		diagonal = Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
		perimetro = (2 * lado1) + (2 * lado2);
		area = lado1 * lado2 /2;

		System.out.println("La diagonal es: " + diagonal);
		System.out.println("El perímetro es: " + perimetro);
		System.out.println("El área es: " + area);

	}

}
