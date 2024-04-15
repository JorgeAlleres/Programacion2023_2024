package examenPro;

import java.util.Arrays;

public class Ejercicio2A {
	
	
	 public static void main(String[] args) {
	        int[] array = new int[50];
	        int[] positiveArray = new int[50];
	        int[] negativeArray = new int[50];
	        int positiveCount = 0;
	        int negativeCount = 0;

	        // Generar array de 50 posiciones con valores entre -100 y 100
	        for (int i = 0; i < array.length; i++) {
	            array[i] = (int) (Math.random() * 201) - 100;
	            if (array[i] >= 0) {
	                positiveArray[positiveCount++] = array[i];
	            } else {
	                negativeArray[negativeCount++] = array[i];
	            }
	        }

	        // Ordenar arrays por el método de la Burbuja
	        bubbleSort(positiveArray, positiveCount);
	        bubbleSort(negativeArray, negativeCount);

	        // Mostrar arrays por teclado
	        System.out.println("Array original:");
	        System.out.println(Arrays.toString(array));
	        
	        System.out.println("Array de valores positivos ordenado:");
	        System.out.println(Arrays.toString(positiveArray));
	        
	        System.out.println("Array de valores negativos ordenado:");
	        System.out.println(Arrays.toString(negativeArray));
	    }

	    public static void bubbleSort(int[] arr, int n) {
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Intercambiar elementos
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }

}
