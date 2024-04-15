package Pedido;

public class Pedido {

	// atributo
	String primero;
	String segundo;
	String bebida;
	String postre;

	// constructor
	public Pedido() {
		// TODO Auto-generated constructor stub
		primero = "";
		segundo = "";
		bebida = "";
		postre = "";
	}

	public Pedido(String primero, String segundo, String bebida, String postre) {
		super();
		this.primero = primero;
		this.segundo = segundo;
		this.bebida = bebida;
		this.postre = postre;
	}

	public void calcularPedido(double costoPrimero, double costoBebida) {
		double total = costoPrimero + costoBebida;
		System.out.println("El costo de " + this.primero + " y " + this.bebida + " es = $" + total);
	}

	public void calcularPedido(double costoPrimerPlato, double costoSegundoPlato, double costoBebida) {
		double total = costoPrimerPlato + costoSegundoPlato + costoBebida;
		System.out.println("El costo de " + this.primero + " + " + this.segundo + " + " + this.bebida + " es = $" + total);
	}

	public void calcularPedido(double costoPrimerPlato, double costoSegundoPlato, double costoPostre, double costoBebida) {
		double total = costoPrimerPlato + costoSegundoPlato + costoBebida + costoPostre;
		System.out.println("El costo de " + this.primero + " + " + this.segundo + " + " + this.bebida + " + " + this.postre + " es = $" + total);
	}

	
	@Override
	public String toString() {
		return "Pedido [primero=" + primero + ", segundo=" + segundo + ", bebida=" + bebida + ", postre=" + postre
				+ "]";
	}

}