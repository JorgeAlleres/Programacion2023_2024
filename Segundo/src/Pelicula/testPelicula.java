package Pelicula;

import Pelicula.Pelicula.tipo;

public class testPelicula {

	public static void main(String[] args) {

		Pelicula uno = new Pelicula("Torrente", "David", tipo.SUSPENSO, 234, 2000, 9.83);
		Pelicula dos = new Pelicula("Avengers", "Pepe", tipo.ACCION, 134, 2018, 4.5);

		System.out.println(uno.toString());
		System.out.println(dos.toString());

		System.out.println(uno.esEpica());
		System.out.println(dos.esEpica());

		System.out.println(uno.calcularValoracion());
		System.out.println(dos.calcularValoracion());

		System.out.println(uno.esParecida(dos));

	}
}