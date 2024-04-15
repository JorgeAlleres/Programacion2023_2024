package Examen;

import java.util.Scanner;

/*Introducir dos números por teclado y mostrar si son novios o no.
Con un ejemplo es más fácil de entender. 48 y 75 son números novios
porque: La suma de los divisores de cada número por separado es
igual a la suma de esos dos números más uno.
Divisores de (m) = Divisores de (n) = m + n + 1.
D (48) = 1 + 2 + 3 + 4 + 6 + 8 + 12 + 16 + 24 + 48 = 124,
D (75) = 1 + 3 + 5 + 15 + 25 + 75 = 124,
Si hacemos => 48 + 75 + 1 = 124*/

public class Ejercicio2B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		int sumaNum1 = 0, sumaNum2 = 0;
		int sumaTotal;
		
		System.out.println("Numero1");
		num1=sc.nextInt();
		System.out.println("Numero2");
		num2=sc.nextInt();
		
		for(int i = 1 ; i <=num1 ; i++){
	        if(num1%i==0){
	            sumaNum1=+i;
	        }
	    }
		
		for(int i = 1 ; i <=num2 ; i++){
	        if(num2%i==0){
	            sumaNum2=+i;
	        }
	    }
		
		sumaTotal=num1+num2+1;
		
		if(sumaTotal==sumaNum1 && sumaTotal==sumaNum2)
			System.out.println(num1 + " y " + num2 + " son novios");
		else
			System.out.println(num1 + " y " + num2 + " no son novios");
	}
}
