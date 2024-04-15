package Tienda;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio13 {

	/*static Scanner s = new Scanner(System.in);

	static ArrayList<Articulo> articulos = new ArrayList<Articulo>();

	public static void main(String[] args) {

		int opcion;
		int stockIn;
		double precioDeCompraIn;
		double precioDeVentaIn;
		String codigo;
		String codigoIn = "";
		String descripcionIn;

		// MENU ///////////////////////////////////////////////////////////////////
		do {
			pintaTitulo("G E S T E S I M A L");
			System.out.println("1. Listado");
			System.out.println("2. Alta");
			System.out.println("3. Baja");
			System.out.println("4. Modificación");
			System.out.println("5. Entrada de mercancía");
			System.out.println("6. Salida de mercancía");
			System.out.println("7. Salir");
			System.out.print("Introduzca una opción: ");
			opcion = Integer.parseInt(s.nextLine());

			switch (opcion) {

			// LISTADO ////////////////////////////////////////////////////////////
			case 1:
				pintaTitulo("LISTADO");

				for (Articulo a : articulos) {
					System.out.println(a);
				}

				break;

			// ALTA ///////////////////////////////////////////////////////////////
			case 2:
				pintaTitulo("NUEVO ARTÍCULO");

				/*
				 * if (primeraPosicionLibre() == N) {
				 * System.out.println("Lo siento, la base de datos está llena."); } else {
				 * 
				 * // Introducción de datos
				 * System.out.println("Por favor, introduzca los datos del artículo.");
				 * System.out.print("Código: ");
				 * 
				 * // Comprueba que el código introducido no se repita do { codigoIn =
				 * s.nextLine(); if (existeCodigo(codigoIn)) {
				 * System.out.println("Ese código ya existe en la base de datos.");
				 * System.out.print("Introduzca otro código: "); } } while
				 * (existeCodigo(codigoIn));
				 

				codigoIn = peticionCodigo(codigoIn);
				
				System.out.println("DATOS DEL NUEVO ARTÍCULO");
				System.out.println("Codigo valido: " + codigoIn);

				System.out.print("Descripcion: ");
				descripcionIn = s.nextLine();
				System.out.print("Precio de compra: ");
				precioDeCompraIn = Double.parseDouble(s.nextLine());
				System.out.print("Precio de venta: ");
				precioDeVentaIn = Double.parseDouble(s.nextLine());
				System.out.print("Stock: ");
				stockIn = Integer.parseInt(s.nextLine());

				// Crea el nuevo artículo
				articulos.add(new Articulo(codigoIn, descripcionIn, precioDeCompraIn,
						precioDeVentaIn, stockIn));
				// }
				break;

			// BAJA ///////////////////////////////////////////////////////////////
			case 3:
				pintaTitulo("BAJA");

				System.out.print("Por favor, introduzca el código del artículo: ");
				codigoIn = s.nextLine();

				if (!existeCodigo(codigoIn)) {
					System.out.println("Lo siento, el código introducido no existe.");
				} else {
					articulos[posicionConCodigo(codigoIn)].setCodigo("LIBRE");
					System.out.println("Artículo borrado.");
				}

				break;

			// MODIFICACIÓN ///////////////////////////////////////////////////////
			case 4:
				pintaTitulo("MODIFICACIÓN");

				System.out.print("Por favor, introduzca el código del artículo: ");
				codigoIn = s.nextLine();

				if (!existeCodigo(codigoIn)) {
					System.out.println("Lo siento, el código introducido no existe.");
				} else {
					System.out.print("Introduzca los nuevos datos del artículo");
					System.out.println(" o INTRO para dejarlos igual.");

					int i = posicionConCodigo(codigoIn);

					System.out.println("Código: " + articulos[i].getCodigo());
					System.out.print("Nuevo código: ");
					codigoIn = s.nextLine();
					if (!codigoIn.equals("")) {
						articulos[i].setCodigo(codigoIn);
					}

					System.out.println("Descripción: " + articulos[i].getDescripcion());
					System.out.print("Nueva descripción: ");
					descripcionIn = s.nextLine();
					if (!descripcionIn.equals("")) {
						articulos[i].setDescripcion(descripcionIn);
					}

					System.out.println("Precio de compra: " + articulos[i].getPrecioDeCompra());
					System.out.print("Nuevo precio de compra: ");
					String precioDeCompraIntroducidoString = s.nextLine();
					if (!precioDeCompraIntroducidoString.equals("")) {
						articulos[i].setPrecioDeCompra(Double.parseDouble(precioDeCompraIntroducidoString));
					}
					System.out.println("Precio de venta: " + articulos[i].getPrecioDeVenta());
					System.out.print("Nuevo precio de venta: ");
					String precioDeVentaIntroducidoString = s.nextLine();
					if (!precioDeVentaIntroducidoString.equals("")) {
						articulos[i].setPrecioDeVenta(Double.parseDouble(precioDeVentaIntroducidoString));
					}
					System.out.println("Stock: " + articulos[i].getStock());
					System.out.print("Nuevo stock: ");
					String stockIntroducidoString = s.nextLine();
					if (!stockIntroducidoString.equals("")) {
						articulos[i].setStock(Integer.parseInt(stockIntroducidoString));
					}
				}

				break;

			// ENTRADA DE MERCANCÍA /////////////////////////////////////////////
			case 5:
				pintaTitulo("ENTRADA DE MERCANCÍA");

				System.out.print("Por favor, introduzca el código del artículo: ");
				codigoIn = s.nextLine();

				if (!existeCodigo(codigoIn)) {
					System.out.println("Lo siento, el código introducido no existe.");
				} else {
					int i = posicionConCodigo(codigoIn);
					System.out.println("Entrada de mercancía del siguiente artículo: ");
					System.out.println(articulos[i]);
					System.out.print("Introduzca el número de unidades que entran: ");
					String stockIntroducidoString = s.nextLine();
					articulos[i].setStock(Integer.parseInt(stockIntroducidoString) + articulos[i].getStock());
					System.out.println("La mercancía ha entrado en el almacén.");
				}

				break;

			// SALIDA DE MERCANCÍA ////////////////////////////////////////////
			case 6:
				pintaTitulo("SALIDA DE MERCANCÍA");

				System.out.print("Por favor, introduzca el código del artículo: ");
				codigoIn = s.nextLine();

				if (!existeCodigo(codigoIn)) {
					System.out.println("Lo siento, el código introducido no existe.");
				} else {
					int i = posicionConCodigo(codigoIn);
					System.out.println("Salida de mercancía del siguiente artículo: ");
					System.out.println(articulos[i]);
					System.out.print("Introduzca el número de unidades que desea sacar del almacén: ");
					stockIn = Integer.parseInt(s.nextLine());
					if (articulos[i].getStock() - stockIn > 0) {
						articulos[i].setStock(articulos[i].getStock() - stockIn);
						System.out.println("La mercancía ha salido del almacén.");
					} else {
						System.out.println("Lo siento, no se pueden sacar tantas unidades.");
					}
				}

				break;
			} // switch
		} while (opcion != 7);
	}

	// FUNCIONES ////////////////////////////////////////////////////////////////

	/**
	 * Busca la primera posición libre del array. Si no quedan huecos, devuelve -1.
	 * 
	 * @return primera posición libre del array o -1 si no quedan huecos
	 */
	/*
	 * public static int primeraPosicionLibre() { for (int i = 0; i <
	 * articulos.length; i++) { if (articulos[i].getCodigo().equals("LIBRE")) {
	 * return i; } } return -1; }
	 *

	/**
	 * Dice si existe o no un artículo con un determinado código.
	 * 
	 * @return true si existe el código y false si no existe
	 *
	public static boolean existeCodigo(String codigo) {
		for (Articulo a : articulos) {
			if (a.getCodigo().equals(codigo)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Pinta un título con subrayado.
	 */
	public static void pintaTitulo(String titulo) {
		System.out.println("\n" + titulo);
		for (int i = 0; i < titulo.length(); i++) {
			System.out.print("=");
		}
		System.out.println();
	}

	/**
	 * Devuelve la posición dentro del array en la que se encuentra un artículo con
	 * un determinado código. Si el código no se encuentra, devuelve -1.
	 * 
	 * @return posición dentro del array en la que se encuentra un artículo
	 *
	public static int posicionConCodigo(String codigo) {
		for (int i = 0; i < articulos.length; i++) {
			if (articulos[i].getCodigo().equals(codigo)) {
				return i;
			}
		}
		return -1;
	}

	public static String peticionCodigo(String codigo) {
		String codigoIn;
		System.out.println("Por favor, introduzca los datos del artículo.");
		System.out.print("Código: ");

		// Comprueba que el código introducido no se repita
		do {
			codigoIn = s.nextLine();
			if (existeCodigo(codigoIn)) {
				System.out.println("Ese código ya existe en la base de datos.");
				System.out.print("Introduzca otro código: ");
			}
		} while (existeCodigo(codigoIn));
		return codigoIn;
	}
*/
}
