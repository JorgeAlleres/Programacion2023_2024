package dos;

import java.util.Scanner;

public class Tarea1 {

	final static double PI=3.141592;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radio;
		
		System.out.println("Dame el radio:");
		radio = sc.nextDouble();
		
		double volumen, area;
		volumen = (4 * PI * Math.pow(radio, 3)) / 3;
		area = 4 * PI * Math.pow(radio, 2);

		System.out.println("El área es: " + area);
		System.out.println("El volumen es: " + volumen);

	}

}
