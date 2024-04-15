package Baraja;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {

		ArrayList<Carta> baraja = new ArrayList<Carta>();
		// añadimos la 1ª carta
		baraja.add(new Carta());

		// Añadimos las 9 siguientes cartas
		do {
			Carta c = new Carta();
			if (!baraja.contains(c)) {
				baraja.add(c);
			}
		} while (baraja.size() < 10);
		// Ordenamos la baraja
		Collections.sort(baraja);
		// Mostramos la colección de cartas
		System.out.println("Colección de 10 cartas:");
		for (Carta c : baraja) {
			System.out.println(c);
		}
	}
}
