package Propuestos;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 1  1  1  1  1
 * 1  2  3  4  5
 * 1  3  6  10 15
 * 1  4  10 20 35
 * 1  5  15 35 70
 * 
 * */

public class Uno {

	public static void ver(int[][] arr) {

		int filas = arr.length;
		
		for (int i = 0; i < filas; i++) {		
			for(int j = 0; j < filas; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int k = 0; k < filas; k++) {
			System.out.println(Arrays.toString(arr[k]));
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int filas;

		System.out.println("Dime filas");
		filas = sc.nextInt();

		int[][] arr = new int[filas][filas];
		
		ver(arr);
	}
}
