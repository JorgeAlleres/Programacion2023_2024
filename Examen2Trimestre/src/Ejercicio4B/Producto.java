package Ejercicio4B;

public class Producto {

	int cantidad;
	float precio;

	Producto() {
		do {
			this.cantidad = (int) (Math.random() * 10);
			this.precio = (float) (Math.random() * 10);
		} while (this.cantidad == 0 || this.precio == 0);
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [cantidad=" + cantidad + ", precio=" + precio + "]";
	}

}
