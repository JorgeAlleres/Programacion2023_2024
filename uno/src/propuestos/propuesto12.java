package propuestos;

import java.util.Scanner;

public class propuesto12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int dinero = 0;

		int q = 0, d = 0, c = 0, l = 0, b = 0, x = 0, v = 0;

		System.out.println("Introduce dinero");
		dinero = sc.nextInt();

		while (dinero >= 500) {
			dinero -= 500;
			q++;
		}
		while (dinero >= 200) {
			dinero -= 200;
			d++;
		}
		while (dinero >= 100) {
			dinero -= 100;
			c++;
		}
		while (dinero >= 50) {
			dinero -= 50;
			l++;
		}
		while (dinero >= 20) {
			dinero -= 20;
			b++;
		}
		while (dinero >= 10) {
			dinero -= 10;
			x++;
		}
		while (dinero >= 5) {
			dinero -= 5;
			v++;
		}
		System.out.println(q + " billete de 500, " + d + " billete de 200, "
				+ c + " billete de 100, " + l + " billete de 50, "
				+ b + " billete de 20, " + x + " billete de 10, " 
				+ v + " billete de 5 y sobran " + dinero + " euros.");
	}

}
