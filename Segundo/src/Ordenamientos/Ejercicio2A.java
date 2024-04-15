package Ordenamientos;

import java.util.Arrays;

/*Genera array de 50 posiciones enteros entre -100 y 100.
 * Rocorre el array y separalo en positivos y negativos,
 * ordenalos por metodo de burbuja, el cero es positivo
 * Mostrar los dos arrays*/

public class Ejercicio2A {

	public static void burbuja(int array[]) {
		int aux;
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[50];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 201 - 100);
		}
		System.out.println("Desordenado");
		System.out.println(Arrays.toString(arr));

		int contar = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=0)
				contar++;
		}
		System.out.println("Positivos " + contar);
		System.out.println("Negativos: " + (arr.length-contar));
		
		int positivos[] = new int[contar];
		int negativos[] = new int[arr.length-contar];

		int npos = 0;
		int nneg = 0;
		
		for (int n : arr) {
			if (n >= 0) {
				positivos[npos]=n;
				npos++;
			} else {
				negativos[nneg]=n;
				nneg++;
			}
		}
		burbuja(positivos);
		burbuja(negativos);
		System.out.println(Arrays.toString(positivos));
		System.out.println(Arrays.toString(negativos));
	}
}
