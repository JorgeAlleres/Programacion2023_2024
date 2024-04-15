package din;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		int tamanho, suma = 0, maximo = 0, minimo = 100;
		double media;
		
		tamanho = (int) (10+Math.random()*11);
		for(int i = 0; i<tamanho; i++) {
			a.add((int) (Math.random()*101));
		}
		System.out.println("Tamaño: " + tamanho);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		
		for(int numero : a) {
			if(numero>maximo) {
				maximo=numero;
			}
			if(numero<minimo) {
				minimo=numero;
			}
			suma+=numero;
		}
		media=suma/tamanho;
		System.out.println("Maximo = " + maximo);
		System.out.println("Minimo = " + minimo);
		System.out.println("Media = " + media);
	}
}
