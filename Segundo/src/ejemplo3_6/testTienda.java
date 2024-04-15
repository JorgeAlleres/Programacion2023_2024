package ejemplo3_6;

import java.util.Scanner;

public class testTienda {

	public static void main(String[] args) {
		Tienda tienda1 = new Tienda("Tienda Cuántica", "Pepito Pérez", 123456, 5);
		
		Computador computador1 = new Computador("Acer", 50, "Intel iCore 7", "Windows", 18500000);
		System.out.println(computador1);
		Computador computador2 = new Computador("Toshiba", 80, "Intel iCore 5", "Windows", 15500000);
		System.out.println(computador2);
		Computador computador3 = new Computador("Mac", 100, "Intel iCore 7", "Mac", 2500000);
		System.out.println(computador3);
		
		tienda1.anhadir(computador1);
		tienda1.anhadir(computador2);
		tienda1.anhadir(computador3);
		System.out.println(tienda1);
		
		System.out.println();Scanner sc = new Scanner(System.in);
		System.out.println("Introduce marca");
		String marca = sc.next();
		
		System.out.println("El computador a buscar: " + marca + " se encuentra en la posición " + tienda1.buscar(marca));
		System.out.println("Eliminando....");
		tienda1.eliminar(marca);
		System.out.println(tienda1);
	}
}
