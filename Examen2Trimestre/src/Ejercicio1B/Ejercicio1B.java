package Ejercicio1B;

import java.util.Arrays;

/*Genera un array de 60 posiciones DOBLES que tomarán valores entre
-200 y 200. Separe en dos matrices los valores positivos y
negativos. Ordene ambos arrays por el método de QuickSort.
Considere el cero positivo. A continuación, separe el array de
negativos en dos arrays, uno de pares y otro de impares (use
casteo); muestre ambos.*/

public class Ejercicio1B {

	static void qsort(double[] items) {
		quickSort(items, 0, items.length - 1);
	}

	private static void quickSort(double[] items, int left, int right) {
		int i, j;
		double x, y;
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
		double arr[] = new double[60];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Math.random() * 401 - 200;
		}
		System.out.println("Array generado:");
		System.out.println(Arrays.toString(arr));

		int contPos = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0)
				contPos++;
		}

		double positivos[] = new double[contPos];
		double negativos[] = new double[60 - contPos];

		int indexPos = 0, indexNeg = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				positivos[indexPos] = arr[i];
				indexPos++;
			} else {
				negativos[indexNeg] = arr[i];
				indexNeg++;
			}
		}
		System.out.println("Array positivo:");
		System.out.println(Arrays.toString(positivos));
		System.out.println("Array negativo:");
		System.out.println(Arrays.toString(negativos));

		qsort(positivos);
		qsort(negativos);

		System.out.println("Array positivo ordenado:");
		System.out.println(Arrays.toString(positivos));
		System.out.println("Array negativo ordenado:");
		System.out.println(Arrays.toString(negativos));

		int contPos2 = 0;
		for (int i = 0; i < negativos.length; i++) {
			int numCasteado = (int) (negativos[i]);
			if (numCasteado % 2 == 0 || numCasteado == 0)
				contPos2++;
		}

		double pares[] = new double[contPos2];
		double impares[] = new double[(60 - contPos) - contPos2];

		int indexPar = 0, indexImp = 0;

		for (int i = 0; i < negativos.length; i++) {
			int numCasteado = (int) (negativos[i]);
			if (numCasteado % 2 == 0 || numCasteado == 0) {
				pares[indexPar] = negativos[i];
				indexPar++;
			} else {
				impares[indexImp] = negativos[i];
				indexImp++;
			}
		}
		
		System.out.println("Array par negativo ordenado:");
		System.out.println(Arrays.toString(pares));
		System.out.println("Array impar negativo ordenado:");
		System.out.println(Arrays.toString(impares));
	}
}
