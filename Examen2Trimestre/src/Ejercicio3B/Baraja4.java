package Ejercicio3B;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja4 {

	public static void main(String[] args) {

		ArrayList<Carta> baraja = new ArrayList<Carta>();
		baraja.add(new Carta());
		do {
			Carta c = new Carta();
			if (!baraja.contains(c)) {
				baraja.add(c);
			}
		} while (baraja.size() < 4);
		// Ordenamos la baraja
		Collections.sort(baraja);
		// Mostramos la colección de cartas
		System.out.println("Colección de 4 cartas:");
		for (Carta c : baraja) {
			System.out.println(c);
		}
	}

}
