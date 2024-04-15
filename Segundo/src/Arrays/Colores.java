package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Colores {

	public static boolean esColor(String palabra) {
		boolean es = false;
		String colores[] = { "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado" };
		for(int j = 0; j < colores.length; j++) {
			if(palabra.equals(colores[j]))
				es = true;
		}
		return es;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String colores[] = { "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado" };
		String[] pal = new String[8];

		for (int j = 0; j < pal.length; j++) {
			System.out.println("Introuce palabra " + (j + 1) + " :");
			pal[j] = sc.next();
		}

		System.out.println(Arrays.toString(pal));

		int numCol = 0;
		for (int i = 0; i < pal.length; i++) {
				if(esColor(pal[i]))
					numCol++;
		}
		System.out.println("Numero de colores " + numCol);
		
		String[] col = new String[numCol];
		String[] nocol = new String[8-numCol];
		
		int indC = 0;
		int indN = 0;
		
		for(int j = 0; j < pal.length; j++) {
			if(esColor(pal[j])) {
				col[indC] = pal[j];
				indC++;
			} else {
				nocol[indN] = pal[j];
				indN++;
			}
		}
		System.out.println(Arrays.toString(col));
		System.out.println(Arrays.toString(nocol));
	
	
		int cont= 0;
		
		for(int j = 0; j < col.length; j++) {
			pal[cont] = col[j];
			cont++;
		}
		for(int k = 0; k < nocol.length; k++) {
			pal[cont] = nocol[k];
			cont++;
		}
		
		System.out.println(Arrays.toString(pal));
	}
}
