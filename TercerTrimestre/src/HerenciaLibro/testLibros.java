package HerenciaLibro;

import java.util.ArrayList;
import java.util.Scanner;

import HerenciaLibro.Novela.Genero;

public class testLibros {

	// Precio aleatorio 0-10
	// Coleccion 1 libro, 2 libros de texto, 2 libros de texto UNC y 3 novelas
	// Calcula total menos el descuento introducido por consola

	public static float generaPrecio() {
		return (float) (1 + Math.random()*10);
	}
	
	public static void main(String[] args) {

		//Creo Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Descuento a realizar en %");
		float descuento = sc.nextFloat(); 
		
		
		//Creo la coleccion de libros
		ArrayList<Libro> Compra = new ArrayList<>();

		//Creo todos los libros 1 a 1 (Libros normales, de texto, universidad y novelas)
		Libro libro1 = new Libro("Libro", "Pepe", generaPrecio());
		LibroTexto libroT1 = new LibroTexto("LibroTexto1", "Cervantes", generaPrecio(), "PrimeroDAM");
		LibroTexto libroT2 = new LibroTexto("LibroTexto2", "Jorge", generaPrecio(), "SegundoDAM");
		LibroTextoUNC libroTUNC1 = new LibroTextoUNC("LibroTextoUNC1", "Miguel", generaPrecio(), "Primero Finanzas", "Cebem");
		LibroTextoUNC libroTUNC2 = new LibroTextoUNC("LibroTexto2UNC", "Nievecitas", generaPrecio(), "Segundo Finanzas", "USC");
		Novela novela1 = new Novela("Novela1", "Ana", generaPrecio(), Genero.AVENTURAS);
		Novela novela2 = new Novela("Novela2", "Roberto", generaPrecio(), Genero.POLICIACA);
		Novela novela3 = new Novela("Novela3", "David", generaPrecio(), Genero.REALISTA);
		
		//Inserto todos los tipos de libros en la lista
		Compra.add(libro1);
		Compra.add(libroT1);
		Compra.add(libroT2);
		Compra.add(libroTUNC1);
		Compra.add(libroTUNC2);
		Compra.add(novela1);
		Compra.add(novela2);
		Compra.add(novela3);

		//Inizializo el precio total de los libros sin descuento con valor float
		float precioLibros = 0f;
		
		//Sumo los libros al total de libros
		for (Libro l : Compra) {
			precioLibros+=l.getPrecio();
			System.out.println(l.toString());
		}

		float precioFinal = precioLibros - (descuento/100)*precioLibros;
		
		System.out.println("Total libros = " + precioLibros);
		System.out.println("Descuento del " + descuento + "% = " + (descuento/100)*precioLibros);
		System.out.println("Precio final = " + precioFinal);
		
	}
}
