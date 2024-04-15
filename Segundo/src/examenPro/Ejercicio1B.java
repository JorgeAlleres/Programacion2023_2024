package examenPro;

import java.util.Scanner;

public class Ejercicio1B {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tabla = new int[10];

        // Pedir al usuario que introduzca la tabla de 10 elementos numéricos enteros
        System.out.println("Introduce la tabla de 10 elementos numéricos enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            tabla[i] = scanner.nextInt();
        }

        // Pedir al usuario el valor entero para desplazar las posiciones del array
        System.out.print("Introduce el número de veces a desplazar las posiciones del array: ");
        int desplazamiento = scanner.nextInt();

        // Realizar el desplazamiento circular en el array
        desplazarArrayCircular(tabla, desplazamiento);

        // Mostrar la tabla por consola después del desplazamiento
        System.out.println("Tabla después del desplazamiento:");
        for (int num : tabla) {
            System.out.print(num + " ");
        }
    }

    public static void desplazarArrayCircular(int[] array, int k) {
        int n = array.length;
        k = k % n;
        
        reverseArray(array, 0, n - 1);
        reverseArray(array, 0, k - 1);
        reverseArray(array, k, n - 1);
    }

    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

}
