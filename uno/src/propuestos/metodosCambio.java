package propuestos;

import java.util.Scanner;

public class metodosCambio {

	
	public static final double CAMBIOaD=1.05;
	static Scanner sc;
	
	public static double DolaresAEuros(double dolares) {
		return dolares/CAMBIOaD;
	}

	public static double EurosADolares(double euros) {
		return euros*CAMBIOaD;
	}
	
	public static double obtenerCantidad(String mensaje) {
		double can;
		System.out.println(mensaje);
		can=sc.nextDouble();
		return can;
	}
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		double cantidad;
		int res=0;
		
		do {
			System.out.println("Para Euros a Dolares pulse 1");
			System.out.println("Para Dolares a Euros pulse 2");
			System.out.println("Para finalizar el programa pulse 3");
			res=sc.nextInt();
			switch(res) {
				case 1:
					cantidad=obtenerCantidad("Introduce Euros");
					System.out.println("En dolares son: " + EurosADolares(cantidad));
				break;
				case 2:
					cantidad=obtenerCantidad("Introduce Dolares");
					System.out.println("En euros son: " + DolaresAEuros(cantidad));
				break;
				case 3:
					break;
				default:
					System.out.println("Opción no valida");
			}
			System.out.println("------------------------------");
		} while (res!=3);
			System.out.println("Fin de programa");
		
	}

}
