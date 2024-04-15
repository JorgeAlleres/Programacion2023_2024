package Pedido;

public class testPedido {
	public static void main(String[] args) {

		Pedido uno = new Pedido("a ", "b ", "c ", "d ");
		System.out.println(uno.toString());

		Pedido dos = new Pedido("e ", "f ", "g ", "h ");
		System.out.println(dos.toString());
		
		Pedido tres = new Pedido("i ", "j ", "k ", "l ");
		System.out.println(tres.toString());
		
		uno.calcularPedido(1.4, 1.5);
		
		dos.calcularPedido(1.7, 2.3, 2.4);
		
		tres.calcularPedido(1.3, 2.3, 2.4, 2.7);
	}
}