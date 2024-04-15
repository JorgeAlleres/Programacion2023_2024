package Examen;

import java.util.Scanner;

/*Pasar un numero de sistema decimal a binario mediante el siguiente metodo:
 * dividiendo sucesivamente entre dos y quedandose con el cociente
 * hasta la ultima division donde le resto ya solo será 0 o 1
 * El numero convertido se construye desde ese ultimo resto añadiendo
 * despues los cocientes que hemos obtenido.*/

public class Ejercicio4B {
	
	private static int decimalToBinario(int numero) {
		int numero_binario = 0;
		int peso_binario = 1;
		while(numero>0) {
				numero_binario+=(numero%2) * peso_binario;
				peso_binario*=10;
				numero/=2;
		}
		return numero_binario;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Introduce numero");
		numero=sc.nextInt();
		
		System.out.println(decimalToBinario(numero));
	}

	
}
