package Ordenamientos;

import java.util.Arrays;

public class Gnomo {

	public static void Gnomo(int[] array) {
		for (int i = 1; i < array.length;) {
			if (array[i - 1] <= array[i]) {
				++i;
			} else {
				int tempVal = array[i];
				array[i] = array[i - 1];
				array[i - 1] = tempVal;
				--i;
				if (i == 0) {
					i = 1;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] num = new int[200];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 1000);
		}
		System.out.println("Desordenado");
		System.out.println(Arrays.toString(num));
		Gnomo(num);
		System.out.println("Ordenado");
		System.out.println(Arrays.toString(num));
	}
}
