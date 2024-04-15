package din;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		ArrayList <Gato> g = new ArrayList<Gato>();
		
		g.add(new Gato("Garfield", "Naranja", "Mestizo"));
		g.add(new Gato("Pepe", "Gris", "Angora"));
		g.add(new Gato("Mauri", "Blanco", "Manx"));
		g.add(new Gato("Luis", "Marrón", "Persa"));
		
		System.out.println("Datos de los gatos:\n");
		for(Gato gatoAux : g) {
			System.out.println(gatoAux);
		}
		Gato g1 = g.get(0);
		Gato g2 = g.get(3);
		
		System.out.println(g1.compareTo(g2));
		System.out.println(g2.compareTo(g1));
		
		Collections.sort(g);
		System.out.println("\nDatos de los gatos después de SORT:\n");
		for(Gato gatoAux : g) {
			System.out.println(gatoAux);
		}
		
		System.out.println(g1.equals(g2));
		System.out.println(g1.equals(g1));
	}
}
