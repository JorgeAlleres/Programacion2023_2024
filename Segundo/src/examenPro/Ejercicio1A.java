package examenPro;

import java.util.Scanner;

public class Ejercicio1A {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tabla = new int[10];

        // Pedir al usuario que introduzca la tabla de 10 elementos numéricos enteros
        System.out.println("Introduce la tabla de 10 elementos numéricos enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            tabla[i] = scanner.nextInt();
        }

        // Pedir al usuario la posición del elemento a eliminar
        System.out.print("Introduce la posición del elemento a eliminar (1-10): ");
        int posicionEliminar = scanner.nextInt();

        // Eliminar el elemento en la posición indicada por el usuario
        if (posicionEliminar >= 1 && posicionEliminar <= 10) {
            for (int i = posicionEliminar - 1; i < 9; i++) {
                tabla[i] = tabla[i + 1];
            }
            tabla[9] = 0; // Colocar un valor nulo en la última posición
        } else {
            System.out.println("Posición inválida. Debe ser un número entre 1 y 10.");
        }

        // Mostrar la tabla por consola después de la eliminación del elemento
        System.out.println("Tabla después de eliminar el elemento:");
        for (int num : tabla) {
            System.out.print(num + " ");
        }
    }
	
	

}
