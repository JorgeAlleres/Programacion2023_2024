package din;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import Coleccion.Disco;

public class ColeccionList {

	public static void guardarEnArchivo() {
		try {
			FileOutputStream fileOut = new FileOutputStream(NOMBRE_FICHERO);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			// Escribimos objetos en el flujo de salida
			objectOut.writeObject(discos);

			objectOut.close();
			fileOut.close();
			System.out.println("Discos guardados en archivo correctamente.");
		} catch (IOException e) {
			System.out.println("Error al guardar en archivo: " + e.getMessage());
		}
	}

	public static void cargarDesdeArchivo() {
		try {
			FileInputStream fileIn = new FileInputStream(NOMBRE_FICHERO);
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			// Casteamos la colección a obtener
			discos = (ArrayList<Disco>) objectIn.readObject();

			objectIn.close();
			fileIn.close();
			System.out.println("Discos cargados desde archivo correctamente.");
		} catch (IOException | ClassNotFoundException cagada) {
			System.out.println("Error al cargar desde archivo: " + cagada.getMessage());
		}

	}

	public static int dimeIndiceDeCodigo(String codigoIn) {

		int index = -1;
		for (int i = 0; i < discos.size(); i++) {
			if (((discos.get(i)).getCodigo()).equals(codigoIn)) {
				index = i;
			}
		}
		return index;

	}

	static ArrayList<Disco> discos = new ArrayList<Disco>();

	public static final String NOMBRE_FICHERO = "MisDiscos.obj";

	public static void main(String[] args) {

		// Carga varios discos
		discos.add(new Disco("GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50));
		discos.add(new Disco("FGHQ64", "Metallica", "Black album", "hard rock", 46));
		discos.add(new Disco("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42));

		int opcion;
		Scanner s = new Scanner(System.in);
		String codigoIntroducido;
		String autorIntroducido;
		String tituloIntroducido;
		String generoIntroducido;
		int duracionIntroducida;

		do {
			System.out.println("\nCOLECCIÓN DE DISCOS");
			System.out.println("===================");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo disco");
			System.out.println("3. Modificar");
			System.out.println("	3.1. Modificar el Código");
			System.out.println("	3.2. Modificar los Datos");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");
			System.out.println("6. Guardar en un fichero");
			System.out.println("7. Cargar desde un fichero");
			System.out.print("Introduzca una opción: ");
			opcion = Integer.parseInt(s.nextLine());

			switch (opcion) {
			case 1:
				System.out.println("\nLISTADO");
				System.out.println("=======");

				for (Disco d : discos) {
					System.out.println(d);
				}

				break;

			case 2:
				System.out.println("\nNUEVO DISCO");
				System.out.println("===========");

				System.out.println("Por favor, introduzca los datos del disco: ");
				System.out.println("Código: ");
				codigoIntroducido = s.nextLine();

				if (dimeIndiceDeCodigo(codigoIntroducido) == -1) {
					System.out.print("Autor: ");
					autorIntroducido = s.nextLine();
					System.out.print("Título: ");
					tituloIntroducido = s.nextLine();
					System.out.print("Género: ");
					generoIntroducido = s.nextLine();
					System.out.print("Duración: ");
					duracionIntroducida = Integer.parseInt(s.nextLine());
					discos.add(new Disco(codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido,
							duracionIntroducida));
					System.out.println("Album añadido con código: " + codigoIntroducido);
				} else {
					System.out.println("Código no disponible");
				}

				break;

			case 3:
				System.out.println("\nMODIFICAR");
				System.out.println("===========");
				System.out.println("1. Modificar el Código");
				System.out.println("2. Modificar los Datos");
				System.out.print("Introduzca una opción: ");
				opcion = Integer.parseInt(s.nextLine());
				switch (opcion) {
				case 1:
					System.out.println("\nModificar el Código");
					System.out.println("=======");

					System.out.println(
							"Por favor, introduzca el código del disco que desea modificar  o INTRO para dejarlo igual: ");
					codigoIntroducido = s.nextLine();

					if (dimeIndiceDeCodigo(codigoIntroducido) != -1) {
						int index = dimeIndiceDeCodigo(codigoIntroducido);
						Disco mod = discos.get(index);
						System.out.println("Introduzca el nuevo código");
						System.out.println("Código: " + mod.getCodigo());
						System.out.println("Nuevo código: ");
						codigoIntroducido = s.nextLine();
						if (!codigoIntroducido.equals(""))
							mod.setCodigo(codigoIntroducido);
						discos.set(index, mod);
						System.out.println("Album modificado con código: " + codigoIntroducido);
					} else {
						System.out.println("Código no encontrado");
					}

					break;

				case 2:
					System.out.println("\nModificar los Datos");
					System.out.println("===========");

					System.out.println("Por favor, introduzca el código del disco a modificar: ");
					codigoIntroducido = s.nextLine();

					if (dimeIndiceDeCodigo(codigoIntroducido) != -1) {
						int index = dimeIndiceDeCodigo(codigoIntroducido);
						Disco mod = discos.get(index);
						System.out.println("Introduzca los nuevos datos o INTRO para dejarlos igual");
						// El cambio de código ya veremos
						System.out.println("Autor: " + mod.getAutor());
						System.out.println("Nuevo autor: ");
						autorIntroducido = s.nextLine();
						if (!autorIntroducido.equals(""))
							mod.setAutor(autorIntroducido);
						System.out.println("Título: " + mod.getTitulo());
						System.out.println("Nuevo título: ");
						tituloIntroducido = s.nextLine();
						if (!tituloIntroducido.equals(""))
							mod.setTitulo(tituloIntroducido);
						System.out.println("Género: " + mod.getGenero());
						System.out.println("Nuevo género: ");
						generoIntroducido = s.nextLine();
						if (!generoIntroducido.equals(""))
							mod.setGenero(generoIntroducido);
						System.out.println("Duración: " + mod.getDuracion());
						System.out.println("Nueva duración: ");
						final String duracionIntroducidaString = s.nextLine();
						if (!duracionIntroducidaString.equals(""))
							mod.setDuracion(Integer.parseInt(duracionIntroducidaString));
						discos.set(index, mod);
						System.out.println("Album modificado con código: " + codigoIntroducido);
					} else {
						System.out.println("Código no encontrado");
					}
					break;
				default:
				}

			case 4:
				System.out.println("\nBORRAR");
				System.out.println("======");

				System.out.println("Introduza el codigo del disco que desea borrar: ");
				codigoIntroducido = s.nextLine();

				if (dimeIndiceDeCodigo(codigoIntroducido) != -1) {
					discos.remove(dimeIndiceDeCodigo(codigoIntroducido));
					System.out.println("Album Borrado");
				} else {
					System.out.println("Código no encontrado");
				}

				break;

			case 6:
				System.out.println("\nGuardar en fichero externo");
				System.out.println("======");
				guardarEnArchivo();

				break;

			case 7:
				System.out.println("\nCargar desde fichero externo");
				System.out.println("======");
				cargarDesdeArchivo();

				break;
			default:

			}

		} while (opcion != 5);
	}
}
