package Propuestos;

import java.util.Scanner;

/*1. Realiza un programa con tres variables de tipo entero a, b y c. El programa deberá mostrar por pantalla el valor
menor y mayor.*/

public class Propuesto1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Variable a");
		a=sc.nextInt();
		
		System.out.println("Variable b");
		b=sc.nextInt();
		
		System.out.println("Variable c");
		c=sc.nextInt();
		
		System.out.println();
		
		if(a>b && a>c) {
			System.out.print("A>");
			if(b>c)
				System.out.print("B>C");
			else
				System.out.print("C>B");
		} else if (b>a && b>c) {
			System.out.print("B>");
			if(a>c)
				System.out.print("A>C");
			else
				System.out.print("C>A");
		} else {
			System.out.print("C>");
			if(a>b)
				System.out.print("A>B");
			else
				System.out.print("B>A");
		}
	}
}
