package Ordenamientos;

import java.util.Arrays;

public class QuickSortEnteros {

	static void qsort(int[] items) {
		quickSort(items, 0, items.length-1);
	}
	
	private static void quickSort(int[] items, int left, int right) {
		int i,j;
		int x,y;
		i = left;
		j = right;
		x = items[(left+right)/2];
		do {
			while((items[i] < x))
				i++;
			while(x < (items[j]))
				j--;
			
			if(i <= j) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;
				j--;
			}
		} while(i <= j);
		
		if(left < j)
			quickSort(items, left, j);
		if(i < right)
			quickSort(items, i, right);
	}
	
	public static void main(String[] args) {
		int[] num = new int[200];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 1000);
		}
		System.out.println("Desordenado");
		System.out.println(Arrays.toString(num));
		qsort(num);
		System.out.println("Ordenado");
		System.out.println(Arrays.toString(num));
	}
}
