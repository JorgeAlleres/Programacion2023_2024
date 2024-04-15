package Ordenamientos;

import java.util.Arrays;

public class Selection {

	public static void selectionsort(int[] array) {
	    for (int i = 0; i < array.length - 1; i++) {
	        int index = i;
	        for (int j = i + 1; j < array.length; j++)
	            if (array[j] < array[index])
	                index = j;
	        int smallerNumber = array[index];
	        array[index] = array[i];
	        array[i] = smallerNumber;

	    }
	}
	
	public static void main(String[] args) {
		int[] num = new int[200];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 1000);
		}
		System.out.println("Desordenado");
		System.out.println(Arrays.toString(num));
		selectionsort(num);
		System.out.println("Ordenado");
		System.out.println(Arrays.toString(num));
	}
}
