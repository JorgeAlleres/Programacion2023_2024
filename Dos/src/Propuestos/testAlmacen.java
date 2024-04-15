package Propuestos;

public class testAlmacen {

	public static void main(String[] args) {
		System.out.println("Restaurante Israel");
		Almacen Israel = new Almacen(5,2);
		System.out.println("Almacén inicial");
		System.out.println(Israel.toString());
		
		System.out.println("Servicio de comidas");
		System.out.println("Comensales " + Israel.getComensales());
		
		System.out.println("Almacén restante");
		System.out.println(Israel.toString());
		
		System.out.println("Ir a la compra");
		Israel.irMercado(10, 6);
		System.out.println(Israel.toString());
	}
}
