package Ordenamientos;

import java.util.Arrays;

public class Burbuja {

	public static void burbuja(int array[]) {
		int aux;
		for(int i = array.length - 1; i > 0 ; i--) {
	        for (int j = 0; j < i; j++) {
	            if (array[j] > array[j+1]) {
	                aux = array[j];
	                array[j] = array[j+1];
	                array[j+1] = aux;
	            }
	        }
	    }
	}

	public static void main(String[] args) {
		int[] num = {2,4,6,1,3,5,0,7,9,8};
		System.out.println("Desordenado");
		System.out.println(Arrays.toString(num));
		burbuja(num);
		System.out.println("Ordenado");
		System.out.println(Arrays.toString(num));
	}
}
