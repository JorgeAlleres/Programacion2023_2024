package uno;

import java.util.Scanner;


      public class HolaAmigo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String nombre = "";
		
		System.out.println("Dime tu nombre:");
		nombre = sc.nextLine();
		
		System.out.println("Hola "+ nombre);
		
	}

}
