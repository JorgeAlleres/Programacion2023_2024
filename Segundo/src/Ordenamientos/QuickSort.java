package Ordenamientos;

import java.util.Arrays;

public class QuickSort {

	static void qsort(char[] items) {
		quickSort(items, 0, items.length - 1);
	}

	private static void quickSort(char[] items, int left, int right) {
		int i, j;
		char x, y;
		i = left;
		j = right;
		x = items[(left + right) / 2];
		do {
			while ((items[i] < x))
				i++;
			while (x < (items[j]))
				j--;

			if (i <= j) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;
				j--;
			}
		} while (i <= j);

		if (left < j)
			quickSort(items, left, j);
		if (i < right)
			quickSort(items, i, right);
	}

	public static void main(String[] args) {
		char[] letras = { 'k', 'f', 'l', 'g', 'o', 'd', 'a', 'x', 'p' };
		System.out.println("Desordenado");
		System.out.println(Arrays.toString(letras));
		qsort(letras);
		System.out.println("Ordenado");
		System.out.println(Arrays.toString(letras));
	}

}
