package SeleccionFutbol;

import java.util.ArrayList;

public class testSeleccionFutbol {

	public static void main(String[] args) {

		// Declaramos el ArrayList de SeleccionFutbol
		ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

		// Creamos los integrantes
		// Puedo usar la referencia Seleccion de futbol o la misma que vamos a crear
		// (Ejemplo los creados y ejemplo los comentados)
		SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "284EZ89");
		SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
		SeleccionFutbol raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);

		/*
		 * Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "284EZ89");
		 * Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
		 * Masajista raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);
		 */

		// Añadimos los integrantes
		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);

		// LLamamos al metodo concentrarse (TODOS SE CONCENTRAN)
		// Como llamamos a todos y el metodo "tiene el mismo nombre"(EN REALIDAD ES POR ESTAR HEREDADO) podemos usar foreach
		// y sin casteo
		System.out.println(
				"Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método HEREDADO)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.toString() + " -> ");
			integrante.concentrarse();
		}

		// LLamamos al metodo viaje (TODOS VIAJAN)
		System.out.println("\nTodos los integrantes viajan para jugar un partido. (AQUI YA NO SE EJECUTA EL HEREDADO PORQUE LO SOBREESCRIBIMOS)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.viajar();
		}

		for (SeleccionFutbol integrante : integrantes) {
			System.out.println(integrante.toString());
			if (integrante instanceof Futbolista) {
				((Futbolista) integrante).jugarPartido();
				((Futbolista) integrante).entrenar();
			}
			if (integrante instanceof Entrenador) {
				((Entrenador) integrante).dirigirPartido();
				((Entrenador) integrante).dirigirEntrenamiento();
			}
			if (integrante instanceof Masajista) {
				((Masajista) integrante).darMasaje();
			}
		}
	}
}
