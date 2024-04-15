package Ejercicio4B;

import java.util.ArrayList;

/*
 * /*
 * Utilizando la clase Producto un supermercado nos pide que hagamos
una pequeña aplicación que almacene los productos pasados por el
escaner de la caja central.
La aplicación debe almacenar Productos (crea la clase), cada
producto al crearse contiene una cantidad(entera), un precio
(flotante). Ambos dos generados aleatoriamente.
El nombre del producto será básico (producto1, producto2, producto3,
etc.).
Calcular el precio total de una lista de entre 1 y 6 productos
(aleatorio). Dichos productos serán almacenados en una lista
dinámica.
Mostrar un ticket con todo lo vendido y el precio final como se
hacen en los supermercados.
***********Cantidad****Precio*****Total
Producto1 5 3.5 17.5
Producto2 7 2.5 17.5
Precio 			35
iva 20% 		7
Total 			42
*/

public class testProducto {

	static double PORCENTAJE_IVA = 20;

	public static void main(String[] args) {
		int numProductos = (int) (Math.random() * 6);
		ArrayList<Producto> compra = new ArrayList<Producto>(numProductos);
		double costeProducto = 0, costeTotal = 0, iva, total;

		System.out.println("Nº de articulos: " + numProductos);
		System.out.println("Nombre" + "\t\t" + "Cantidad" + "\t" + "Precio" + "\t\t" + "Total");
		for (int i = 1; i <= numProductos; i++) {
			compra.add(new Producto());
			costeProducto = (double) (compra.get(i-1).getCantidad() * compra.get(i-1).getPrecio());
			System.out.println("Producto" + i + "\t\t" + compra.get(i-1).getCantidad() + "\t" + compra.get(i-1).getPrecio() + "\t"
					+ costeProducto);
			costeTotal += costeProducto;
		}
		iva = (costeTotal * PORCENTAJE_IVA) / 100;
		total = costeTotal + iva;
		System.out.println();
		System.out.println("\t\t\t" + "Precio: " + costeTotal);
		System.out.println("\t\t\t" + "IVA(" + PORCENTAJE_IVA + "%): " + iva);
		System.out.println("\t\t\t" + "Total: " + total);
	}
}
