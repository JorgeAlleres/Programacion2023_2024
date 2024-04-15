package Resueltos;

import java.util.Scanner;

public class Atmstrong2 {

	public static boolean esArmstrong(int numero) {
		int numeroDigitos = 0;
		int temp = numero;
		int suma = 0;
		
		while (temp != 0) {
			temp=temp/10;
			numeroDigitos++;
		}
		
		temp = numero;
		
		while(temp != 0) {
			int peso = temp%10;
			suma += Math.pow(peso, numeroDigitos);
			temp=temp/10;
		}
		
		if(suma==numero)
			return true;
		else
			return false;
		
	}

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
			
		int numero;
			
		System.out.println("Introduce número");
		numero=sc.nextInt();
			
		if(esArmstrong(numero)==true)
			System.out.println("El número " + numero +" es un número Armstrong") ;
		else
			System.out.println ("El número " + numero + " no es un número Armstrong");
		
		}
}
