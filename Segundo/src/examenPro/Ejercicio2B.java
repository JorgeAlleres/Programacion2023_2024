package examenPro;

import java.util.Arrays;

public class Ejercicio2B {
	
	public static void main(String[] args) {
        int[] array = new int[60];
        int[] pares;
        int[] impares;
        int paresCount = 0;
        int imparesCount = 0;

        // Generar array de 60 posiciones con valores entre 0 y 100
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }

        // Separar valores pares e impares en arrays distintos
        for (int num : array) {
            if (num % 2 == 0) {
                paresCount++;
            } else {
                imparesCount++;
            }
        }

        pares = new int[paresCount];
        impares = new int[imparesCount];

        paresCount = 0;
        imparesCount = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                pares[paresCount++] = num;
            } else {
                impares[imparesCount++] = num;
            }
        }

        // Ordenar arrays por el método Quicksort
        quickSort(pares, 0, pares.length - 1);
        quickSort(impares, 0, impares.length - 1);

        // Mostrar arrays de pares e impares por pantalla
        System.out.println("Array original:");
        System.out.println(Arrays.toString(array));
        
        System.out.println("Array de valores pares ordenado:");
        System.out.println(Arrays.toString(pares));

        System.out.println("Array de valores impares ordenado:");
        System.out.println(Arrays.toString(impares));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

}
