package uno;

import java.util.Scanner;

public class BusquedaDoble {

	public static void mostrarArray(int[] arr) {
		int tamanho = arr.length;
		System.out.println("Elementos del array");
		System.out.print("[ ");
		for (int i = 0; i < tamanho; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}

	public static boolean isInArray(int[] arr, int num) {

		boolean encontrado = false;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == num) {
				encontrado = true;
				break;
			}
		}
		return encontrado;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = { 1, 2, 2, 3, 4, 4, 5, 2 };
		int[] array2 = { 6, 3, 15, 2, 6, 4, 5, 0 };

		mostrarArray(array);
		mostrarArray(array2);

		System.out.println("dame un entero: ");
		int num = sc.nextInt();

		if (isInArray(array, num) && isInArray(array2, num))
			System.out.println("El numero " + num + " esta en los 2 arrays");
		else if (isInArray(array, num))
			System.out.println("El numero " + num + " esta en el array 1");
		else if (isInArray(array2, num))
			System.out.println("El numero " + num + " esta en el array 2");
		else
			System.out.println("El numero " + num + " NO esta en los arrays");

	}

}