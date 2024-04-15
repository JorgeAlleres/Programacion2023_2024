package Sucesiones;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inicial, razon, terminos;
		int posiciones, suma = 0;
		
		System.out.println("Cuantas posiciones");
		terminos=sc.nextInt();
		
		int[] arr = new int[terminos];
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Introduce número para la posición " + i);
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Término inicial");
		inicial=sc.nextInt();
		
		System.out.println("Razón");
		razon=sc.nextInt();
		
		System.out.println("Nº Terminos");
		terminos=sc.nextInt();
		
		for(int i=inicial;i<=terminos;i=i+razon) {
			arr[i] = (inicial + i*razon);
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<=arr.length-1;i++) {
			suma += i;
		}
		System.out.println(suma);
	}
}
