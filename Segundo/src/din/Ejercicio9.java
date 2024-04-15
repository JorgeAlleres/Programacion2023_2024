package din;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio9 {

	public static void main(String[] args) {

		ArrayList<Gato> g = new ArrayList<Gato>();

		g.add(new Gato("Garfield", "Naranja", "Mestizo"));
		g.add(new Gato("Pepe", "Gris", "Angora"));
		g.add(new Gato("Mauri", "Blanco", "Manx"));
		g.add(new Gato("Ulises", "Marrón", "Persa"));
		g.add(new Gato("Adán", "Negro", "Angora"));

		Collections.sort(g);
		System.out.println("Datos de los gatos ordenados por nombre:\n");
		for (Gato gatoAux : g) {
			System.out.println(gatoAux);
		}
		Gato uno = g.get(1);
		Gato dos = g.get(4);
		System.out.println(uno.compareTo(dos));
		System.out.println(uno.equals(dos));
	}
}
