package dos;

import java.util.Scanner;

public class Calculos {

	final static double PI=3.141592;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radio;
		
		System.out.println("Calculos en el radio:");
		//entrada
		System.out.println("Dame el radio:");
		radio = sc.nextDouble();
		
		//algoritmos
		double longitud, area;
		longitud = 2 * PI * radio;
		area = PI * Math.pow(radio, 2);

		System.out.println("El área es: " + area);
		System.out.println("La longitud es: " + longitud);
	}

}
