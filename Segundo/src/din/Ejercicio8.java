package din;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		ArrayList <Integer> a = new ArrayList<Integer>();
		
		a.add(67);
		a.add(78);
		a.add(10);
		a.add(4);
		
		System.out.println("Datos:\n");
		for(int numero : a) {
			System.out.println(numero);
		}
		Collections.sort(a);
		System.out.println("\nDatos después del SORT:\n");
		for(int numero : a) {
			System.out.println(numero);
		}
	}
}
