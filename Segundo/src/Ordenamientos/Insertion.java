package Ordenamientos;

import java.util.Arrays;

public class Insertion {

	public static void insertionSort(int[] array) {
	    for (int i = 0; i < array.length; i++) {
	    	int copyNumber = array[i];
	        int aux = array[i];
	        int j = i;
	        while (j > 0 && copyNumber < array[j-1]) {
	        	array[j] = array[j-1];
	            j--;
	        }
	        array[j] = copyNumber;
	    }
	}
	
	public static void main(String[] args) {
		int[] num = new int[200];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 1000);
		}
		System.out.println("Desordenado");
		System.out.println(Arrays.toString(num));
		insertionSort(num);
		System.out.println("Ordenado");
		System.out.println(Arrays.toString(num));
	}
}
