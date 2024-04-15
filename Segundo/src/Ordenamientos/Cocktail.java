package Ordenamientos;

import java.util.Arrays;

public class Cocktail {

	public static void cocktailSort(int[] num) {
		boolean cambiado = true;
		int i = 0;
		int j = num.length - 1;
		while (i < j && cambiado) {
			cambiado = false;
			for (int k = i; k < j; k++) {
				if (num[k] > num[k + 1]) {
					int temp = num[k];
					num[k] = num[k + 1];
					num[k + 1] = temp;
					cambiado = true;
				}
			}
			j--;
			if (cambiado) {
				cambiado = false;
				for (int k = j; k > i; k--) {
					if (num[k] < num[k - 1]) {
						int temp = num[k];
						num[k] = num[k - 1];
						num[k - 1] = temp;
						cambiado = true;
					}
				}
			}
			i++;
		}
	}

	public static void main(String[] args) {
		int[] num = new int[200];
		for(int i=0; i<num.length;i++) {
			num[i]=(int) (Math.random()*1000);
		}
		System.out.println("Desordenado");
		System.out.println(Arrays.toString(num));
		cocktailSort(num);
		System.out.println("Ordenado");
		System.out.println(Arrays.toString(num));
	}
}
