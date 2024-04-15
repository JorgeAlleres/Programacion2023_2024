package dos;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int año;
		
		System.out.println("Intrduce un año:");
		año = sc.nextInt();
		
		if(año%4==0)
			System.out.println("El año es bisiesto");
		else
			System.out.println("El año no es bisiesto");

	}

}
